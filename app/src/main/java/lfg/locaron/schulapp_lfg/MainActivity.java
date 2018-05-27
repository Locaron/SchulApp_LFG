package lfg.locaron.schulapp_lfg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonToNotenrechner;

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
    }
    private void toNotenrechnerMain(View view){
        Intent intent = new Intent(this, NotenrechnerMain.class);
        startActivity(intent);
    }
}
