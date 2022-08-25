package com.example.bookworm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle bundle= getIntent().getExtras();
        Products currentprroduct = (Products) bundle.getSerializable("Products");
        ImageView biii = findViewById(R.id.imageView5);
        TextView bookauthorr = findViewById(R.id.textView7);
        TextView bookdet = findViewById(R.id.textView8);
        biii.setImageResource(currentprroduct.getBii());
        bookauthorr.setText(currentprroduct.getAuthor());
        bookdet.setText(currentprroduct.getDet());
    }
}