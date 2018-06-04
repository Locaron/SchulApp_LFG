package lfg.locaron.schulapp_lfg.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import lfg.locaron.schulapp_lfg.R;



public class MainActivity extends AppCompatActivity {

    Button buttonToNotenrechner;
    Button buttonToSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToNotenrechner = (Button) findViewById(R.id.buttonToNotenrechner);
        buttonToNotenrechner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toNotenrechnerMain(view);
            }
        });
        buttonToSettings = (Button) findViewById(R.id.buttonToSettings);
        buttonToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toStundenplan(view);
            }
        });


    }
    private void toNotenrechnerMain(View view){
        Intent intent = new Intent(this, NotenrechnerMain.class);
        startActivity(intent);
    }
    private void toStundenplan(View view) {
        Intent intent = new Intent(this , Stundenplan.class);
        startActivity(intent);
    }
}
