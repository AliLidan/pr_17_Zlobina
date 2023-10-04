package com.example.pz_17_zlobina_pr_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText YEAR;
    private EditText MODEL;
    private EditText MARKA;
    private EditText SERIA;
    private DBHelper dbHandler;
    private dbbHelper dbh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YEAR = findViewById(R.id.YEAR);
        MODEL = findViewById(R.id.MODEL);
        MARKA = findViewById(R.id.MARKA);
        SERIA = findViewById(R.id.SERIA);
        // creating a new dbhandler class
        // and passing our context to it.
        //dbHandler = new DBHelper(MainActivity.this);
        dbh= new dbbHelper(getApplicationContext());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSafe:
                Emploee objEmp = new Emploee(
                        YEAR.getText().toString(),
                        MODEL.getText().toString(),
                        MARKA.getText().toString(),
                        SERIA.getText().toString());

                if(dbh.InsertEmployee(objEmp))
                    Toast.makeText(getApplicationContext(),"Record inserted successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Record not inserted",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnLoad:
               // Intent intent = new Intentt

    }
    /*
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.btnSafe:
                String String_YEAR1 = YEAR.getText().toString();
                String String_MODEL1 = MODEL.getText().toString();
                String String_MARKA1 = MARKA.getText().toString();
                String String_SERIA1 = SERIA.getText().toString();

                // validating if the text fields are empty or not.
                if (String_YEAR1.isEmpty() && String_MODEL1.isEmpty() && String_MARKA1.isEmpty() && String_SERIA1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Есть пустые строки! Введите значения!!!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewCourse(String_YEAR1, String_MODEL1, String_MARKA1, String_SERIA1);


                // after adding the data we are displaying a toast message.
                Toast.makeText(MainActivity.this, "Значение добавлено!", Toast.LENGTH_SHORT).show();
                YEAR.setText("");
                MODEL.setText("");
                MARKA.setText("");
                SERIA.setText("");


                break;
            case R.id.btnLoad:
                Toast.makeText(this, "нажата load", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnDelate:
                Toast.makeText(this, "kdlf", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }*/
    }
}