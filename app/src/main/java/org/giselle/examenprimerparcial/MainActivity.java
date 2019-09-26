package org.giselle.examenprimerparcial;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ClassAdapter adapter;

    ListView listView;
    SeekBar Color1;
    View colorSample;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        final ClassAdapter adapter = new ClassAdapter(ListDataHelper.provideItems());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                colorSample.setBackgroundColor(ContextCompat.getColor(view.getContext(), adapter.getItem(i).getColorIcono()));
                Toast.makeText(getApplicationContext(),
                        adapter.getItem(i).getTitle(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });




        Color1 = (SeekBar)findViewById(R.id.Color1);
        colorSample = (View) findViewById(R.id.colorSample);
        textView = (TextView) findViewById(R.id.textView);




        Color1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                //setAlpha (float alpha)
                //alpha between 0 and 1
                textView.setText("alpha= " + progress);
                colorSample.setAlpha((float)progress/100);



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub


            }});





    }
}