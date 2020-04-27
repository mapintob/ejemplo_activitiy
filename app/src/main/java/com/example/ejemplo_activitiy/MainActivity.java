package com.example.ejemplo_activitiy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Toast.makeText(this,"hola mundo",Toast.LENGTH_LONG).show();
       SuperToast.create(this, "Hello world!", Style.DURATION_LONG).show();
        SuperToast.create(this, "Hello world!", Style.DURATION_LONG, Style.green()).show();

    }
}
