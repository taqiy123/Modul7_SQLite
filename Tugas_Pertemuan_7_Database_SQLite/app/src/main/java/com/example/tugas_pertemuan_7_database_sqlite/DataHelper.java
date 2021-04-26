package com.example.tugas_pertemuan_7_database_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodatadiri.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //TODO Auto-generated constructor stub
        String sql = "create table biodata(nomer integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        db.execSQL(sql);
        sql = "INSERT INTO biodata(nomer, nama, tgl, jk, alamat) VALUES ('1', 'Taqiy', '2000-07-22', 'Laki-laki', 'Jember');";
        db.execSQL(sql);
    }
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        //TODO Auto-generated method stub
    }
}
