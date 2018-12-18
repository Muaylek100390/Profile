package fahsai.ruts.ac.th.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Temprature extends AppCompatActivity {

    private EditText editdata;
    private RadioGroup Group;
    private String strTemp ,strTempRadio="Celsuis",strAns;
    private double douAns;
    private Button HomePage ,Cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temprature);

        editdata = (EditText) findViewById(R.id.editTemp);
        Group = (RadioGroup) findViewById(R.id.radiogroup);

        HomePage = (Button) findViewById(R.id.btnHome1);
        HomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Temprature.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Cal = (Button) findViewById(R.id.bntCalculate);
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    strTemp = editdata.getText().toString().trim();
                    if (strTemp.equals(" ")) {
                        Log.d("Space", "It Have space In Blank.");

                    }
                    else if(strTempRadio=="Celcius"){

                        Intent intent = new Intent(Temprature.this,result.class);
                        startActivity(intent);
                        Log.d("Pass","It Have space in Data");

                    }else if(strTempRadio=="Fahrenheit") {

                        Intent intent = new Intent(Temprature.this, result.class);
                        startActivity(intent);
                        Log.d("Pass", "It Have space in Data");

                    }else if(strTempRadio=="Kalvin") {

                            Intent intent = new Intent(Temprature.this, result.class);
                            startActivity(intent);
                            Log.d("Pass", "It Have space in Data");
                    }
                } catch (Exception e) {}
            }
        });

        Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioCel:
                        strTempRadio ="Celcius";
                    case R.id.radioFaren:
                        strTempRadio ="Fahrenheit";
                    case R.id.radioKil:
                        strTempRadio ="Kalvin";
                }
            }
        });
    }
}