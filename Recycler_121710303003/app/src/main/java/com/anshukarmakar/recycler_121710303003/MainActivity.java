package com.anshukarmakar.recycler_121710303003;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MainAdapter mainAdapter;
    ArrayList<MainModel> mainModels;
    RecyclerView recyclerView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        this.recyclerView = (RecyclerView) findViewById(R.id.anshurecyclerview);
        Integer[] imageLogo =
                {R.drawable.anushkashetty, R.drawable.charmi,
                        R.drawable.illeana, R.drawable.kajalaggarwal,
                        R.drawable.mumaithkhan, R.drawable.nayanthara,
                        R.drawable.priyamani, R.drawable.rakulpreet,
                        R.drawable.samanthaakkineni, R.drawable.shriya,
                        R.drawable.tamanna};
        String[] imageName = {"Anushka Shetty", "Charmi Kaur", "Ileana D Cruz", "Kajal Aggarwal", "Mumaith Khan", "Nayanthara", "Priyamani", "Rakul Preet Singh", "Samantha Ruth Prabhu", "Shriya Saran", "Tammana Bhatia"};
        this.mainModels = new ArrayList<>();
        for (int i = 0; i < imageLogo.length; i++) {
            this.mainModels.add(new MainModel(imageLogo[i], imageName[i]));
        }
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.mainAdapter = new MainAdapter(this, this.mainModels);
        this.recyclerView.setAdapter(this.mainAdapter);
    }
}
