package com.rafaelmateus.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText;
    private TextView welcomeTextView;
    private String welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nameEditText = (EditText) findViewById(R.id.nameEditText);
        this.welcomeTextView = (TextView) findViewById(R.id.welcomeTextView);
        this.welcome = getResources().getString(R.string.welcome);
    }

    public void surpriseUser(View v){
        Editable text = this.nameEditText.getText();
        String msg = welcome + " " + text.toString();
        this.welcomeTextView.setText(msg);
    }
}
