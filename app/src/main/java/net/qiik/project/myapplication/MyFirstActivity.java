package net.qiik.project.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;

/**
 * Created by NotePad1 on 15.08.2016.
 */

public class MyFirstActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

        checkBox2.setChecked(true);
        RadioButton radio = (RadioButton) findViewById(R.id.radioButton);
        checkBox1.setOnCheckedChangeListener(this);

        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
        getClass();
    }

    @Override
    public void onClick(View view) {
        Intent startActivityIntent = new Intent(this, MySecondActivity.class);
        startActivity(startActivityIntent);
    }
}
