package org.mozilla.universalchardet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.nio.charset.Charset;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @since 0.1
 */
public class ChardetConstantsTest {

   public ChardetConstantsTest() {
   }

   @BeforeClass
   public static void setUpClass() {
   }

   @AfterClass
   public static void tearDownClass() {
   }

   @Before
   public void setUp() {
   }

   @After
   public void tearDown() {
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetBig5() {
      System.out.println("ChardetConstantsTest : testGetCharsetBig5");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_BIG5);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "Big5", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetEUC_JP() {
      System.out.println("ChardetConstantsTest : testGetCharsetEUC_JP");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_EUC_JP);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "EUC-JP", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetEUC_KR() {
      System.out.println("ChardetConstantsTest : testGetCharsetEUC_KR");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_EUC_KR);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "EUC-KR", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetGB18030() {
      System.out.println("ChardetConstantsTest : testGetCharsetGB18030");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_GB18030);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "GB18030", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetGBK() {
      System.out.println("ChardetConstantsTest : testGetCharsetGBK");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_GBK);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "GBK", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetIBM855() {
      System.out.println("ChardetConstantsTest : testGetCharsetIBM855");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_IBM855);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "IBM855", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetIBM866() {
      System.out.println("ChardetConstantsTest : testGetCharsetIBM866");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_IBM866);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "IBM866", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetISO_2022_CN() {
      System.out.println("ChardetConstantsTest : testGetCharsetISO_2022_CN");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_ISO_2022_CN);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "ISO-2022-CN", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetISO_2022_JP() {
      System.out.println("ChardetConstantsTest : testGetCharsetEUC_JP");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_ISO_2022_JP);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "ISO-2022-JP", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetISO_2022_KR() {
      System.out.println("ChardetConstantsTest : testGetCharsetISO_2022_KR");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_ISO_2022_KR);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "ISO-2022-KR", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetISO_8859_5() {
      System.out.println("ChardetConstantsTest : testGetCharsetISO_8859_5");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_ISO_8859_5);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "ISO-8859-5", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetISO_8859_7() {
      System.out.println("ChardetConstantsTest : testGetCharsetISO_8859_7");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_ISO_8859_7);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "ISO-8859-7", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetISO_8859_8() {
      System.out.println("ChardetConstantsTest : testGetCharsetISO_8859_8");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_ISO_8859_8);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "ISO-8859-8", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetKOI8_R() {
      System.out.println("ChardetConstantsTest : testGetCharsetKOI8_R");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_KOI8_R);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "KOI8-R", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetMACCYRILLIC() {
      System.out.println("ChardetConstantsTest : testGetCharsetMACCYRILLIC");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_MACCYRILLIC);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "x-MacCyrillic", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetSHIFT_JIS() {
      System.out.println("ChardetConstantsTest : testGetCharsetSHIFT_JIS");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_SHIFT_JIS);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "Shift_JIS", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetUS_ASCII() {
      System.out.println("ChardetConstantsTest : testGetCharsetUS_ASCII");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_US_ASCII);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "US-ASCII", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetUTF_16BE() {
      System.out.println("ChardetConstantsTest : testGetCharsetUTF_16BE");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_UTF_16BE);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "UTF-16BE", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetUTF_16LE() {
      System.out.println("ChardetConstantsTest : testGetCharsetUTF_16LE");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_UTF_16LE);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "UTF-16LE", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetUTF_32BE() {
      System.out.println("ChardetConstantsTest : testGetCharsetUTF_32BE");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_UTF_32BE);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "UTF-32BE", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetUTF_32LE() {
      System.out.println("ChardetConstantsTest : testGetCharsetUTF_32LE");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_UTF_32LE);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "UTF-32LE", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetUTF_8() {
      System.out.println("ChardetConstantsTest : testGetCharsetUTF_8");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_UTF_8);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "UTF-8", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetWINDOWS_1251() {
      System.out.println("ChardetConstantsTest : testGetCharsetWINDOWS_1251");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_WINDOWS_1251);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "windows-1251", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetWINDOWS_1252() {
      System.out.println("ChardetConstantsTest : testGetCharsetWINDOWS_1252");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_WINDOWS_1252);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "windows-1252", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetWINDOWS_1253() {
      System.out.println("ChardetConstantsTest : testGetCharsetWINDOWS_1253");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_WINDOWS_1253);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "windows-1253", charset.name());
   }

   /**
    * Test of getCharset method, of class ChardetConstants.
    */
   @Test
   public void testGetCharsetWINDOWS_1255() {
      System.out.println("ChardetConstantsTest : testGetCharsetWINDOWS_1255");
      Charset charset = ChardetConstants.getCharset(ChardetConstants.CHARSET_WINDOWS_1255);
      assertNotNull("Charset must not be null", charset);
      assertEquals("Charset name", "windows-1255", charset.name());
   }

}
