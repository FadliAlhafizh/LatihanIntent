package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button implicit;
    Button explicit;
    Button implicit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        implicit = (Button) findViewById(R.id.implicit);
        implicit.setOnClickListener(this);
        explicit = (Button) findViewById(R.id.excplicit);
        explicit.setOnClickListener(this);
        implicit1 = (Button) findViewById(R.id.implcit1);
        implicit1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.implicit:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://inifadli17.blogspot.com"));
                startActivity(implicit);
                break;
            case R.id.excplicit:
                Intent explicit = new Intent(MainActivity.this, ActivitySlide.class);
                startActivity(explicit);
                break;
            case R.id.implcit1:
                Intent implicit1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/lahhhiyaaa?s=08"));
                startActivity(implicit1);
                break;
            default:
                break;
        }
    }
}
