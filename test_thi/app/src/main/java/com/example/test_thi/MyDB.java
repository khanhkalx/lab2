package com.example.test_thi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyDB extends SQLiteOpenHelper {

    public static final String tableName ="StudentTable";
    public static  final String ID = "ID";
    public static final String Name = "FullName";
    public static final String Phone = "PhoneNumber";



    public MyDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         String sqlCreate = "Create table if not exists StudentTable( ID text primary key, FullName text , PhoneNumber text)";
         db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName);
        onCreate(db);
    }
    public void addContact(contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ID, contact.getId());
        values.put(Name, contact.getName());
        values.put(Phone, contact.getPhone());
        db.insert(tableName, null, values);
        db.close();
    }

    public ArrayList<contact> getAllContacts() {
        ArrayList<contact> list = new ArrayList<>();

        String sql = "SELECT * FROM " + tableName;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(sql, null);

        if (cursor != null) {
            while (cursor.moveToNext()) {
                contact ct = new contact(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2));
                list.add(ct);
            }
        }
        return list;
    }
}
