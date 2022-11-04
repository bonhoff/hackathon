package com.example.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class FeedReaderDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FeedReader.db";
    private static final String SQL_CREATE_ENTRIESUSER =
            "CREATE TABLE " + FeedReaderContract.TablaUsuarios.TABLE_NAME + " (" +
                    FeedReaderContract.TablaUsuarios._ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContract.TablaUsuarios.COLUMN_NAME_NOMBRE + " TEXT," +
                    FeedReaderContract.TablaUsuarios.COLUMN_NAME_APELLIDO1 + " TEXT," +
                    FeedReaderContract.TablaUsuarios.COLUMN_NAME_APELLIDO2 + " TEXT," +
                    FeedReaderContract.TablaUsuarios.COLUMN_NAME_EMAIL + " TEXT," +
                    FeedReaderContract.TablaUsuarios.COLUMN_NAME_PASSWORD + " LONG," +
                    FeedReaderContract.TablaUsuarios.COLUMN_NAME_PUNTOS + " INTEGER)";


    private static final String SQL_DELETE_ENTRIESUSER =
            "DROP TABLE IF EXISTS " + FeedReaderContract.TablaUsuarios.TABLE_NAME;

    private static final String SQL_CREATE_ENTRIESPREMIOS =
            "CREATE TABLE " + FeedReaderContract.TablaPremios.TABLE_NAME + " (" +
                    FeedReaderContract.TablaPremios._ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContract.TablaPremios.COLUMN_NAME_NOMBRE + " TEXT," +
                    FeedReaderContract.TablaPremios.COLUMN_NAME_DESCRIPCION + " TEXT," +
                    FeedReaderContract.TablaPremios.COLUMN_NAME_PRECIO + " FLOAT)";


    private static final String SQL_DELETE_ENTRIESPREMIOS =
            "DROP TABLE IF EXISTS " + FeedReaderContract.TablaUsuarios.TABLE_NAME;
    public FeedReaderDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIESUSER);
        db.execSQL(SQL_CREATE_ENTRIESPREMIOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        onUpgrade(db,i,i1);
    }
}
