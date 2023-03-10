/*

(C) Copyright 2016-2017 Alberto Fernández <infjaf@gmail.com>
(C) Copyright 2007 Kohei TAKETA <k-tak@void.in> (Java port)

The contents of this file are subject to the Mozilla Public License Version
1.1 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at
http://www.mozilla.org/MPL/

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the
License.

Alternatively, the contents of this file may be used under the terms of
either the GNU General Public License Version 2 or later (the "GPL"), or
the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
in which case the provisions of the GPL or the LGPL are applicable instead
of those above. If you wish to allow use of your version of this file only
under the terms of either the GPL or the LGPL, and not to allow others to
use your version of this file under the terms of the MPL, indicate your
decision by deleting the provisions above and replace them with the notice
and other provisions required by the GPL or the LGPL. If you do not delete
the provisions above, a recipient may use your version of this file under
the terms of any one of the MPL, the GPL or the LGPL.

 */
package org.mozilla.universalchardet;

import java.nio.charset.Charset;

public interface ChardetConstants {
   public static String CHARSET_ISO_2022_JP = "ISO-2022-JP";
   public static String CHARSET_ISO_2022_CN = "ISO-2022-CN";
   public static String CHARSET_ISO_2022_KR = "ISO-2022-KR";
   public static String CHARSET_ISO_8859_5 = "ISO-8859-5";
   public static String CHARSET_ISO_8859_7 = "ISO-8859-7";
   public static String CHARSET_ISO_8859_8 = "ISO-8859-8";
   public static String CHARSET_BIG5 = "BIG5";
   public static String CHARSET_GB18030 = "GB18030";
   public static String CHARSET_EUC_JP = "EUC-JP";
   public static String CHARSET_EUC_KR = "EUC-KR";
   public static String CHARSET_EUC_TW = "EUC-TW";
   public static String CHARSET_SHIFT_JIS = "SHIFT_JIS";
   public static String CHARSET_IBM855 = "IBM855";
   public static String CHARSET_IBM866 = "IBM866";
   public static String CHARSET_KOI8_R = "KOI8-R";
   public static String CHARSET_MACCYRILLIC = "MACCYRILLIC";
   public static String CHARSET_WINDOWS_1251 = "WINDOWS-1251";
   public static String CHARSET_WINDOWS_1252 = "WINDOWS-1252";
   public static String CHARSET_WINDOWS_1253 = "WINDOWS-1253";
   public static String CHARSET_WINDOWS_1255 = "WINDOWS-1255";
   public static String CHARSET_UTF_8 = "UTF-8";
   public static String CHARSET_UTF_16BE = "UTF-16BE";
   public static String CHARSET_UTF_16LE = "UTF-16LE";
   public static String CHARSET_UTF_32BE = "UTF-32BE";
   public static String CHARSET_UTF_32LE = "UTF-32LE";
   public static String CHARSET_TIS620 = "TIS620";

   /**
    * @deprecated Mispelled, you shoud use {@link #CHARSET_US_ASCII}
    */
   @Deprecated
   public static String CHARSET_US_ASCCI = "US-ASCII";
   public static String CHARSET_US_ASCII = "US-ASCII";

   public static String CHARSET_GBK = "GBK";

   // WARNING: Listed below are charsets which Java does not support.
   public static String CHARSET_HZ_GB_2312 = "HZ-GB-2312"; // Simplified Chinese
   public static String CHARSET_X_ISO_10646_UCS_4_3412 = "X-ISO-10646-UCS-4-3412"; // Malformed UTF-32
   public static String CHARSET_X_ISO_10646_UCS_4_2143 = "X-ISO-10646-UCS-4-2143"; // Malformed UTF-32

   /**
    * Return the Charset for a constant Charset name.
    *
    * @param constantName the constant name
    * @return the Charset
    */
   public static Charset getCharset(String constantName) {
      switch (constantName) {
         case CHARSET_ISO_2022_JP:
            return Charset.forName(CHARSET_ISO_2022_JP);
         case CHARSET_ISO_2022_CN:
            return Charset.forName(CHARSET_ISO_2022_CN);
         case CHARSET_ISO_2022_KR:
            return Charset.forName(CHARSET_ISO_2022_KR);
         case CHARSET_ISO_8859_5:
            return Charset.forName(CHARSET_ISO_8859_5);
         case CHARSET_ISO_8859_7:
            return Charset.forName(CHARSET_ISO_8859_7);
         case CHARSET_ISO_8859_8:
            return Charset.forName(CHARSET_ISO_8859_8);
         case CHARSET_BIG5:
            return Charset.forName("Big5");
         case CHARSET_GB18030:
            return Charset.forName(CHARSET_GB18030);
         case CHARSET_EUC_JP:
            return Charset.forName(CHARSET_EUC_JP);
         case CHARSET_EUC_KR:
            return Charset.forName(CHARSET_EUC_KR);
         case CHARSET_SHIFT_JIS:
            return Charset.forName("Shift_JIS");
         case CHARSET_IBM855:
            return Charset.forName(CHARSET_IBM855);
         case CHARSET_IBM866:
            return Charset.forName(CHARSET_IBM866);
         case CHARSET_KOI8_R:
            return Charset.forName(CHARSET_KOI8_R);
         case CHARSET_MACCYRILLIC:
            return Charset.forName("x-MacCyrillic");
         case CHARSET_WINDOWS_1251:
            return Charset.forName("windows-1251");
         case CHARSET_WINDOWS_1252:
            return Charset.forName("windows-1252");
         case CHARSET_WINDOWS_1253:
            return Charset.forName("windows-1253");
         case CHARSET_WINDOWS_1255:
            return Charset.forName("windows-1255");
         case CHARSET_UTF_8:
            return Charset.forName(CHARSET_UTF_8);
         case CHARSET_UTF_16BE:
            return Charset.forName(CHARSET_UTF_16BE);
         case CHARSET_UTF_16LE:
            return Charset.forName(CHARSET_UTF_16LE);
         case CHARSET_UTF_32BE:
            return Charset.forName(CHARSET_UTF_32BE);
         case CHARSET_UTF_32LE:
            return Charset.forName(CHARSET_UTF_32LE);
         case CHARSET_TIS620:
            return Charset.forName(CHARSET_TIS620);
         case CHARSET_US_ASCII:
            return Charset.forName(CHARSET_US_ASCII);
         case CHARSET_GBK:
            return Charset.forName(CHARSET_GBK);
         case CHARSET_HZ_GB_2312:
            return Charset.forName("GB2312");

         default:
            return null;
      }
   }
}
