/**
 * Odoo, Open Source Management Solution
 * Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 *
 * Created on 13/3/15 2:43 PM
 */
package com.retailtracker.news.models;

import android.content.Context;

import com.retailtracker.core.orm.OModel;
import com.retailtracker.core.orm.fields.OColumn;
import com.retailtracker.core.orm.fields.types.OText;
import com.retailtracker.core.orm.fields.types.OVarchar;
import com.retailtracker.core.support.OUser;

public class OdooNews extends OModel {
    // TODO : adist-edhan 041316.0113 need to change as needed later
    public static final String TAG = OdooNews.class.getSimpleName();

    OColumn message = new OColumn("Message", OText.class);
    OColumn sender = new OColumn("sender", OVarchar.class);
    OColumn subject = new OColumn("Subject", OVarchar.class);

    public OdooNews(Context context, OUser user) {
        super(context, "odoo.news", user);
    }
}
