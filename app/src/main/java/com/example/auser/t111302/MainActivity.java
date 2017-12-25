package com.example.auser.t111302;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.auser.t111302.data.Student;
import com.example.auser.t111302.data.StudentDAOMemoryImpl;
import com.example.auser.t111302.data.StudentDAOTest1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static StudentDAOMemoryImpl t =new StudentDAOMemoryImpl();
    RecyclerView mRecyclerView;
    RecyclerView.Adapter<MyAdapter.ViewHolder> mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        mRecyclerView.setHasFixedSize(false);
        mLayoutManager = new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        t.add(new Student("Bob", "123", "aabb"));
        t.add(new Student("Mary", "234", "ccdd"));


//
//        //ArrayList<Student> mylist = t.getData();
//        Student[] mylist = t.getData();
//        for (Student s: mylist)
//        {
//            Log.d("DATAS", s.toString());
//        }
//
//        //Student editStudent = mylist.get(0);
//        Student editStudent = mylist[0];
//        editStudent.tel = "987";
//        t.update(editStudent);
//
//        //ArrayList<Student> mylist1 = t.getData();
//        Student[] mylist1 = t.getData();
//        for (Student s: mylist1)
//        {
//            Log.d("DATAS", "update:" + s.toString());
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdapter = new MyAdapter(MainActivity.this, t.getData());
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_add)
        {
            Intent it = new Intent(MainActivity.this, AddActivity.class);
            startActivity(it);
        }
        return super.onOptionsItemSelected(item);
    }
}
