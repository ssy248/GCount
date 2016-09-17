package com.example.serenayuan.gogreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serenayuan on 9/16/16.
 */
public class GreenList extends Activity {
    List<Green> greenmodel = new ArrayList<Green>();
    ArrayAdapter<Green> adapter =null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activity_add_green_count);
    }

    Button save = (Button)findViewById(R.id.save);

    save.setOnClickListener(onSave);

    ListView list = (ListView)findViewById(R.id.greens);

    adapter = new GCAdapter();

    list.setAdapter(adapter);


}

private View.OnClickListener onSave = new View.OnClickListener() {
    public void onClick(View v) {
        Green g = new Green();

        EditText name = (EditText)findViewById(R.id.content);

        g.setName(name.getText().toString());
    }
    adapter.add(g);
}
