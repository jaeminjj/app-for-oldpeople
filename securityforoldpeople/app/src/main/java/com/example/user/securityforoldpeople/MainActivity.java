package com.example.user.securityforoldpeople;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.Toast;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPoem(View v) {
        int id;
        Resources res = getResources();
        id = v.getId();
        LinearLayout layout = (LinearLayout) v.findViewById(id);
        String tag = (String) layout.getTag();

        int id_title = res.getIdentifier("name"+tag,"string",getPackageName());
       String title=res.getString(id_title);
        Toast toast = Toast.makeText(this,title,Toast.LENGTH_LONG);
        //Toast toast = Toast.makeText(this,"sdfsdf",Toast.LENGTH_LONG);
        toast.show();



    }
    public void display2Poem(View v) {
        int id;
        Resources res = getResources();
        id = v.getId();
        LinearLayout layout = (LinearLayout) v.findViewById(id);
        //String tag = (String) layout.getTag();
        Intent it = new Intent(this,Poem.class);
        //it.putExtra("it_tag",tag);
        startActivity(it);
    }
}