package com.example.pinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class LayoutTrangchu1Activity extends AppCompatActivity {
    TextView name,cauhoi;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_trangchu_1);
        cauhoi = findViewById(R.id.tv_cauhoi);
        cauhoi.setText(R.string.cauhoi);


         name = (TextView) findViewById(R.id.txt_clicked);
         image = findViewById(R.id.img_clicked);

         Intent intent = getIntent();
         name.setText(intent.getStringExtra("name"));
         image.setImageResource(intent.getIntExtra("image",0));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}