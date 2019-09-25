package ember;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Emberek {
    private List<Ember> emberekLista;

    public Emberek(){
        this.emberekLista = new ArrayList<>();
        
        String[] nevek = {"Kiss Géza","Nagy Csaba", "Xergio Damos"};
        String[] szulEvek = {"1999-2-1","1989-2-2","2107-12-02"};
        String[] szulHelyek = {"Budapest","Nagyetelke","XDLand"};                                                                                                                             
        
        for (int i = 0; i < nevek.length; i++) {
            Ember e = new Ember(nevek[i], szulEvek[i], szulHelyek[i]);
            this.emberekLista.add(e);
        }
    }
    public Emberek(String fajlNev){
        this.emberekLista = new LinkedList<>();
        try {
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            
            String sor = br.readLine();
            while (sor != null){
                Ember E = new Ember(sor);
                this.emberekLista.add(E);
                sor = br.readLine();
            } 
            
            
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.printf("Hiba: %s", ex.getMessage());
        } catch (IOException ex) {
            System.out.printf("Hiba: %s", ex.getMessage());
        } catch (Exception ex) {
            System.out.printf("Hiba: %s", ex.getMessage());
        }
    }

    @Override
    public String toString(){
        String s = "";
        for (Ember ember : this.emberekLista) {
            s+=ember+"\n";
        }
        return s;
    }
    
}
