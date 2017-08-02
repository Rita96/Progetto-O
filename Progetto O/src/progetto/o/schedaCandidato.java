/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto.o;

import java.awt.Image;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.management.ManagementFactory;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author marco
 */
public class schedaCandidato extends javax.swing.JPanel {

    MySQlConnection mysql = new MySQlConnection();
    
    /**
     * Creates new form schedaCandidato
     */
    public schedaCandidato() {
        initComponents();
    }
    
    public schedaCandidato(String CF, String Nome, String Cognome, String Partito, URL Immagine) {
        initComponents();
        setImage(Immagine);
        setCF(CF);
        setNome(Nome);
        setCognome(Cognome);
        setPartito(Partito);
    }
    
    private void setImage(URL img_) {
        ImageIcon img;
       try {
           img = new ImageIcon(img_);
       }catch (Exception ex) {
           img = new ImageIcon(".\\Immagini\\img_not_found.jpg");
           //
       }
        
        Foto.setIcon(img);
        Foto.setBounds(0, 0, 250, 250);
      //  int offset = Foto.getInsets().left;
        Foto.setIcon(resizeIcon(img, Foto.getWidth(), Foto.getHeight()));
    }
    
    private void setCF(String cf) {
        CF.setText(cf);
    }
    private void setNome(String nome) {
        Nome.setText(nome);
    }
    private void setCognome(String cognome) {
        Cognome.setText(cognome);
    }
    private void setPartito(String partito) {
        Partito.setText(partito);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        Cognome = new javax.swing.JLabel();
        Partito = new javax.swing.JLabel();
        Vota = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        CF = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(280, 534));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 534));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        Nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Cognome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cognome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Partito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Partito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Vota.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        Vota.setText("Vota");
        Vota.setPreferredSize(new java.awt.Dimension(70, 35));
        Vota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotaActionPerformed(evt);
            }
        });

        Foto.setBackground(new java.awt.Color(102, 102, 102));
        Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Foto.setMaximumSize(new java.awt.Dimension(250, 250));
        Foto.setMinimumSize(new java.awt.Dimension(250, 250));
        Foto.setPreferredSize(new java.awt.Dimension(250, 250));

        CF.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        CF.setForeground(new java.awt.Color(153, 153, 153));
        CF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CF.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cognome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Partito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Foto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Partito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Vota, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CF.getAccessibleContext().setAccessibleName("CF");
        CF.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 535, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotaActionPerformed
  
        int reply = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler votare per: " + Nome.getText() + " " + Cognome.getText() + " del " + Partito.getText() + "?", "Richiesta conferma", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
            {
               int voti;
               ResultSet voti_ = mysql.ExecuteQuery("SELECT Voti FROM CANDIDATI WHERE CodiceFiscale='" + CF.getText() + "';");

            try {
                while (voti_.next()) {
                   voti = voti_.getInt("Voti");
                   voti = voti +1;
                   int res = mysql.UpdateQuery("UPDATE CANDIDATI SET Voti='" + voti + "' WHERE CodiceFiscale='" + CF.getText() + "';");
                   if (res != 0 ) {
                      JOptionPane.showMessageDialog(null,"Votazione andata a buon fine!", "Conferma", JOptionPane.INFORMATION_MESSAGE);
                      ProgettoO.clientFrame.dispose();
                       
                   } else {
                       JOptionPane.showMessageDialog(null,"Votazione non andata a buon fine!", "Errore", JOptionPane.ERROR_MESSAGE);
                   }
                }
                } catch (SQLException ex) {
               
                }
            }
    }//GEN-LAST:event_VotaActionPerformed
private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {     // resize foto dei candidati (nei pannelli di createPan) per fit jButton
    Image img = icon.getImage();  
    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
    return new ImageIcon(resizedImage);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CF;
    private javax.swing.JLabel Cognome;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Partito;
    private javax.swing.JButton Vota;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}