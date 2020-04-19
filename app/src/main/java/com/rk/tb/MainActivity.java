package com.rk.tb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton TB_1_IDJAVA;
    TextView TV_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TB_1_IDJAVA = findViewById(R.id.TB_1_IDXML);
        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);
    }

    public void KetikaDipijit(View Lihat) {
        if (TB_1_IDJAVA.isChecked()) {
            TV_1_IDJAVA.setText("ON");
        } else {
            TV_1_IDJAVA.setText("OFF");
        }
    }

}
