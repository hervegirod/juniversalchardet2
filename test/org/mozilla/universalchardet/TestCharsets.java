/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mozilla.universalchardet;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Herve
 */
public class TestCharsets {
   public static void main(String[] args) {
      Map<String, Charset> map = Charset.availableCharsets();
      Iterator<Entry<String, Charset>> it = map.entrySet().iterator();
      while (it.hasNext()) {
         Entry<String, Charset> entry = it.next();
         System.out.println(entry.getKey());
      }
   }
}
