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

    final int CONTEXT_MENU_VIEW = 1;
    final int CONTEXT_MENU_EDIT = 2;
    final int CONTEXT_MENU_ARCHIVE = 3;
    Button fach11;
    Button raum11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stundenplan);
        fach11 = (Button) findViewById(R.id.fach11);
        fach11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //changeFach(view);
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
            v, ContextMenu.ContextMenuInfo menuInfo){
        //Context menu
        menu.setHeaderTitle("My Context Menu");
        menu.add(Menu.NONE, CONTEXT_MENU_VIEW, Menu.NONE, "Add");
        menu.add(Menu.NONE, CONTEXT_MENU_EDIT, Menu.NONE, "Edit");
        menu.add(Menu.NONE, CONTEXT_MENU_ARCHIVE, Menu.NONE, "Delete");
    }

    @Override
    public boolean onContextItemSelected (MenuItem item){
        // TODO Auto-generated method stub
        switch (item.getItemId()) {
            case CONTEXT_MENU_VIEW: {

            }
            break;
            case CONTEXT_MENU_EDIT: {
                // Edit Action

            }
            break;
            case CONTEXT_MENU_ARCHIVE: {

            }
            break;
        }

        return super.onContextItemSelected(item);
    }

    private void changeFach(View view){
        Button button = (Button) findViewById(view.getId());
        button.setText("hallo");
    }
    private void changeRaum(View view){
        Button button = (Button) findViewById(view.getId());
        button.setText("hallo");
    }
}
