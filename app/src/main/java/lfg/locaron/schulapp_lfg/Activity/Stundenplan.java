package lfg.locaron.schulapp_lfg.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import lfg.locaron.schulapp_lfg.R;
import lfg.locaron.schulapp_lfg.SQLite.Fach;

public class Stundenplan extends AppCompatActivity {

    // Faecher werden in die activity hinzugefügt





    private int buttonID;
    private Button fach1;
    private Button raum1;
    private EditText raumNummer; // hier wird die neue raumnummer reingeschrieben


    // in onCreate werden die Faecher in dem sogenannten CONTEXT_MENU hinzugefügt
    // (stundenplan -> auf ein fach -> genau das Menu)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stundenplan);
        fach1 = (Button) findViewById(R.id.fach1);
        fach1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(view);
                openContextMenu(view);
            }
        });

        raum1 = (Button) findViewById((R.id.raum1));
        raum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeRaum(view);
            }
        });

        raumNummer = (EditText) findViewById(R.id.raumNummer);


    }

    @Override
    public void onCreateContextMenu (ContextMenu menu, View
            view, ContextMenu.ContextMenuInfo menuInfo){
        //Context menu
        menu.setHeaderTitle("Fächerauswahl");
        menu.add(Menu.NONE, Fach.FRANZOESISCH, Menu.NONE, "Französisch");
        menu.add(Menu.NONE, Fach.ENGLISCH, Menu.NONE, "Englisch");
        menu.add(Menu.NONE, Fach.DEUTSCH, Menu.NONE, "Deutsch");
        menu.add(Menu.NONE, Fach.MATHE, Menu.NONE, "Mathe");
        menu.add(Menu.NONE, Fach.PHYSIK, Menu.NONE, "Physik");
        menu.add(Menu.NONE, Fach.CHEMIE, Menu.NONE, "Chemie");
        menu.add(Menu.NONE, Fach.BIOLOGIE, Menu.NONE, "Biologie");
        menu.add(Menu.NONE, Fach.INFORMATIK, Menu.NONE, "Informatik");
        menu.add(Menu.NONE, Fach.NuT, Menu.NONE, "Natur&Technik");
        menu.add(Menu.NONE, Fach.WR, Menu.NONE, "Wirtschaft&Recht");
        menu.add(Menu.NONE, Fach.ERDKUNDE, Menu.NONE, "Erdkunde");
        menu.add(Menu.NONE, Fach.SPORT, Menu.NONE, "Sport");
        menu.add(Menu.NONE, Fach.KUNST, Menu.NONE, "Kunst");
        menu.add(Menu.NONE, Fach.LATEIN, Menu.NONE, "Latein");
        menu.add(Menu.NONE, Fach.RELIGION, Menu.NONE, "Religion");
        menu.add(Menu.NONE, Fach.ETHIK, Menu.NONE, "Ethik");
        buttonID = view.getId();
    }

    // was passieren soll, wenn ein Item aus dem CONTEXT_MENU ausgewählt wird, hier soll
    // der entsprechende Button umbenannt werden

    @Override
    public boolean onContextItemSelected (MenuItem item){
        // TODO Auto-generated method stub

        switch (item.getItemId()) {
            case Fach.FRANZOESISCH: {
                Button button = findViewById(buttonID);
                button.setText("Fr");
                break;
            }
            case Fach.ENGLISCH: {
                Button button = findViewById(buttonID);
                button.setText("E");
                break;
            }
            case Fach.DEUTSCH: {
                Button button = findViewById(buttonID);
                button.setText("D");
                break;
            }
            case Fach.MATHE: {
                Button button = findViewById(buttonID);
                button.setText("M");
                break;
            }
            case Fach.PHYSIK: {
                Button button = findViewById(buttonID);
                button.setText("Ph");
                break;
            }
            case Fach.CHEMIE: {
                Button button = findViewById(buttonID);
                button.setText("Ch");
                break;
            }
            case Fach.BIOLOGIE: {
                Button button = findViewById(buttonID);
                button.setText("Bio");
                break;
            }
            case Fach.INFORMATIK: {
                Button button = findViewById(buttonID);
                button.setText("Inf");
                break;
            }
            case Fach.NuT: {
                Button button = findViewById(buttonID);
                button.setText("NuT");
                break;
            }
            case Fach.WR: {
                Button button = findViewById(buttonID);
                button.setText("WR");
                break;
            }
            case Fach.ERDKUNDE: {
                Button button = findViewById(buttonID);
                button.setText("Geo");
                break;
            }
            case Fach.SPORT: {
                Button button = findViewById(buttonID);
                button.setText("Sp");
                break;
            }
            case Fach.KUNST: {
                Button button = findViewById(buttonID);
                button.setText("Ku");
                break;
            }
            case Fach.MUSIK: {
                Button button = findViewById(buttonID);
                button.setText("Mu");
                break;
            }case Fach.LATEIN: {
                Button button = findViewById(buttonID);
                button.setText("L");
                break;
            }case Fach.RELIGION: {
                Button button = findViewById(buttonID);
                button.setText("Reli");
                break;
            }case Fach.ETHIK: {
                Button button = findViewById(buttonID);
                button.setText("Eth");
                break;
            }




        }

        return super.onContextItemSelected(item);
    }

    private void changeRaum(View view){
        Button button = findViewById(view.getId());
        button.setText(raumNummer.getText());


    }

}
