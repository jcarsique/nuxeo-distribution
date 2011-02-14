/*
 * (C) Copyright 2006-2008 Nuxeo SAS (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     tdelprat
 *
 * $Id$
 */
package org.nuxeo.wizard.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Simple RegExp based Number validator
 *
 * @author Tiry (tdelprat@nuxeo.com)
 *
 */
public class NumberValidator {

    private static Pattern pattern;
    private static Matcher matcher;

    private static final String NUMBER_PATTERN =
        "^(\\d)+$";

    public static synchronized boolean validate(String ip){
        if (pattern == null) {
            pattern = Pattern.compile(NUMBER_PATTERN);
        }
      matcher = pattern.matcher(ip);
      return matcher.matches();
    }
}
