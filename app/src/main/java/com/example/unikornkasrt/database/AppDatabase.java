package com.example.unikornkasrt.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.unikornkasrt.database.dao.DatabaseDao;
import com.example.unikornkasrt.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
