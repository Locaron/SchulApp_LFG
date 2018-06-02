package lfg.locaron.schulapp_lfg.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import lfg.locaron.schulapp_lfg.R;
import lfg.locaron.schulapp_lfg.SQLite.SQL;
import lfg.locaron.schulapp_lfg.SQLite.SQLData;

public class MainActivity extends AppCompatActivity {

    Button buttonToNotenrechner;
    SQL sql;

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

        /*
        sql = new SQL(this);
        sql.open();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        sql.write(new SQLData(list1, list2, 0));

        SQLData data = sql.read(0);
        Log.d("ok", data.listToString(data.getMuendlich()));
        sql.close();

        */

    }

    private void toNotenrechnerMain(View view){
        Intent intent = new Intent(this, NotenrechnerMain.class);
        startActivity(intent);
    }
}
