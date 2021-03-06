package projO_Frames;

// <editor-fold defaultstate="collapsed" desc="IMPORTS">
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

// imports per database
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import projO_Classi.Utility;

// imports interni
import projO_Connettività.MySQlConnection;
// </editor-fold>


/**
 * Frame necessario per creare la ClientFrame nella quale vengono indicati tutti i candidati in 'gara'
 * @author Team
 */

public class SchedaCandidatoFrame extends javax.swing.JPanel {

    MySQlConnection mySQL = new MySQlConnection();
    private static boolean votato = false;     // Controlla se l'utente vota o meno
    
    /**
     * Csotruttore con inizializzazione dei componenti
     */
    public SchedaCandidatoFrame() {
        initComponents();
        votato = false; // alla creazione imposta di default la votazione a falso
    }
 //______________________________________________________________________________
    
    /**
     *
     * @param CF
     * @param Nome
     * @param Cognome
     * @param Partito
     * @param Immagine rappresenta l'immagine del profilo del candidato
     */
    public SchedaCandidatoFrame(String CF, String Nome, String Cognome, String Partito, URL Immagine) {
        initComponents();
        setImage(Immagine);
        setCF(CF);
        setNome(Nome);
        setCognome(Cognome);
        setPartito(Partito);
    }
//______________________________GETTER/SETTER________________________________________________

    /**
     * Setta l'Immagine caricandola oppure inserendo quella del NotFound se non trovata
     * @param img_ 
     */
    public void setImage(URL img_) {
        ImageIcon img;
       try {
           img = new ImageIcon(img_);
       }catch (Exception ex) {
           img = new ImageIcon(".\\Immagini\\img_not_found.jpg");
           //
       }
        
        lb_Foto.setIcon(img);
        lb_Foto.setBounds(0, 0, 250, 250);
        lb_Foto.setIcon(Utility.resizeIcon(img, lb_Foto.getWidth(), lb_Foto.getHeight()));
    }
    
    /**
     *
     * @param cf Codice Fiscale del Candidato
     */
    public void setCF(String cf) {
        lb_CF.setText(cf);
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        lb_Nome.setText(nome);
    }

    /**
     *
     * @param cognome
     */
    public void setCognome(String cognome) {
        lb_Cognome.setText(cognome);
    }

    /**
     *
     * @param partito ovvero il partito di appartenenza
     */
    public void setPartito(String partito) {
        lb_Partito.setText(partito);
    }

    public static boolean isVotato() {
        return votato;
    }
    
    
//______________________________________________________________________________

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_AllContainer = new javax.swing.JPanel();
        lb_Nome = new javax.swing.JLabel();
        lb_Cognome = new javax.swing.JLabel();
        lb_Partito = new javax.swing.JLabel();
        bt_Vota = new javax.swing.JButton();
        lb_Foto = new javax.swing.JLabel();
        lb_CF = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(280, 534));

        panel_AllContainer.setBackground(new java.awt.Color(255, 255, 255));
        panel_AllContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        panel_AllContainer.setPreferredSize(new java.awt.Dimension(280, 534));
        panel_AllContainer.setRequestFocusEnabled(false);
        panel_AllContainer.setVerifyInputWhenFocusTarget(false);

        lb_Nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_Cognome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Cognome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_Partito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Partito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt_Vota.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        bt_Vota.setText("Vota");
        bt_Vota.setPreferredSize(new java.awt.Dimension(70, 35));
        bt_Vota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_VotaActionPerformed(evt);
            }
        });

        lb_Foto.setBackground(new java.awt.Color(102, 102, 102));
        lb_Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_Foto.setMaximumSize(new java.awt.Dimension(250, 250));
        lb_Foto.setMinimumSize(new java.awt.Dimension(250, 250));
        lb_Foto.setPreferredSize(new java.awt.Dimension(250, 250));

        lb_CF.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        lb_CF.setForeground(new java.awt.Color(153, 153, 153));
        lb_CF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_CF.setText("jLabel1");

        javax.swing.GroupLayout panel_AllContainerLayout = new javax.swing.GroupLayout(panel_AllContainer);
        panel_AllContainer.setLayout(panel_AllContainerLayout);
        panel_AllContainerLayout.setHorizontalGroup(
            panel_AllContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_AllContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_AllContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_CF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_Vota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_AllContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_AllContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_Cognome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_Partito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_Foto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel_AllContainerLayout.setVerticalGroup(
            panel_AllContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AllContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_CF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Partito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Vota, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lb_CF.getAccessibleContext().setAccessibleName("CF");
        lb_CF.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_AllContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_AllContainer, 535, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
// Metodo che Effettua il vero e proprio VOTO
    private void bt_VotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_VotaActionPerformed
  
        int reply = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler votare per: " + lb_Nome.getText() + " " + lb_Cognome.getText() + " del " + lb_Partito.getText() + "?", "Richiesta conferma", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION){
               int voti;
               ResultSet voti_ = mySQL.executeQuery("SELECT Voti FROM CANDIDATI WHERE CodiceFiscale='" + lb_CF.getText() + "';");
               
            try {
                while (voti_.next()) {
                   voti = voti_.getInt("Voti");
                   voti = voti +1;
                   int res = mySQL.updateQuery("UPDATE CANDIDATI SET Voti='" + voti + "' WHERE CodiceFiscale='" + lb_CF.getText() + "';");
                   
                   if ((res != 0 )) {
                      JOptionPane.showMessageDialog(null,"Votazione andata a buon fine!", "Conferma", JOptionPane.INFORMATION_MESSAGE);
                      votato = true;
                      ProgettoO.clientFrame.dispose();
                      Utility.resetTextField(ProgettoO.getCodiceFiscale(), "Inserire qui il Codice Fiscale"); // reset del JtextField nell'interfaccia principale
                      Utility.resetTextField(ProgettoO.getCodiceTessera(), "Inserire qui il codice della Tessera Elettorale"); // reset del JtextField nell'interfaccia principale                       
                   } else {
                       JOptionPane.showMessageDialog(null,"Votazione non andata a buon fine!", "Errore", JOptionPane.ERROR_MESSAGE);
                   }
                }
            } catch (SQLException ex) {ex.printStackTrace();}
        }
    }//GEN-LAST:event_bt_VotaActionPerformed

//______________________________________________________________________________

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Vota;
    private javax.swing.JLabel lb_CF;
    private javax.swing.JLabel lb_Cognome;
    private javax.swing.JLabel lb_Foto;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_Partito;
    private javax.swing.JPanel panel_AllContainer;
    // End of variables declaration//GEN-END:variables
}
