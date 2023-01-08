package org.mozilla.universalchardet;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class BOMTest {

   private static final String TEST_STRING
      = "========================================================================";

   @Test
   public void testUTF8() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getFirstLine("utf8.txt"));
   }

   @Test
   public void testUTF8N() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getFirstLine("utf8n.txt"));
   }

   @Test
   public void testUTF16LE() throws IOException {
      Assert.assertEquals(TEST_STRING, FileResourceUtils.getFirstLine("utf16le.txt"));
   }
}
