package com.hly.spinner;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Spinner spinner1;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        // 下拉宽度
//        spinner.setDropDownWidth(500);
        // 下拉横线偏移
//        spinner.setDropDownHorizontalOffset(50);
        // 下拉的向下偏移
//        spinner.setDropDownVerticalOffset(50);
        // 下拉背景
//        spinner.setPopupBackgroundDrawable(ContextCompat.getDrawable(this,
//                R.drawable.ic_launcher_background));
        // 下拉背景
//        spinner.setPopupBackgroundResource(R.drawable.ic_launcher_background);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] spinner_content = getResources().getStringArray(R.array.spinner_content);
                Toast.makeText(MainActivity.this, "你点击的是:" + spinner_content[position],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner1 = findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_content, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] spinner_content = getResources().getStringArray(R.array.spinner_content);
                Toast.makeText(MainActivity.this, "你点击的是:" + spinner_content[position],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2 = findViewById(R.id.spinner2);
        final String[] mItems = {"Android", "Java", "C语言", "php", "phthon"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, mItems);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "你点击的是:" + mItems[position],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner spinner3 = findViewById(R.id.spinner3);
        final String[] array = {"Android", "Java", "C语言", "php", "phthon"};
        spinner3.setDropDownVerticalOffset(80);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                R.layout.spinner3_item, mItems);
        adapter2.setDropDownViewResource(R.layout.spinner3_dropdown_item);
        spinner3.setAdapter(adapter2);




    }
}
