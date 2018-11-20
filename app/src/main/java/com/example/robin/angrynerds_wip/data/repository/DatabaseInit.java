package com.example.robin.angrynerds_wip.data.repository;

import android.content.Context;

import com.couchbase.lite.CouchbaseLiteException;
import com.couchbase.lite.Database;
import com.couchbase.lite.DatabaseConfiguration;

public class DatabaseInit {

    private Database database = null;

    public DatabaseInit(Context context) {
        try {
            DatabaseConfiguration config = new DatabaseConfiguration(context.getApplicationContext());
            this.database = new Database("TEN-Manager", config);
        } catch (CouchbaseLiteException e) {
        }
        

    }

    public Database getDatabase() {
        return database;
    }
}
