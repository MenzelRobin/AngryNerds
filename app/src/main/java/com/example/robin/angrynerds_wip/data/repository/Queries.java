package com.example.robin.angrynerds_wip.data.repository;

import android.content.Context;

import com.couchbase.lite.DataSource;
import com.couchbase.lite.Query;
import com.couchbase.lite.QueryBuilder;
import com.couchbase.lite.SelectResult;
import com.example.robin.angrynerds_wip.data.models.tens.TEN;

import java.util.ArrayList;

public class Queries {

    public static DatabaseInit data = new DatabaseInit();

    public ArrayList<TEN> getAll() {
        Query query = QueryBuilder.select(SelectResult.all())
                .from(DataSource.database(data.getDatabase()));
        return null;
    }

    public ArrayList<TEN> getEvents() {
        return null;

    }

    public ArrayList<TEN> getNotes() {
        return null;

    }

    public ArrayList<TEN> getToDos() {
        return null;

    }
}
