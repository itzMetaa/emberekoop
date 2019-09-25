package ember;

import java.util.ArrayList;
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

    @Override
    public String toString(){
        String s = "";
        for (Ember ember : this.emberekLista) {
            s+=ember+"\n";
        }
        return s;
    }
    
}
