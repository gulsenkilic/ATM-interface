
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
public class PersonelEkrani extends javax.swing.JFrame {

    String tcNo=null;
    String sifre =null;
    String ad =null;
    String soyad=null;
    String unvan =null;
    Musteri musteri=new Musteri();
    int x=0;
    public PersonelEkrani() {
        initComponents();
    }
     public PersonelEkrani(String []x) {
        initComponents();
   
        tcNo=x[0];
        sifre=x[1];
        ad=x[3];
        soyad=x[4];
       unvan=x[2];
        jLabel1.setText("SAYIN "+ad.toUpperCase()+" "+soyad.toUpperCase()+" "+"LÜTFEN BİR İŞLEM SEÇİNİZ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sifredegistir = new javax.swing.JButton();
        krediOnayVer = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        musterikayit = new javax.swing.JButton();
        kayitpersonel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("LÜTFEN BİR İŞLEM SEÇİNİZ");

        sifredegistir.setBackground(new java.awt.Color(0, 0, 0));
        sifredegistir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sifredegistir.setForeground(new java.awt.Color(255, 255, 255));
        sifredegistir.setText("ŞİFRE DEĞİŞİKLİĞİ");
        sifredegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifredegistirActionPerformed(evt);
            }
        });

        krediOnayVer.setBackground(new java.awt.Color(0, 0, 0));
        krediOnayVer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        krediOnayVer.setForeground(new java.awt.Color(255, 255, 255));
        krediOnayVer.setText("KREDİ ONAYI VER");
        krediOnayVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediOnayVerActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("KREDİ KART ONAYI VER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cikis.setBackground(new java.awt.Color(0, 0, 0));
        cikis.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cikis.setForeground(new java.awt.Color(255, 255, 255));
        cikis.setText("ÇIKIŞ");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        musterikayit.setBackground(new java.awt.Color(0, 0, 0));
        musterikayit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        musterikayit.setForeground(new java.awt.Color(255, 255, 255));
        musterikayit.setText("MUSTERİ KAYIT");
        musterikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musterikayitActionPerformed(evt);
            }
        });

        kayitpersonel.setBackground(new java.awt.Color(0, 0, 0));
        kayitpersonel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kayitpersonel.setForeground(new java.awt.Color(255, 255, 255));
        kayitpersonel.setText("PERSONEL KAYIT");
        kayitpersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitpersonelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sifredegistir, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(kayitpersonel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(krediOnayVer, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(musterikayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(krediOnayVer, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(sifredegistir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(musterikayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cikis, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(kayitpersonel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sifredegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifredegistirActionPerformed
if(x==0) new SifreDegistirP(sifre).setVisible(true);
else JOptionPane.showMessageDialog(null, "Günde 1 KERE Bu İşlemi Yapabilirsiniz.");
x++;
     
    }//GEN-LAST:event_sifredegistirActionPerformed

    private void krediOnayVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediOnayVerActionPerformed
  OnayEkrani onay= new OnayEkrani();
  
  onay.setVisible(true); 
   
  
    }//GEN-LAST:event_krediOnayVerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
OnayEkrani2 onay= new OnayEkrani2();
onay.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        setVisible(false);
        new LogInEkrani().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_cikisActionPerformed

    private void musterikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musterikayitActionPerformed
  new MusteriEkle().setVisible(true);
    }//GEN-LAST:event_musterikayitActionPerformed

    private void kayitpersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitpersonelActionPerformed
if (unvan.equals("yonetici")){
 new PersonelEkle().setVisible(true);
}
else JOptionPane.showMessageDialog(null, "BU İŞLEMİ SADECE YÖNETİCİLER YAPABİLİR.");
    }//GEN-LAST:event_kayitpersonelActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kayitpersonel;
    private javax.swing.JButton krediOnayVer;
    private javax.swing.JButton musterikayit;
    private javax.swing.JButton sifredegistir;
    // End of variables declaration//GEN-END:variables
}
