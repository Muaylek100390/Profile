package fahsai.ruts.ac.th.profile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fourth extends AppCompatActivity {

    Button Plus,Minus,Multiple,Division,Answer;
    EditText crunchifyEditText,crunchifyEditText1,crunchifyEditText2;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    String multi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Plus = (Button) findViewById(R.id.Plus);
        Minus = (Button) findViewById(R.id.Minus);
        Multiple = (Button) findViewById(R.id.Multiple);
        Division = (Button) findViewById(R.id.Division);
        Answer = (Button) findViewById(R.id.sum);
        crunchifyEditText1 = (EditText) findViewById(R.id.num1);
        crunchifyEditText = (EditText) findViewById(R.id.num2);
        crunchifyEditText2 = (EditText) findViewById(R.id.Answer);


        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "" );
                    crunchifyAddition = true;
                    // crunchifyEditText.setText(null);


                }
            }
        });
        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mSubtract = true;
                //crunchifyEditText.setText(null);

            }
        });

        Multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyMultiplication = true;
                // crunchifyEditText.setText(null);

            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyDivision = true;
                // crunchifyEditText.setText(null);

            }
        });

        Answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText2.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyEditText1.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                    Intent intent = new Intent(Fourth.this,Fifth1.class);
                    intent.putExtra("X",crunchifyEditText.getText().toString());
                    intent.putExtra("Y",crunchifyEditText2.getText().toString());
                    String str = "+";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyEditText1.getText().toString());
                    startActivity(intent);
                }

                if (mSubtract == true) {
                    crunchifyEditText1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                    Intent intent = new Intent(Fourth.this,Fifth1.class);
                    intent.putExtra("X",crunchifyEditText.getText().toString());
                    intent.putExtra("Y",crunchifyEditText2.getText().toString());
                    String str = "-";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyEditText1.getText().toString());
                    startActivity(intent);
                }

                if (crunchifyMultiplication == true) {
                    crunchifyEditText1.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                    Intent intent = new Intent(Fourth.this,Fifth1.class);
                    intent.putExtra("X",crunchifyEditText.getText().toString());
                    intent.putExtra("Y",crunchifyEditText2.getText().toString());
                    String str = "*";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyEditText1.getText().toString());
                    startActivity(intent);
                }

                if (crunchifyDivision == true) {
                    crunchifyEditText1.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                    Intent intent = new Intent(Fourth.this,Fifth1.class);
                    intent.putExtra("X",crunchifyEditText.getText().toString());
                    intent.putExtra("Y",crunchifyEditText2.getText().toString());
                    String str = "/";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyEditText1.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
