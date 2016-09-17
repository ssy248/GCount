package com.example.serenayuan.gogreen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListView GCListView;
    String[] GCs;

    public final static String EXTRA_MESSAGE= "com.example.serenayuan.gogreen.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // GC Array Adapter set adapter
        Resources resources = getResources();
        GCListView = (ListView) findViewById(R.id.listView);
        GCListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, GCs));
        // for when uer  clicks on item
        GCListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), GCs[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void sendMessage(View view) {
        //Do something in resp to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText= (EditText) findViewById(R.id.edit_message);
        String message= editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void addCount(View view) {
        // butoon GreenCount (add new green activity)

        Button activityButtonGreenCount = (Button) findViewById(R.id.add_count);
            activityButtonGreenCount.setOnClickListener(new View.OnClickListener()) {
                @Override
                public void onClick(View view) {
                    Intent startIntentGreenCount = new Intent(getApplicationContext(), Main2ActivityAddGreenCount.class);

            }

        }

        Intent intent1 = new Intent(getApplicationContext(), GreenCount.class);
        EditText editText1= (EditText) findViewById(R.id.edit_message);
        String message1 = editText1.getText().toString();
        startIntent.putExtra("com.example.serenayuan.MESSAGE"),"Adding to GreenCount";

        Intent intent2 = new Intent(getApplicationContext(), GCAdapter().class);
        EditText editText2= (EditText) findViewById(R.id.edit_message);
        String message2 = editText2.getText().toString();
        startActivity(intent2);

        startActivity(intent1);
    }

    public void addActivity(View view) {

        Button activityButtonAddActivity = (Button) findViewById(R.id.add_activity);
        EditText editText2= (EditText) findViewById(R.id.edit_message);
        String message2 = editText2.getText().toString();

        // add to green


    }

}
