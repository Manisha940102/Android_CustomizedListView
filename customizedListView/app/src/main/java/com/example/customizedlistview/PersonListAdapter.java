package com.example.customizedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PersonListAdapter extends ArrayAdapter<Person> {
    private static final String TAG = "PersonListAdapter";
    private Context mContext;
    int mResource;

    public PersonListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String age = getItem(position).getAge();

        Person person = new Person(name,birthday,age);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView tvName =  convertView.findViewById(R.id.textView1);
        TextView tvBirthday = convertView.findViewById(R.id.textView2);
        TextView tvAge = convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvBirthday.setText(birthday);
        tvAge.setText(age);

        return convertView;
    }
}