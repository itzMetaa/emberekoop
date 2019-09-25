package ember;

import java.util.Calendar;

public class Ember {

    private String nev;
    private String szulHely;
    private String szulIdo;
    
    public Ember(){
    
    }
    
    public Ember(String nev, String szulHely, String szulIdo) {
        this.nev = nev;
        this.szulHely = szulHely;
        this.szulIdo = szulIdo;
    }
    
    public int getSzulEv(){
        return Integer.parseInt(this.szulIdo.substring(0,3));
    }
    public int getSzulHo(){
        String[] adatok = this.szulIdo.split("-");
        return  Integer.parseInt(adatok[1]);
    }
    public int getSzulNap(){
        String[] adatok = this.szulIdo.split("-");
        return  Integer.parseInt(adatok[2]);
    }
    
    public int getEletkor(){
        int aktualisEv = Calendar.getInstance().get(Calendar.YEAR); 
        return aktualisEv-this.getSzulEv();
    }
    
        
     @Override
     public String toString() {
         return String.format("%s %s %s",
                 this.nev,
                 this.szulHely,
                 this.szulIdo);
         
     }
        
}
