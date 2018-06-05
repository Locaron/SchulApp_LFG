package lfg.locaron.schulapp_lfg.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import lfg.locaron.schulapp_lfg.R;
import lfg.locaron.schulapp_lfg.SQLite.Fach;
import lfg.locaron.schulapp_lfg.SQLite.NotenData;
import lfg.locaron.schulapp_lfg.SQLite.SQLNoten;

public class NotenrechnerMain extends AppCompatActivity {

    SQLNoten database;
    int[] verhältnis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notenrechner_main);

        database = new SQLNoten(this);
    }

    /*************** get Data*****************/
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

    /*************** Calculate ******************/
    public void adaptToClass(int klasse, char zweig) {
        if (zweig == 'n') { //naturwissenchaftliich
            switch (klasse) {
                case 5:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; -1 -> man hat das fach nicht; (schriftlich: mündlich); index hängt vom fach ab
                    break;
                case 6:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 7:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 8:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 9:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 10:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 11:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 12:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
            }
        } else { //sprachlich
            switch (klasse) {
                case 5:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1 (schriftlich: mündlich); index hängt vom fach ab
                    break;
                case 6:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 7:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 8:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 9:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 10:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 11:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
                case 12:
                    verhältnis = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //0 -> 1:1; 1 -> 2:1; index hängt vom fach ab
                    break;
            }

        }
    }

    public float calcAverage(List<Integer> list){
        int addedUp = 0;
        for (int i = 0;i < list.size(); i++){
            addedUp += list.get(i);
        }
        return addedUp / list.size();
    }
    public float calc2zu1(List<Integer> muendlich, List<Integer> schriftlich){
        return (calcAverage(muendlich) + 2*calcAverage(schriftlich)) / 3;
    }

    public float calc1zu1(List<Integer> muendlich, List<Integer> schriftlich){
        return (calcAverage(muendlich) + calcAverage(schriftlich)) / 2;
    }



    /************* show data *****************/
    public void showData(int fach){
        System.out.println(getFach(fach)); //show fach
        List<Integer> munedlich = getMuendlich(fach);
        for (int i = 0; i <munedlich.size(); i++){
            System.out.println(munedlich.get(i)); // show muendliche Noten
        }

        List schriftlich = getSchriftlich(fach);
        for (int i = 0; i <schriftlich.size(); i++){
            System.out.println(schriftlich.get(i)); // show schriftliche Noten
        }

        if (verhältnis[fach] == 0){
            System.out.println(calc1zu1(munedlich, schriftlich));
        }else{                                                          //show durchschnitt
            System.out.println(calc2zu1(munedlich, schriftlich));
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
            case Fach.ETHIK: return "Ethik";
            default: return "gg you fcked up";
        }
    }


}
