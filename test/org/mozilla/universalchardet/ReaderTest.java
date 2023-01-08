package org.mozilla.universalchardet;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class ReaderTest {

   private static final String TEST_STRING
      = "    コンソール アプリケーション : universalchardet プロジェクトの概要";

   @Test
   public void testUTF8() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getSecondLine("utf8.txt"));
   }

   @Test
   public void testUTF8N() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getSecondLine("utf8n.txt"));
   }

   @Test
   public void testUTF16LE() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getSecondLine("utf16le.txt"));
   }

   @Test
   public void testShifJis() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getSecondLine("shiftjis.txt"));
   }

   @Test
   public void testEUC() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getSecondLine("euc.txt"));
   }

   @Test
   public void testISO2022JP() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getSecondLine("iso2022jp.txt"));
   }

}
