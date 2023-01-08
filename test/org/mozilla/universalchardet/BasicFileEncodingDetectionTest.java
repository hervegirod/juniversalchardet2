package org.mozilla.universalchardet;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class BasicFileEncodingDetectionTest {

   public BasicFileEncodingDetectionTest() throws IOException {
      super();
   }

   @Test
   public void testASCII() throws IOException {
      Assert.assertEquals("US-ASCII", FileResourceUtils.getFileEncoding("ascii.txt"));
   }

   @Test
   public void testUTF8() throws IOException {
      Assert.assertEquals("UTF-8", FileResourceUtils.getFileEncoding("utf8.txt"));
   }

   @Test
   public void testUTF8N() throws IOException {
      Assert.assertEquals("UTF-8", FileResourceUtils.getFileEncoding("utf8n.txt"));
   }

   @Test
   public void testUTF16LE() throws IOException {
      Assert.assertEquals("UTF-16LE", FileResourceUtils.getFileEncoding("utf16le.txt"));
   }

   @Test
   public void testShifJis() throws IOException {
      Assert.assertEquals("SHIFT_JIS", FileResourceUtils.getFileEncoding("shiftjis.txt"));
   }

   @Test
   public void testEUC() throws IOException {
      Assert.assertEquals("EUC-JP", FileResourceUtils.getFileEncoding("euc.txt"));
   }

   @Test
   public void testISO2022JP() throws IOException {
      Assert.assertEquals("ISO-2022-JP", FileResourceUtils.getFileEncoding("iso2022jp.txt"));
   }

   @Test
   public void testBIG5() throws IOException {
      Assert.assertEquals("BIG5", FileResourceUtils.getFileEncoding("big5.txt"));
   }

   @Test
   public void testEUCTW() throws IOException {
      Assert.assertEquals("EUC-TW", FileResourceUtils.getFileEncoding("euctw.txt"));
   }

   @Test
   public void testEUCKR() throws IOException {
      Assert.assertEquals("EUC-KR", FileResourceUtils.getFileEncoding("euckr.txt"));
   }

   @Test
   public void testWindows1255() throws IOException {
      Assert.assertEquals("WINDOWS-1255", FileResourceUtils.getFileEncoding("windows1255.txt"));
   }

   @Test
   public void testUTF8Emoji() throws IOException {
      Assert.assertEquals("UTF-8", FileResourceUtils.getFileEncoding("utf8n-emoji.txt"));
   }

}
