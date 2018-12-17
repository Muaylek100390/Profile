package fahsai.ruts.ac.th.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Fifth1 extends AppCompatActivity {

    TextView textView2,textView5,textView6,Sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth1);
        textView2= (TextView)findViewById(R.id.textView2);
        textView5= (TextView)findViewById(R.id.textView5);
        textView6= (TextView)findViewById(R.id.textView6);
        Sum= (TextView)findViewById(R.id.Sum);

        textView2.setText(getIntent().getStringExtra("X"));
        textView5.setText(getIntent().getStringExtra("Y"));
        textView6.setText(getIntent().getStringExtra("Z"));
        Sum.setText(getIntent().getStringExtra("SUM"));
    }
}
