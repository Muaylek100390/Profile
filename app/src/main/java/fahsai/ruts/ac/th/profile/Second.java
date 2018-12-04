package fahsai.ruts.ac.th.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Second extends AppCompatActivity {

    ImageButton imgprev;
    Button submit;
    EditText username,password,tel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        username = (EditText)findViewById(R.id.ID);
        password = (EditText)findViewById(R.id.Password);
        tel = (EditText)findViewById(R.id.Tel);

        imgprev = (ImageButton)findViewById(R.id.Prev);
        imgprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this,MainActivity.class);
                startActivity(intent);
            }
        });

        submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this,Third.class);

                intent.putExtra("name",username.getText().toString());
                intent.putExtra("password",password.getText().toString());
                intent.putExtra("phone",tel.getText().toString());

                startActivity(intent);
            }
        });

    }
}
