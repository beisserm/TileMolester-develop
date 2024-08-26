/*
*
*    Copyright (C) 2003 Kent Hansen.
*
*    This file is part of Tile Molester.
*
*    Tile Molester is free software; you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation; either version 2 of the License, or
*    (at your option) any later version.
*
*    Tile Molester is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*/

package tm.utils;

import java.util.ResourceBundle;
import java.util.Locale;

/*
 * This class provides a simple way to translate strings in the application.
 */
public class Xlator {

    private ResourceBundle rb;

    public Xlator(String baseName, Locale locale) throws Exception {
        rb = null;
        try {
            rb = ResourceBundle.getBundle(baseName, locale);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Translate a string to a different language. If the input key is not found the
     * lookup key is returned.
     * 
     * @param key input key
     * @return translated string
     */
    public String xlate(String key) {
        try {
            String value = rb.getString(key);
            return value;
        } catch (Exception e) {
            return key;
        }
    }
}