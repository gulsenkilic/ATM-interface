
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Legion
 */
public class SifreDegistirP extends javax.swing.JFrame {

    /**
     * Creates new form SifreDegistir
     */
    public SifreDegistirP() {
        initComponents();
    }
    String sifreeski;
     public SifreDegistirP(String sifreeski) {
        initComponents();
      this.sifreeski=sifreeski;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eskisifre = new javax.swing.JTextField();
        eskisifre1 = new javax.swing.JLabel();
        yenisifre1 = new javax.swing.JLabel();
        yenisifre = new javax.swing.JTextField();
        tamam = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        geri1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eskisifre.setBackground(new java.awt.Color(0, 0, 0));
        eskisifre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        eskisifre.setForeground(new java.awt.Color(255, 255, 255));

        eskisifre1.setBackground(new java.awt.Color(0, 0, 0));
        eskisifre1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        eskisifre1.setForeground(new java.awt.Color(0, 0, 0));
        eskisifre1.setText("ESKİ ŞİFRENİZ");

        yenisifre1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        yenisifre1.setForeground(new java.awt.Color(0, 0, 0));
        yenisifre1.setText("YENİ SİFRENİZ");

        yenisifre.setBackground(new java.awt.Color(0, 0, 0));
        yenisifre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        yenisifre.setForeground(new java.awt.Color(255, 255, 255));

        tamam.setBackground(new java.awt.Color(0, 0, 0));
        tamam.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tamam.setForeground(new java.awt.Color(255, 255, 255));
        tamam.setText("TAMAM");
        tamam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamamActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SİFRE DEGİSİM EKRANI");

        geri1.setBackground(new java.awt.Color(0, 0, 0));
        geri1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        geri1.setForeground(new java.awt.Color(255, 255, 255));
        geri1.setText("GERİ");
        geri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eskisifre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yenisifre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(geri1)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tamam)
                    .addComponent(yenisifre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eskisifre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eskisifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eskisifre1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yenisifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yenisifre1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamam, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geri1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tamamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamamActionPerformed
      String e= eskisifre.getText();
      String y= yenisifre.getText();
      if(e.equals(sifreeski)&&y.length()==4){
         Personel personel = new Personel();
         personel.sifreDegistir(Integer.parseInt(y), Integer.parseInt(e));
        
           setVisible(false);
          
      } else  if(!e.equals(sifreeski)) JOptionPane.showMessageDialog(null, "Girmiş olduğunuz eski şifreniz yanlış.");
      else if(y.length()<4 || y.length()>4) JOptionPane.showMessageDialog(null, "Lütfen 4 haneli bir şifre tuşlayın");
     
    }//GEN-LAST:event_tamamActionPerformed

    private void geri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri1ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_geri1ActionPerformed

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
            java.util.logging.Logger.getLogger(SifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreDegistir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eskisifre;
    private javax.swing.JLabel eskisifre1;
    private javax.swing.JButton geri1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tamam;
    private javax.swing.JTextField yenisifre;
    private javax.swing.JLabel yenisifre1;
    // End of variables declaration//GEN-END:variables
}
