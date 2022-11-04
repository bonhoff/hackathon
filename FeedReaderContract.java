package com.example.a;

import android.provider.BaseColumns;

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static class TablaUsuarios implements BaseColumns {
        public static final String TABLE_NAME = "usuarios";
        public static final String COLUMN_NAME_NOMBRE = "nombre";
        public static final String COLUMN_NAME_APELLIDO1 = "apellido1";
        public static final String COLUMN_NAME_APELLIDO2 = "apellido2";
        public static final String COLUMN_NAME_EMAIL="email";
        public static final String COLUMN_NAME_PASSWORD="password";
        public static final String COLUMN_NAME_PUNTOS="puntos";
    }

    public static class TablaPremios implements BaseColumns{

        public static final String TABLE_NAME="premios";
        public static final String COLUMN_NAME_NOMBRE="premio";
        public static final String COLUMN_NAME_DESCRIPCION="descripcion";
        public static final String COLUMN_NAME_PRECIO="precio";

    }


}
