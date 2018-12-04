package fahsai.ruts.ac.th.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Second extends AppCompatActivity {

    ImageButton imgprev ,imgnext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        imgprev = (ImageButton)findViewById(R.id.Prev);
        imgprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imgnext = (ImageButton)findViewById(R.id.Next);
        imgnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this,Third.class);
                startActivity(intent);
            }
        });

    }
}
