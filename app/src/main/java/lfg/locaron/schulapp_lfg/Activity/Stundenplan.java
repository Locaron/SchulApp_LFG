package lfg.locaron.schulapp_lfg.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import lfg.locaron.schulapp_lfg.R;

public class Stundenplan extends AppCompatActivity {

    // Faecher werden in die activity hinzugefügt

    final int CONTEXT_MENU_FRANZOESISCH =0;
    final int CONTEXT_MENU_ENGLISCH = 1;
    final int CONTEXT_MENU_DEUTSCH = 2;
    final int CONTEXT_MENU_MATHE =3;
    final int CONTEXT_MENU_PHYSIK =4;
    final int CONTEXT_MENU_CHEMIE =5;
    final int CONTEXT_MENU_BIOLOGIE =6;
    final int CONTEXT_MENU_INFORMATIK =7;
    final int CONTEXT_MENU_NUT =8;
    final int CONTEXT_MENU_WIRTSCHAFT =9;
    final int CONTEXT_MENU_ERDKUNDE =10;
    final int CONTEXT_MENU_SPORT =11;
    final int CONTEXT_MENU_KUNST =12;
    final int CONTEXT_MENU_MUSIK =13;
    final int CONTEXT_MENU_LATEIN =14;
    final int CONTEXT_MENU_RELIGION =15;
    final int CONTEXT_MENU_ETHIK =16;




    private int buttonID;
    private Button fach11;
    private Button raum11;

    // in onCreate werden die Faecher in dem sogenannten CONTEXT_MENU hinzugefügt
    // (stundenplan -> auf ein fach -> genau das Menu)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stundenplan);
        fach11 = (Button) findViewById(R.id.fach11);
        fach11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(view);
                openContextMenu(view);
            }
        });

        raum11 = (Button) findViewById((R.id.raum11));
        raum11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //changeRaum(view);
            }
        });

    }

    @Override
    public void onCreateContextMenu (ContextMenu menu, View
            view, ContextMenu.ContextMenuInfo menuInfo){
        //Context menu
        menu.setHeaderTitle("My Context Menu");
        menu.add(Menu.NONE, CONTEXT_MENU_FRANZOESISCH, Menu.NONE, "Französisch");
        menu.add(Menu.NONE, CONTEXT_MENU_ENGLISCH, Menu.NONE, "Englisch");
        menu.add(Menu.NONE, CONTEXT_MENU_DEUTSCH, Menu.NONE, "Deutsch");
        menu.add(Menu.NONE, CONTEXT_MENU_MATHE, Menu.NONE, "Mathe");
        menu.add(Menu.NONE, CONTEXT_MENU_PHYSIK, Menu.NONE, "Physik");
        menu.add(Menu.NONE, CONTEXT_MENU_CHEMIE, Menu.NONE, "Chemie");
        menu.add(Menu.NONE, CONTEXT_MENU_BIOLOGIE, Menu.NONE, "Biologie");
        menu.add(Menu.NONE, CONTEXT_MENU_INFORMATIK, Menu.NONE, "Informatik");
        menu.add(Menu.NONE, CONTEXT_MENU_NUT, Menu.NONE, "Natur&Technik");
        menu.add(Menu.NONE, CONTEXT_MENU_WIRTSCHAFT, Menu.NONE, "Wirtschaft&Recht");
        menu.add(Menu.NONE, CONTEXT_MENU_ERDKUNDE, Menu.NONE, "Erdkunde");
        menu.add(Menu.NONE, CONTEXT_MENU_SPORT, Menu.NONE, "Sport");
        menu.add(Menu.NONE, CONTEXT_MENU_KUNST, Menu.NONE, "Kunst");
        menu.add(Menu.NONE, CONTEXT_MENU_LATEIN, Menu.NONE, "Latein");
        menu.add(Menu.NONE, CONTEXT_MENU_RELIGION, Menu.NONE, "Religion");
        menu.add(Menu.NONE, CONTEXT_MENU_ETHIK, Menu.NONE, "Ethik");
        buttonID = view.getId();
    }

    // was passieren soll, wenn ein Item aus dem CONTEXT_MENU ausgewählt wird, hier soll
    // der entsprechende Button umbenannt werden

    @Override
    public boolean onContextItemSelected (MenuItem item){
        // TODO Auto-generated method stub

        switch (item.getItemId()) {
            case CONTEXT_MENU_FRANZOESISCH: {
                Button button = findViewById(buttonID);
                button.setText("Fr");
                break;
            }
            case CONTEXT_MENU_ENGLISCH: {
                Button button = findViewById(buttonID);
                button.setText("E");
                break;
            }
            case CONTEXT_MENU_DEUTSCH: {
                Button button = findViewById(buttonID);
                button.setText("D");
                break;
            }
            case CONTEXT_MENU_MATHE: {
                Button button = findViewById(buttonID);
                button.setText("M");
                break;
            }
            case CONTEXT_MENU_PHYSIK: {
                Button button = findViewById(buttonID);
                button.setText("Ph");
                break;
            }
            case CONTEXT_MENU_CHEMIE: {
                Button button = findViewById(buttonID);
                button.setText("Ch");
                break;
            }
            case CONTEXT_MENU_BIOLOGIE: {
                Button button = findViewById(buttonID);
                button.setText("Bio");
                break;
            }
            case CONTEXT_MENU_INFORMATIK: {
                Button button = findViewById(buttonID);
                button.setText("Inf");
                break;
            }
            case CONTEXT_MENU_NUT: {
                Button button = findViewById(buttonID);
                button.setText("NuT");
                break;
            }
            case CONTEXT_MENU_WIRTSCHAFT: {
                Button button = findViewById(buttonID);
                button.setText("WR");
                break;
            }
            case CONTEXT_MENU_ERDKUNDE: {
                Button button = findViewById(buttonID);
                button.setText("Geo");
                break;
            }
            case CONTEXT_MENU_SPORT: {
                Button button = findViewById(buttonID);
                button.setText("Sp");
                break;
            }
            case CONTEXT_MENU_KUNST: {
                Button button = findViewById(buttonID);
                button.setText("Ku");
                break;
            }
            case CONTEXT_MENU_MUSIK: {
                Button button = findViewById(buttonID);
                button.setText("Mu");
                break;
            }case CONTEXT_MENU_LATEIN: {
                Button button = findViewById(buttonID);
                button.setText("L");
                break;
            }case CONTEXT_MENU_RELIGION: {
                Button button = findViewById(buttonID);
                button.setText("Reli");
                break;
            }case CONTEXT_MENU_ETHIK: {
                Button button = findViewById(buttonID);
                button.setText("Eth");
                break;
            }




        }

        return super.onContextItemSelected(item);
    }

}
