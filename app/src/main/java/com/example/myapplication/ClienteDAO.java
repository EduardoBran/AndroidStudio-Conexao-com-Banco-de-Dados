package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ClienteDAO {

    public Connection connection;
    public SQLiteDatabase banco;

    public ClienteDAO(Context context){
        connection = new Connection(context);
        banco = connection.getWritableDatabase();
    }
    public long inserir(Cliente cliente){
        ContentValues values = new ContentValues();
        values.put("nome", cliente.getNome());

        return banco.insert("cliente", null, values);
    }
}
