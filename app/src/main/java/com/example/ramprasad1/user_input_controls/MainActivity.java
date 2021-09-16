package com.example.ramprasad1.user_input_controls;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    RadioGroup Gender;
    CheckBox java,android,python;
    int id;
    RadioButton radioButton;
    EditText name,email,phoneno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        phoneno=(EditText)findViewById(R.id.phoneno);
        Gender=(RadioGroup)findViewById(R.id.radioGroup);
        java=(CheckBox)findViewById(R.id.java);
        android=(CheckBox)findViewById(R.id.android);
        python=(CheckBox)findViewById(R.id.python);
        id=Gender.getCheckedRadioButtonId();
        radioButton=(RadioButton)findViewById(id);
    }

    public void submit(View view) {
        String name_str, email_str, ph_str;
        name_str = name.getText().toString();
        email_str = email.getText().toString();
        ph_str = phoneno.getText().toString();
        Toast.makeText(this, name_str + "\n" + email_str + "\n" + ph_str, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.ram:
                Toast.makeText(this, "sri rama", Toast.LENGTH_SHORT).show();
                break;
            case R.id.krish:
                Toast.makeText(this, "Sri krishna", Toast.LENGTH_SHORT).show();
                break;
            case R.id.venky:
                Toast.makeText(this, "sri venkatesha", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    public void myAlert(View view) {
        AlertDialog.Builder a=new AlertDialog.Builder(this);
        a.setTitle("my alert");
        a.setMessage("do u want to close this app");
        a.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }
        });
        a.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity.this, "You clicked no", Toast.LENGTH_SHORT).show();
            }
        });
        a.setCancelable(false);
        a.show();
    }
}
