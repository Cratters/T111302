package com.example.auser.t111302;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.auser.t111302.data.Student;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
    public void clickAdd(View v)
    {
        //SQLiteDatabase db = SQLiteDatabase.openDatabase(DBInfo.DB_FILE, null, SQLiteDatabase.OPEN_READWRITE);

        EditText ed = (EditText)findViewById(R.id.editText);
        EditText ed2 = (EditText)findViewById(R.id.editText2);
        EditText ed3 = (EditText)findViewById(R.id.editText3);
        MainActivity.t.add(new Student(ed.getText().toString(), ed2.getText().toString(), ed3.getText().toString()));
        finish();
    }
}
