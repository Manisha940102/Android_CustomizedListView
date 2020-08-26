package com.example.customizedlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.listView);
        Log.d(TAG,"onCreate: Started ");

        Person nik =  new Person("Nik","12/02/2018","25");
        Person brown =  new Person("Brown","12/03/2018","26");
        Person lizzy =  new Person("Lizzy","12/04/2018","30");
        Person mike =  new Person("Mike","12/05/2018","45");
        Person alex =  new Person("Alex","12/06/2018","57");

        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(nik);
        peopleList.add(brown);
        peopleList.add(lizzy);
        peopleList.add(mike);
        peopleList.add(alex);

        PersonListAdapter adapter = new PersonListAdapter(this,R.layout.adaptor_view_layout,peopleList);
        list.setAdapter(adapter);
    }
}
