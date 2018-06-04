package lfg.locaron.schulapp_lfg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import lfg.locaron.schulapp_lfg.R;
import lfg.locaron.schulapp_lfg.SQLite.Fach;
import lfg.locaron.schulapp_lfg.SQLite.NotenData;
import lfg.locaron.schulapp_lfg.SQLite.SQLNoten;

public class NotenrechnerMain extends AppCompatActivity {

    SQLNoten database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notenrechner_main);

        database = new SQLNoten(this);
    }

    public List<Integer> getMuendlich(int fach){
        database.open();
        NotenData data  = database.read(fach);
        database.close();
        return data.getMuendlich();

    }

    public List<Integer> getSchriftlich(int fach){
        database.open();
        NotenData data  = database.read(fach);
        database.close();
        return data.getSchriftlich();
    }

    public void showData(int fach){
        System.out.println(getFach(fach)); //show data
        List munedlich = getMuendlich(fach);
        for (int i = 0; i <munedlich.size(); i++){
            System.out.println(munedlich.get(i)); // show data
        }

        List schriftlich = getSchriftlich(fach);
        for (int i = 0; i <schriftlich.size(); i++){
            System.out.println(schriftlich.get(i)); // show data
        }
    }

    public String getFach(int fach){
        switch (fach){
            case Fach.FRANZOESISCH: return "Französisch";
            case Fach.BIOLOGIE: return "Biologie";
            case Fach.CHEMIE: return "Chemie";
            case Fach.DEUTSCH: return "Deutsch";
            case Fach.ENGLISCH: return "Englisch";
            case Fach.ERDKUNDE: return "Erdkunde";
            case Fach.INFORMATIK: return "Informatik";
            case Fach.KUNST: return "Kunst";
            case Fach.LATEIN: return "Latein";
            case Fach.MATHE: return "Mathe";
            case Fach.MUSIK: return "Musik";
            case Fach.NuT: return "Natur & Technik";
            case Fach.PHYSIK: return "Physik";
            case Fach.RELIGION: return "Religion";
            case Fach.SPORT: return "Sport";
            case Fach.WR: return "Wirtschaft & Recht";
            default: return "gg you fcked up";
        }
    }

}
