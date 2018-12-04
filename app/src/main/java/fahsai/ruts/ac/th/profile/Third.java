package fahsai.ruts.ac.th.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Third extends AppCompatActivity {

    TextView username,password,tel;

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

    }
}
