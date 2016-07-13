package com.example.pcom_5.traffic_tam;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createListView();

    } //Main Metsod
    private void createListView(){
        MyData objMyData = new MyData();
        int[] intIcon = objMyData.icon();
        String[] strTitle = objMyData.title();

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
        ListView myLisView = (ListView) findViewById(R.id.listView);
        myLisView.setAdapter(objMyAdapter);
    }//createListView
    public void clicksound(View view) {
        Intent obIntent = new Intent(Intent.ACTION_VIEW);
        obIntent.setData(Uri.parse("http://ntc.pnu.ac.th"));
        startActivity(obIntent);
        //click
    }
}
