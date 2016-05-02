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
 * Created on 31/12/14 6:51 PM
 */
package com.retailtracker.core.orm;

import com.retailtracker.core.orm.fields.OColumn;

import java.util.ArrayList;
import java.util.List;

public class OM2MRecord {
    public static final String TAG = OM2MRecord.class.getSimpleName();
    private OColumn mCol = null;
    private int mId = 0;
    private OModel mDatabase = null;

    public OM2MRecord(OModel model, OColumn col, int id) {
        mDatabase = model;
        mCol = col;
        mId = id;
    }

    public List<Integer> getRelIds() {
        List<Integer> ids = new ArrayList<>();
        for (ODataRow row : mDatabase.selectManyToManyRecords(new String[]{OColumn.ROW_ID},
                mCol.getName(), mId)) {
            ids.add(row.getInt(OColumn.ROW_ID));
        }
        return ids;
    }

    public List<ODataRow> browseEach() {
        return mDatabase.selectManyToManyRecords(null, mCol.getName(), mId);
    }
}
