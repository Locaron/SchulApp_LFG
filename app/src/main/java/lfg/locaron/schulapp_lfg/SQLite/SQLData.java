package lfg.locaron.schulapp_lfg.SQLite;

import java.util.ArrayList;
import java.util.List;

public class SQLData {


    List<Integer> muendlich;
    List<Integer> schriftlich;
    int id;

    /************ Constructor ******************/
    public SQLData(List<Integer> muendlich, List<Integer> schriftlich, int id) {
        this.muendlich = muendlich;
        this.schriftlich = schriftlich;
        this.id = id;
    }


    public SQLData(String muendlich, String schriftlich, int id){
        this.muendlich = stringToLIst(muendlich);
        this.schriftlich = stringToLIst(schriftlich);
        this.id = id;
    }

    /*************** Converter ****************/
    public String listToString(List<Integer> list){
        String substring = "";
        for (int i = 0; i < list.size(); i++) {
            substring += list.get(i) + ", ";
        }
        return substring;
    }

    public List<Integer> stringToLIst(String str){
        char[] string = str.toCharArray();
        String substring = "";
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < string.length; i++){
            if (Character.isDigit(string[i])){
                substring += string[i];
            }
            if (string[i] ==','){
                list.add(Integer.parseInt(substring));
                substring = "";
            }

        }
        return list;
    }

    /************ Getter & Setter **********/
    public List<Integer> getMuendlich() {
        return muendlich;
    }

    public void setMuendlich(List<Integer> muendlich) {
        this.muendlich = muendlich;
    }

    public List<Integer> getSchriftlich() {
        return schriftlich;
    }

    public void setSchriftlich(List<Integer> schriftlich) {
        this.schriftlich = schriftlich;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
