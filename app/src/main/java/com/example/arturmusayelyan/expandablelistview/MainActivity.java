package com.example.arturmusayelyan.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //https://www.tutorialspoint.com/android/android_json_parser.htm
    //https://developer.android.com/reference/org/json/JSONObject.html
    //http://www.vogella.com/tutorials/AndroidJSON/article.html
    //https://www.w3schools.com/js/js_json_parse.asp
    ExpandableListView expandableListView;
    CustomExpandableListAdapter adapter;
    List<String> expandableListTitle;
    HashMap<String,List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView=findViewById(R.id.expandableListView);

        expandableListDetail=ExpandableListDataPump.getData();
        expandableListTitle=new ArrayList<>(expandableListDetail.keySet());
        adapter=new CustomExpandableListAdapter(this,expandableListTitle,expandableListDetail);
        expandableListView.setAdapter(adapter);

       // expandableListView.setOnGroupExpandListener();
    }
}
