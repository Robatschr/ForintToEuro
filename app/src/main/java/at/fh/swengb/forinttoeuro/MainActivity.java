package at.fh.swengb.forinttoeuro;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterText;
    private TextView resultText;
    public String resultxD;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterText = (EditText) findViewById(R.id.enterNumber);
        resultText = (TextView) findViewById(R.id.resultText);
    }


    public void forintCalc (View view) {
       Double number = Double.parseDouble(enterText.getText().toString());

        number *= 310;

        resultText.setText(number.toString());
        resultxD = number+" Forint";


    }

    public void euroCalc (View view) {

        Double number = Double.parseDouble(enterText.getText().toString());

        number *= 0.003225;

        resultText.setText(number.toString());

        resultxD = number + " Euro";

    }

    public void about (View view) {
        Intent intent = new Intent(this,AboutView.class);
        intent.putExtra("data",resultxD.toString());
        startActivity(intent);
    }
}
