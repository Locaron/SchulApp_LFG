package lfg.locaron.schulapp_lfg.SQLite;

public class StundenplanData {

    int stunde;
    int tag;
    int raum;
    int fach;

    public StundenplanData(int stunde, int tag, int raum, int fach) {
        this.stunde = stunde;
        this.tag = tag;
        this.raum = raum;
        this.fach = fach;
    }

    /*********** Getter & Setter **********/
    public int getStunde() {
        return stunde;
    }

    public void setStunde(int stunde) {
        this.stunde = stunde;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getRaum() {
        return raum;
    }

    public void setRaum(int raum) {
        this.raum = raum;
    }

    public int getFach() {
        return fach;
    }

    public void setFach(int fach) {
        this.fach = fach;
    }
}
