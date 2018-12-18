package fahsai.ruts.ac.th.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Third extends AppCompatActivity {

    TextView username,password,tel;
    ImageButton Imgprev;
    Button Cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        username = (TextView)findViewById(R.id.Name);
        password = (TextView)findViewById(R.id.Password);
        tel = (TextView)findViewById(R.id.Telephone);


        username.setText(getIntent().getStringExtra("name"));
        password.setText(getIntent().getStringExtra("password"));
        tel.setText(getIntent().getStringExtra("phone"));

        Imgprev = (ImageButton)findViewById(R.id.prev);
        Imgprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Third.this,Second.class);
                startActivity(intent);
            }
        });

        Cal = (Button)findViewById(R.id.cal);
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Third.this,Fourth.class);
                startActivity(intent);
            }
        });

    }
}
