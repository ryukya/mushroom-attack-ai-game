/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mushroomattack;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S855
 */
public class nama extends javax.swing.JFrame {

    /**
     * Creates new form awal
     */
    public nama(int skor) {
        initComponents();
        kolSkor.setText(""+skor);
    }
    
    public void simpan(){
        try{
           Connection c = koneksi.getkoneksi();
           Statement s = c.createStatement();
           String sql =    "INSERT into `skor` (nama, skor) VALUES ('"+kolNama.getText()+"', "+Integer.parseInt(kolSkor.getText())+")";
            
            s.executeUpdate(sql);
            s.close();
            
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Best = new javax.swing.JButton();
        gambar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kolNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kolSkor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setFocusable(false);
        setLocationByPlatform(true);
        setMaximumSize(jLabel2.getPreferredSize());
        setMinimumSize(jLabel2.getPreferredSize());
        setPreferredSize(new java.awt.Dimension(948, 635));
        getContentPane().setLayout(null);

        Best.setBackground(new java.awt.Color(255, 204, 51));
        Best.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        Best.setForeground(new java.awt.Color(255, 102, 51));
        Best.setText("OK");
        Best.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BestMouseClicked(evt);
            }
        });
        Best.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BestActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Best);
        Best.setBounds(390, 500, 184, 53);
        jLayeredPane1.add(gambar);
        gambar.setBounds(1217, 11, 0, 0);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Score Anda");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(390, 330, 200, 46);

        kolNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolNamaActionPerformed(evt);
            }
        });
        jLayeredPane1.add(kolNama);
        kolNama.setBounds(300, 230, 370, 50);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Masukkan Nama Anda");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(300, 160, 380, 46);

        kolSkor.setEditable(false);
        kolSkor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolSkorActionPerformed(evt);
            }
        });
        jLayeredPane1.add(kolSkor);
        kolSkor.setBounds(430, 390, 110, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mushroomattack/bg2.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 950, 634);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 955, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BestActionPerformed
        simpan();
        System.out.println("Berhasil Simpan");
        try {
            this.dispose();
            score aa = new score();
            aa.setVisible(true);
            aa.setSize(946, 634);
        } catch (SQLException ex) {
            Logger.getLogger(nama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BestActionPerformed

    private void BestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BestMouseClicked
String name= kolNama.getText();
//Connection_koneksi= get.
        // TODO add your handling code here:
    }//GEN-LAST:event_BestMouseClicked

    private void kolNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolNamaActionPerformed

    private void kolSkorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolSkorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolSkorActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Best;
    private javax.swing.JLabel gambar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField kolNama;
    private javax.swing.JTextField kolSkor;
    // End of variables declaration//GEN-END:variables
}
