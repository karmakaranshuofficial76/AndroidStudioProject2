package com.anshukarmakar.recycler_121710303003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_details);
        this.imageView = (ImageView) findViewById(R.id.iv);
        this.textView = (TextView) findViewById(R.id.tv);
        Bundle bundle = getIntent().getExtras();
        Integer logo = Integer.valueOf(bundle.getInt("logo"));
        String name = bundle.getString("name");
        this.imageView.setImageResource(logo.intValue());
        this.textView.setText(name);
    }
}