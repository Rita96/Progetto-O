/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.o;

/**
 *
 * @author marcolagalla
 */
public class votanti extends persone {
    
    private String CodiceTessera;
    
    public votanti(int id, String CF, String Nome, String Cognome, String Sesso, String DataNascita, String Comune, String CodiceTessera) {
        super( id,  CF,  Nome,  Cognome,  Sesso,  DataNascita,  Comune);
        this.CodiceTessera = CodiceTessera;
    }
    
    //metodo getter
    public String getCodiceTessera() { return CodiceTessera; }
    
    //metodo setter
    public void setCodiceTessera(String CodiceTessera) { this.CodiceTessera = CodiceTessera; }
    
}
