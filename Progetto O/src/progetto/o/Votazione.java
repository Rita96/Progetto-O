/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto.o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class Votazione {

/*____________________________________STATO INTERNO________________________________________*/
    
    private String idVotazione;
    private final DateFormat f = new SimpleDateFormat("dd-MM-yyyy");
    private Calendar dataCorrente;
    private Calendar dataInizioVot;
    private Calendar dataFineVot;
    private MySQlConnection mysql = new MySQlConnection();
    private int Affluenza = 0;
 
/*____________________________________COSTRUTTORI__________________________________________*/
    
    public Votazione(String _idVotazione, String dataFine) { // il costruttore di N_TURNO crea una tabella nel db, rileva la data corrente e definisce lo stato interno
        this.idVotazione = _idVotazione; // Nome Tabella (quindi N_TURNO)
        
        try {   
            int res = mysql.UpdateQuery("CREATE TABLE `db`.`" + idVotazione+ "` ( ` Data` VARCHAR(45) NULL DEFAULT NULL,`Affluenza` INT NULL DEFAULT 0, PRIMARY KEY (`Data`)) ENGINE = InnoDB DEFAULT CHARACTER SET = latin1;");
                       if (res == 0 ) {
                           System.out.println("Errore Query");
                       }
            Calendar cal = Calendar.getInstance();
            String data = f.format(cal);
            this.dataCorrente = cal;
            
            
            this.dataInizioVot = dataCorrente;
            cal.setTime(f.parse(dataFine));// all done
            this.dataFineVot = cal;
        } catch (Exception ex) {ex.printStackTrace();}
    }
    
/*_______________________________________METODI____________________________________________*/
    
    public void chiudiVotazione() { // chiude il turno delle votazioni.
        
        resetVoti();
        
    } 
    public void addAffluenza() { // incrementa il numero dei voti nella giornata corrente, nella tabella PRIMO TURNO(idVotazione)
        Affluenza++;
       
    }
    
    public void AvanzaGiornata() { // incrementa la data corrente. Questo verrà chiamato dal Bottone AvanzaGiorno
        
        // Update dell'Attributo AFFLUENZA e Azzeramento
        try {
            mysql.UpdateQuery("UPDATE db."+ idVotazione + "SET Affluenza=" + Affluenza + ";");
        } catch (Exception ex) {
            Logger.getLogger(Votazione.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Affluenza = 0;
        
        // Incrementa la data
        
        dataCorrente.add(Calendar.DATE, 1); 
        
        // Aggiungi una riga in N_TURNO, con la data corrente (cioè di domani)
        mysql.ExecuteQuery( "INSERT INTO 'db'." + idVotazione + "' ('Data','Affluenza') VALUES ('" + dataCorrente + "', '0');" );

        
    }

    private void resetVoti() {      // setta tutti i voti nella tabella votanti a 0. Private perchè viene usato solo in questa classe
            ArrayList<persone> pers = mysql.ReadPersoneColumns();
            for (persone obj: pers) {
                mysql.UpdateQuery("UPDATE VOTANTI SET Voti=0 WHERE CodiceFiscale='" + obj.getCF() + "';");
            }
            
    }
}
