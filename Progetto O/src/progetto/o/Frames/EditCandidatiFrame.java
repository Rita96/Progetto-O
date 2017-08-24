
package progetto.o.Frames;

import java.awt.Image;
import javax.swing.*;
import javax.imageio.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.filechooser.*;
import progetto.o.Connettività.FTPConnection;
import progetto.o.Connettività.MySQlConnection;
import progetto.o.Classi.Candidati;
import progetto.o.Classi.Persone;

//______________________________________________________________________________

/**
 *
 * @author Team
 */
public class EditCandidatiFrame extends javax.swing.JFrame {

     MySQlConnection mysql = new MySQlConnection();
    FTPConnection myftp = new FTPConnection();

    /**
     *
     */
    final public String IMG_REMOTE_FOLDER = "/var/www/progettoO/img";
    String path_img = "";
    static String SERVER = "http://91.134.138.244/progettoO/img/";
    String candidatoCF;
    
//______________________________________________________________________________   
    /**
     * Creates new form editCandidati_frame
     * @param _candidatoCF
     */
    public EditCandidatiFrame(String _candidatoCF) {
        initComponents();
        candidatoCF = _candidatoCF;
        fill();
    }
    
//______________________________________________________________________________
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label_nome_candidato = new javax.swing.JLabel();
        input_nome_candidato = new javax.swing.JTextField();
        input_cognome_candidato = new javax.swing.JTextField();
        label_nome_candidato1 = new javax.swing.JLabel();
        input_partito_candidato = new javax.swing.JTextField();
        label_nome_candidato2 = new javax.swing.JLabel();
        input_comune_candidato = new javax.swing.JTextField();
        label_nome_candidato3 = new javax.swing.JLabel();
        label_nome_candidato4 = new javax.swing.JLabel();
        input_sesso_candidato = new javax.swing.JComboBox<>();
        label_nome_candidato5 = new javax.swing.JLabel();
        input_codicefiscale_candidato = new javax.swing.JTextField();
        label_nome_candidato6 = new javax.swing.JLabel();
        input_datanascita_candidato = new javax.swing.JTextField();
        label_nome_candidato7 = new javax.swing.JLabel();
        sfogliaButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        confermaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modifica angrafica candidato");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        label_nome_candidato.setText("Nome:");

        input_nome_candidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nome_candidatoActionPerformed(evt);
            }
        });

        label_nome_candidato1.setText("Cognome:");

        label_nome_candidato2.setText("Partito:");

        label_nome_candidato3.setText("Comune:");

        label_nome_candidato4.setText("Sesso:");

        input_sesso_candidato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        label_nome_candidato5.setText("CodiceFiscale:");

        label_nome_candidato6.setText("Data nascita:");

        label_nome_candidato7.setText("Foto Profilo:");

        sfogliaButton.setText("Sfoglia");
        sfogliaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfogliaButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        confermaButton.setText("Conferma");
        confermaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Modifica anagrafica candidato");

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto.setMaximumSize(new java.awt.Dimension(200, 200));
        foto.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(confermaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_nome_candidato2)
                                    .addComponent(label_nome_candidato1)
                                    .addComponent(label_nome_candidato)
                                    .addComponent(label_nome_candidato3)
                                    .addComponent(label_nome_candidato6)
                                    .addComponent(label_nome_candidato5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_nome_candidato7)
                                    .addComponent(sfogliaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jButton2))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(input_datanascita_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(input_comune_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_nome_candidato4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(input_sesso_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(input_nome_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(input_cognome_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(input_partito_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(input_codicefiscale_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome_candidato)
                    .addComponent(input_nome_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome_candidato1)
                    .addComponent(input_cognome_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome_candidato2)
                    .addComponent(input_partito_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nome_candidato3)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_comune_candidato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_nome_candidato4)
                                .addComponent(input_sesso_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_datanascita_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_nome_candidato6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_codicefiscale_candidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nome_candidato5))
                .addGap(35, 35, 35)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label_nome_candidato7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sfogliaButton))
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(confermaButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_nome_candidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nome_candidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nome_candidatoActionPerformed
//______________________________________________________________________________
    
    private void sfogliaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfogliaButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fc.addChoosableFileFilter(imageFilter);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showDialog(this, "Attach");

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            path_img = file.getAbsolutePath();
            ImageIcon img = new ImageIcon(path_img);
            int offset = foto.getInsets().left;
            foto.setIcon(resizeIcon(img, foto.getWidth() - offset, foto.getHeight() - offset));
        }
    }//GEN-LAST:event_sfogliaButtonActionPerformed
//______________________________________________________________________________
    
    private void confermaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaButtonActionPerformed
        // TODO add your handling code here:
        myftp.loadFile(path_img,IMG_REMOTE_FOLDER + "/" + input_codicefiscale_candidato.getText() + ".jpg");
        int ret = mysql.UpdateQuery("UPDATE CANDIDATI SET Partito='" + input_partito_candidato.getText() + "' , Immagine='" + SERVER + input_codicefiscale_candidato.getText() + ".jpg" + "' WHERE CodiceFiscale='" + input_codicefiscale_candidato.getText() + "';");
     
        /*
        
        ======>>>  mettere update di Persone!!!
        
        */


//  int ret = mysql.WritePersoneColumns(input_codicefiscale_candidato.getText(), input_nome_candidato.getText(), input_cognome_candidato.getText(), input_sesso_candidato.getSelectedItem().toString(), input_datanascita_candidato.getText(), input_comune_candidato.getText());
      //  int ret2 = mysql.WriteCandidatiColumns(input_codicefiscale_candidato.getText(), input_partito_candidato.getText(), 0,IMG_REMOTE_FOLDER + "/" + input_codicefiscale_candidato.getText() + ".jpg");
        if (ret != 0 ) {
            JOptionPane.showMessageDialog(null,"Inserimento completato.\nDB Aggiornato.", "Conferma", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new ServerFrame().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Inserimento non completato.", "Errore", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_confermaButtonActionPerformed
//______________________________________________________________________________
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed
//______________________________________________________________________________
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null, "Sei sicuro? Questa operazione svuoterà tutti i campi.", "Richiesta conferma", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
            {
                clear();
            }
    }//GEN-LAST:event_jButton2ActionPerformed
//______________________________________________________________________________
    
    private void fill() {
           ArrayList<Candidati> can = mysql.ReadCandidatiColumns();
           ArrayList<Persone> pers = mysql.ReadPersoneColumns();
           
       for (Candidati object: can) {
            if (object.getCF().equals(candidatoCF)) {  // match 
               ImageIcon img = new ImageIcon();
               input_partito_candidato.setText(object.getPartito().toString());
               input_codicefiscale_candidato.setText(object.getCF().toString());
             //  JOptionPane.showMessageDialog(null,object.getImmagine()., pers);
            try {
                img = new ImageIcon(object.getImmagine());
            }catch (Exception ex) {
                img = new ImageIcon(".\\Immagini\\img_not_found.jpg");
            }
            
            int offset = foto.getInsets().left;
            foto.setIcon(resizeIcon(img, foto.getWidth() - offset, foto.getHeight() - offset));
            
            break;
           }
    }
       
    for (Persone object: pers) {
        if (object.getCF().equals(candidatoCF)) {  // match 
            input_nome_candidato.setText(object.getNome().toString());
            input_cognome_candidato.setText(object.getCognome().toString());
            input_comune_candidato.setText(object.getComune().toString());
            input_datanascita_candidato.setText(object.getDataNascita().toString());
            
            if ( object.getSesso().toString().equals("M") )   // hard coded, non mi piace molto
                input_sesso_candidato.setSelectedIndex(0);
            else
                input_sesso_candidato.setSelectedIndex(1);
        }
    }
    }
    
//______________________________________________________________________________
    
    private void clear() {
        input_nome_candidato.setText(null);
        input_cognome_candidato.setText(null);
        input_codicefiscale_candidato.setText(null);
        input_partito_candidato.setText(null);
        input_comune_candidato.setText(null);
        input_datanascita_candidato.setText(null);
        foto.setIcon(null);
    }
    
//______________________________________________________________________________
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditCandidatiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCandidatiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCandidatiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCandidatiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCandidatiFrame("").setVisible(true);
              
            }
        });
    }
//______________________________________________________________________________
    
    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {     // resize foto dei Candidati (nei pannelli di createPan) per fit jButton
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
//______________________________________________________________________________
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confermaButton;
    private javax.swing.JLabel foto;
    private javax.swing.JTextField input_codicefiscale_candidato;
    private javax.swing.JTextField input_cognome_candidato;
    private javax.swing.JTextField input_comune_candidato;
    private javax.swing.JTextField input_datanascita_candidato;
    private javax.swing.JTextField input_nome_candidato;
    private javax.swing.JTextField input_partito_candidato;
    private javax.swing.JComboBox<String> input_sesso_candidato;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_nome_candidato;
    private javax.swing.JLabel label_nome_candidato1;
    private javax.swing.JLabel label_nome_candidato2;
    private javax.swing.JLabel label_nome_candidato3;
    private javax.swing.JLabel label_nome_candidato4;
    private javax.swing.JLabel label_nome_candidato5;
    private javax.swing.JLabel label_nome_candidato6;
    private javax.swing.JLabel label_nome_candidato7;
    private java.awt.Panel panel1;
    private javax.swing.JButton sfogliaButton;
    // End of variables declaration//GEN-END:variables
}
