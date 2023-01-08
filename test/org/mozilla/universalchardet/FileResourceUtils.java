/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mozilla.universalchardet;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import org.junit.Assert;

/**
 *
 * @author Herve
 */
public class FileResourceUtils {
   private FileResourceUtils() {
   }

   public static File getFile(String name) {
      URL url = FileResourceUtils.class.getResource("resources/" + name);
      return new File(url.getFile());
   }

   public static String getFirstLine(String testFileName) throws IOException {
      File file = getFile(testFileName);
      try (BufferedReader reader = ReaderFactory.createBufferedReader(file)) {
         // return first line
         return reader.readLine();
      }
   }

   public static String getSecondLine(String testFileName) throws IOException {
      File file = getFile(testFileName);
      try (BufferedReader reader = ReaderFactory.createBufferedReader(file)) {
         // Skip first line
         reader.readLine();
         // return second line
         return reader.readLine();
      }
   }

   public static String getFileEncoding(String testFileName) throws IOException {
      File file = getFile(testFileName);
      return UniversalDetector.detectCharsetEnum(file);
   }

   public static String getFileEncoding2(String testFileName) throws IOException {
      File file = getFile(testFileName);
      EncodingDetectorInputStream edis = null;
      EncodingDetectorOutputStream edos = null;
      try {
         edis = new EncodingDetectorInputStream(new BufferedInputStream(Files.newInputStream(file.toPath())));
         edos = new EncodingDetectorOutputStream(NullOutputStream.NULL_OUTPUT_STREAM);
         byte[] buffer = new byte[1024];
         int read = 0;
         while ((read = edis.read(buffer)) > 0) {
            edos.write(buffer, 0, read);
         }
      } finally {
         edos.close();
         edis.close();
      }
      String encodingRead = edis.getDetectedCharset();
      String encodingWrite = edos.getDetectedCharset();
      Assert.assertNotNull(encodingRead);
      Assert.assertNotNull(encodingWrite);
      Assert.assertTrue(encodingRead.equals(encodingWrite));
      return encodingRead;

   }
}
