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
 * Created on 31/12/14 12:59 PM
 */
package com.retailtracker.base.addons;

import android.content.Context;

import com.retailtracker.base.addons.ir.IrAttachment;
import com.retailtracker.base.addons.ir.IrModel;
import com.retailtracker.base.addons.mail.MailMessage;
import com.retailtracker.base.addons.res.ResCompany;
import com.retailtracker.base.addons.res.ResPartner;
import com.retailtracker.base.addons.res.ResUsers;
import com.retailtracker.core.orm.OModel;
import com.retailtracker.core.support.OUser;
import com.retailtracker.news.models.OdooNews;

import java.util.ArrayList;
import java.util.List;

public class BaseModels {
    public static final String TAG = BaseModels.class.getSimpleName();

    public static List<OModel> baseModels(Context context, OUser user) {
        List<OModel> models = new ArrayList<>();
        models.add(new OdooNews(context, user));
        models.add(new IrModel(context, user));
        models.add(new ResPartner(context, user));
        models.add(new ResUsers(context, user));
        models.add(new ResCompany(context, user));
        models.add(new IrAttachment(context, user));
        models.add(new MailMessage(context, user));
        return models;
    }
}
