/*
 * Solo - A small and beautiful blogging system written in Java.
 * Copyright (c) 2010-2018, b3log.org & hacpai.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.b3log.solo.util;

import org.b3log.latke.util.CollectionUtils;
import org.json.JSONObject;

/**
 * JSON utilities.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.0, Jul 16, 2017
 * @since 2.3.0
 */
public final class JSONs {

    /**
     * Private constructor.
     */
    private JSONs() {
    }

    /**
     * Clones a JSON object from the specified source object.
     *
     * @param src the specified source object
     * @return cloned object
     */
    public static JSONObject clone(final JSONObject src) {
        return new JSONObject(src, CollectionUtils.jsonArrayToArray(src.names(), String[].class));
    }
}