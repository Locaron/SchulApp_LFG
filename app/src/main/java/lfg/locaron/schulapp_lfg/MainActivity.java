package lfg.locaron.schulapp_lfg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   private void toNotenrechner(View view){
       Intent intent = new Intent(this, Notenrechner.class);
       startActivity(intent);
   }
}
