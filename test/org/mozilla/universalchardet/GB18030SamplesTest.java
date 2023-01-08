package org.mozilla.universalchardet;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class GB18030SamplesTest {

   public GB18030SamplesTest() {
      super();
   }

   @Test
   public void testGB18030Sample() throws IOException {
      Assert.assertEquals("GB18030", FileResourceUtils.getFileEncoding("gb2312-sample.txt"));
   }

   @Test
   public void testGBKSample() throws IOException {
      Assert.assertEquals("GB18030", FileResourceUtils.getFileEncoding("gbk-sample.txt"));
   }

}
