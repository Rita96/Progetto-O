// Classe per il Bot di Votazione Automatica

package bot;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import projO_Classi.Candidati;
import projO_Connettività.MySQlConnection;
//______________________________________________________________________________
/**
 *
 * @author Team
 */
public class MainFrameBot extends javax.swing.JFrame {
    
    String log = "";
    MySQlConnection mysql = new MySQlConnection();
    ArrayList<Candidati> can = mysql.ReadCandidatiColumns();
    javax.swing.DefaultListModel listModel = new javax.swing.DefaultListModel();
    
    /**
     * Creates new form mainFrame
     */
    public MainFrameBot() {
        initComponents();
        mysql = new MySQlConnection();
        
    }
//______________________________________________________________________________
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Start = new javax.swing.JButton();
        logger_ScrollPane = new javax.swing.JScrollPane();
        logger = new javax.swing.JList<>();
        sp_Fidget = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bot votazioni");
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        bt_Start.setText("Start");
        bt_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_StartActionPerformed(evt);
            }
        });

        logger.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        logger_ScrollPane.setViewportView(logger);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(sp_Fidget, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logger_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(bt_Start))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(sp_Fidget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(logger_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_StartActionPerformed
        try {
            sp_Fidget.commitEdit();
        } catch ( java.text.ParseException e ) {e.printStackTrace();}
        
        int fidget_Value = (Integer) sp_Fidget.getValue(); // Valore Int dello Spinner
        int canditato_random = randomRange(getNumCandidati());
        int voti;
        String cf_cand = can.get(canditato_random).getCF();
        ResultSet voti_ = mysql.ExecuteQuery("SELECT Voti FROM CANDIDATI WHERE CodiceFiscale='" + cf_cand + "';");
        try {
            while (voti_.next()) {
               voti = voti_.getInt("Voti");
               voti += fidget_Value;
               int res = mysql.UpdateQuery("UPDATE CANDIDATI SET Voti='" + voti + "' WHERE CodiceFiscale='" + cf_cand + "';");
               log = "Aggiunti "+ voti +" voti al candidato "+ cf_cand;
               listModel.addElement(log);
               
            }
              logger.setModel(listModel);
        } catch (SQLException ex) {ex.printStackTrace();}
        
    }//GEN-LAST:event_bt_StartActionPerformed
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
            java.util.logging.Logger.getLogger(MainFrameBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameBot().setVisible(true);
            }
        });
    }
//______________________________________________________________________________    
       
    private int getNumCandidati() {

       return can.size();  // Utilizzo Funzione Interna ad ArrayList per ottenere la Size
    }
//______________________________________________________________________________    
    private int randomRange(int High) {    // High numero Candidati
        Random r = new Random(System.currentTimeMillis());  // Uso un SEED per evitare errori di porting
        int Low = 0;
        int Result = r.nextInt(High-Low) + Low;
        return Result;
    }
    
//______________________________________________________________________________   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Start;
    private javax.swing.JList<String> logger;
    private javax.swing.JScrollPane logger_ScrollPane;
    private javax.swing.JSpinner sp_Fidget;
    // End of variables declaration//GEN-END:variables
}
