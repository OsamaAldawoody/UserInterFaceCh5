package com.hfad.userinterfacech5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class GridViewCh5 extends AppCompatActivity {

    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_ch5);

        toggleButton = (ToggleButton)findViewById(R.id.toggle);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean on = toggleButton.isChecked();
                if (on){
                    Toast.makeText(GridViewCh5.this, "On", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(GridViewCh5.this, "Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
