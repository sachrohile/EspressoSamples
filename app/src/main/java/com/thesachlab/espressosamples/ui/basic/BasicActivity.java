package com.thesachlab.espressosamples.ui.basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.thesachlab.espressosamples.R;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

    }

    public void methodOnclick(View view) {
        if (view.getId()== R.id.button) {
            Toast.makeText(this, "Basic Test Click Event", Toast.LENGTH_SHORT).show();
        }
    }
}
