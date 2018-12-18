package fahsai.ruts.ac.th.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class result extends AppCompatActivity {

    private String Tem ,Unit ,Answer;
    Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Tem = intent.getExtras().getString("Tem");
        Unit = intent.getExtras().getString("Unit");
        Answer = intent.getExtras().getString("Answer");

        TextView textTem = (TextView) findViewById(R.id.Get);
        textTem.setText(Tem);
        textTem.setTextSize(30);

        TextView textUnit = (TextView) findViewById(R.id.Temp);
        textUnit.setText(Unit);
        textUnit.setTextSize(20);

        TextView textAnswer = (TextView) findViewById(R.id.Result);
        textAnswer.setText(Answer);
        textAnswer.setTextSize(30);

        prev= (Button)findViewById(R.id.btnPrev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(result.this, Temprature.class);
                startActivity(intent);
            }
        });

    }
}
