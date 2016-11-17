package at.fh.swengb.forinttoeuro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_view);

        Intent intent = getIntent();
        String resultMessage = intent.getStringExtra("data");
        TextView resultText = (TextView) findViewById(R.id.resultText2);


        resultText.setText(resultMessage);

    }

}
