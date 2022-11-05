package com.example.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class FeedReaderDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 2;
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
            "DROP TABLE IF EXISTS " + FeedReaderContract.TablaPremios.TABLE_NAME;

    private static final String SQL_CREATE_ENTRIESMARKS =
             "CREATE TABLE "+ FeedReaderContract.TablaMarks.TABLE_NAME + " (" +
                    FeedReaderContract.TablaMarks._ID +"INTEGER PRIMARY KEY,"+
                    FeedReaderContract.TablaMarks.COLUMN_NAME_NOMBRE + " TEXT," +
                    FeedReaderContract.TablaMarks.COLUMN_NAME_TRANSPORTE + " TEXT," +
                    FeedReaderContract.TablaMarks.COLUMN_NAME_LINEA + " INTEGER,"+
                    FeedReaderContract.TablaMarks.COLUMN_NAME_BUS_O_TRAM + " BOOLEAN,"+
                    FeedReaderContract.TablaMarks.COLUMN_NAME_LATITUD+ " FLOAT,"+
                    FeedReaderContract.TablaMarks.COLUMN_NAME_LONGITUD + " FLOAT)";


    private static final String SQL_DELETE_ENTRIESMARKS =
            "DROP TABLE IF EXISTS " + FeedReaderContract.TablaMarks.TABLE_NAME;

    public FeedReaderDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIESUSER);
        db.execSQL(SQL_CREATE_ENTRIESPREMIOS);
        db.execSQL(SQL_CREATE_ENTRIESMARKS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_ENTRIESMARKS);
        db.execSQL(SQL_DELETE_ENTRIESPREMIOS);
        db.execSQL(SQL_DELETE_ENTRIESUSER);
        onCreate(db);
    }
}
