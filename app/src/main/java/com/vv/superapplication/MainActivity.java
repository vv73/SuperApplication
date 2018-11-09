package com.vv.superapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text;
    TextView superText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =
                (EditText)findViewById(R.id.text);
         superText =
                (TextView)findViewById(R.id.superText);
    }

    public void superChange(View view) {
        String str = text.getText().toString();
        superText.setText("Super" + str);

    }
}
