package lfg.locaron.schulapp_lfg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class Notenrechner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_notenrechner);

    }
    private ArrayList<Integer>Mathe = new ArrayList<>();
    private int[] matheMündl = new int[20];
    private int[] matheSchrif = new int[20];

    private void addNote(View view){
        /*
        EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        //arraylists?/2 cursor?
        switch(view.getId()){
            case R.id.MatheXD:
                String test = input.getText().toString();
                Mathe.add(Integer.parseInt(test));
                break;
        }
        */
    }

}