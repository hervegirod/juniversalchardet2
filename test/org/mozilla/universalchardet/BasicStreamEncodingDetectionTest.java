package org.mozilla.universalchardet;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class BasicStreamEncodingDetectionTest {
   @Test
   public void testUTF8() throws IOException {
      Assert.assertEquals("UTF-8", FileResourceUtils.getFileEncoding2("utf8.txt"));
   }

   @Test
   public void testUTF8N() throws IOException {
      Assert.assertEquals("UTF-8", FileResourceUtils.getFileEncoding2("utf8n.txt"));
   }

   @Test
   public void testUTF16LE() throws IOException {
      Assert.assertEquals("UTF-16LE", FileResourceUtils.getFileEncoding2("utf16le.txt"));
   }

   @Test
   public void testShifJis() throws IOException {
      Assert.assertEquals("SHIFT_JIS", FileResourceUtils.getFileEncoding2("shiftjis.txt"));
   }

   @Test
   public void testEUC() throws IOException {
      Assert.assertEquals("EUC-JP", FileResourceUtils.getFileEncoding2("euc.txt"));
   }

   @Test
   public void testISO2022JP() throws IOException {
      Assert.assertEquals("ISO-2022-JP", FileResourceUtils.getFileEncoding2("iso2022jp.txt"));
   }

   @Test
   public void testBIG5() throws IOException {
      Assert.assertEquals("BIG5", FileResourceUtils.getFileEncoding2("big5.txt"));
   }

   @Test
   public void testEUCTW() throws IOException {
      Assert.assertEquals("EUC-TW", FileResourceUtils.getFileEncoding2("euctw.txt"));
   }

   @Test
   public void testEUCKR() throws IOException {
      Assert.assertEquals("EUC-KR", FileResourceUtils.getFileEncoding2("euckr.txt"));
   }

   @Test
   public void testWindows1255() throws IOException {
      Assert.assertEquals("WINDOWS-1255", FileResourceUtils.getFileEncoding2("windows1255.txt"));
   }

   @Test
   public void testUTF8Emoji() throws IOException {
      Assert.assertEquals("UTF-8", FileResourceUtils.getFileEncoding2("utf8n-emoji.txt"));
   }

}
