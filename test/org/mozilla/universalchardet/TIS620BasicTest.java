package org.mozilla.universalchardet;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class TIS620BasicTest {

   @Test
   public void testTIS620() throws IOException {
      Assert.assertEquals("TIS620", FileResourceUtils.getFileEncoding("tis620.txt"));
   }

}
