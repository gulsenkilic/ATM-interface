
import javax.swing.JOptionPane;

public class AnaEkran extends javax.swing.JFrame {

    
    String tcNo=null;
    String sifre =null;
    String ad =null;
    String soyad=null;
    String hesapno =null;
    Musteri musteri=new Musteri();
    String[] yedek;
    int i=0;
    int y=0;
    int x=0;
    
    public AnaEkran() {
        initComponents();
    }
    public AnaEkran(String []x) {
        initComponents();
        
        yedek=x;
        tcNo=x[0];
        sifre=x[1];
        ad=x[2];
        soyad=x[3];
        hesapno=x[4];
        jLabel1.setText("SAYIN "+ad.toUpperCase()+" "+soyad.toUpperCase()+" "+"LÜTFEN BİR İŞLEM SEÇİNİZ");
    }
    public AnaEkran(Musteri musteri1) {
        initComponents();
        musteri=musteri1;      
    }
 
 public AnaEkran(String x,String y) {
        initComponents();
        tcNo=x;
        sifre=y;
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sifredegistir = new javax.swing.JButton();
        bakiyesorgula = new javax.swing.JButton();
        kartborcode = new javax.swing.JButton();
        paracek = new javax.swing.JButton();
        krediborcode = new javax.swing.JButton();
        parayatir = new javax.swing.JButton();
        kartlimitguncelleme = new javax.swing.JButton();
        paratransfer = new javax.swing.JButton();
        faturaode = new javax.swing.JButton();
        kredibasvur = new javax.swing.JButton();
        kartbasvur = new javax.swing.JButton();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ANA MENU");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(10, 10, 10, 10));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LÜTFEN BİR İŞLEM SEÇİNİZ");

        sifredegistir.setBackground(new java.awt.Color(0, 0, 0));
        sifredegistir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sifredegistir.setForeground(new java.awt.Color(255, 255, 255));
        sifredegistir.setText("SİFRE DEĞİŞİKLİĞİ");
        sifredegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifredegistirActionPerformed(evt);
            }
        });

        bakiyesorgula.setBackground(new java.awt.Color(0, 0, 0));
        bakiyesorgula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bakiyesorgula.setForeground(new java.awt.Color(255, 255, 255));
        bakiyesorgula.setText("BAKİYE SORGULAMA");
        bakiyesorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakiyesorgulaActionPerformed(evt);
            }
        });

        kartborcode.setBackground(new java.awt.Color(0, 0, 0));
        kartborcode.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kartborcode.setForeground(new java.awt.Color(255, 255, 255));
        kartborcode.setText("KART BORCU ÖDEME");
        kartborcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartborcodeActionPerformed(evt);
            }
        });

        paracek.setBackground(new java.awt.Color(0, 0, 0));
        paracek.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        paracek.setForeground(new java.awt.Color(255, 255, 255));
        paracek.setText("PARA ÇEKME");
        paracek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paracekActionPerformed(evt);
            }
        });

        krediborcode.setBackground(new java.awt.Color(0, 0, 0));
        krediborcode.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        krediborcode.setForeground(new java.awt.Color(255, 255, 255));
        krediborcode.setText("KREDİ BORCU ÖDEME");
        krediborcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediborcodeActionPerformed(evt);
            }
        });

        parayatir.setBackground(new java.awt.Color(0, 0, 0));
        parayatir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        parayatir.setForeground(new java.awt.Color(255, 255, 255));
        parayatir.setText("PARA YATIRMA");
        parayatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parayatirActionPerformed(evt);
            }
        });

        kartlimitguncelleme.setBackground(new java.awt.Color(0, 0, 0));
        kartlimitguncelleme.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kartlimitguncelleme.setForeground(new java.awt.Color(255, 255, 255));
        kartlimitguncelleme.setText("KART LİMİTİ GÜNCELLEME");
        kartlimitguncelleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartlimitguncellemeActionPerformed(evt);
            }
        });

        paratransfer.setBackground(new java.awt.Color(0, 0, 0));
        paratransfer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        paratransfer.setForeground(new java.awt.Color(255, 255, 255));
        paratransfer.setText("PARA TRANSFERİ");
        paratransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paratransferActionPerformed(evt);
            }
        });

        faturaode.setBackground(new java.awt.Color(0, 0, 0));
        faturaode.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        faturaode.setForeground(new java.awt.Color(255, 255, 255));
        faturaode.setText("FATURA ÖDEME");
        faturaode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faturaodeActionPerformed(evt);
            }
        });

        kredibasvur.setBackground(new java.awt.Color(0, 0, 0));
        kredibasvur.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kredibasvur.setForeground(new java.awt.Color(255, 255, 255));
        kredibasvur.setText("KREDİ BASVURUSU");
        kredibasvur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kredibasvurActionPerformed(evt);
            }
        });

        kartbasvur.setBackground(new java.awt.Color(0, 0, 0));
        kartbasvur.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kartbasvur.setForeground(new java.awt.Color(255, 255, 255));
        kartbasvur.setText("KREDİ KARTI BASVURUSU");
        kartbasvur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartbasvurActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(parayatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kartborcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sifredegistir, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                            .addComponent(kartbasvur, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kredibasvur, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(krediborcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bakiyesorgula, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(paratransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(kartlimitguncelleme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(faturaode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(paracek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifredegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyesorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paracek, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(parayatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paratransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faturaode, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kartlimitguncelleme, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(kartborcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(krediborcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kredibasvur, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kartbasvur, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cikis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sifredegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifredegistirActionPerformed
if(x==0)new SifreDegistir(sifre).setVisible(true);
else JOptionPane.showMessageDialog(null, "Günde 1 KERE Bu İşlemi Yapabilirsiniz.");
x++;
   
    }//GEN-LAST:event_sifredegistirActionPerformed

    private void bakiyesorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakiyesorgulaActionPerformed
MusteriHesabi musterihesabi=new MusteriHesabi();   

musterihesabi.bakiyeSorgulama(Integer.parseInt(hesapno));


    }//GEN-LAST:event_bakiyesorgulaActionPerformed

    private void paracekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paracekActionPerformed
       MusteriHesabi musterihesabi=new MusteriHesabi();  
       musterihesabi.paraCek(Integer.parseInt(hesapno));
    }//GEN-LAST:event_paracekActionPerformed

    private void parayatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parayatirActionPerformed
     MusteriHesabi musterihesabi=new MusteriHesabi();  
       musterihesabi.paraYatir(Integer.parseInt(hesapno));
//new ParaTransfer(hesapno).setVisible(true);
    }//GEN-LAST:event_parayatirActionPerformed

    private void kartlimitguncellemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartlimitguncellemeActionPerformed
     MusteriHesabi musterihesabi=new MusteriHesabi();  
     musterihesabi.kartLimitiGuncelleme(Integer.parseInt(hesapno));
    }//GEN-LAST:event_kartlimitguncellemeActionPerformed

    private void krediborcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediborcodeActionPerformed
        MusteriHesabi musterihesabi=new MusteriHesabi();
        Musteri musteri=new Musteri();
        musteri.isim=ad;
        musteri.soyisim=soyad;
        musteri.tcNo=Integer.parseInt(tcNo);
        musteri.hesapNo=Integer.parseInt(hesapno);
        musterihesabi.krediOde(musteri.hesapNo,musteri.tcNo);
    }//GEN-LAST:event_krediborcodeActionPerformed

    private void kartborcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartborcodeActionPerformed
       MusteriHesabi musterihesabi=new MusteriHesabi();
        Musteri musteri=new Musteri();
        musteri.isim=ad;
        musteri.soyisim=soyad;
        musteri.tcNo=Integer.parseInt(tcNo);
        musteri.hesapNo=Integer.parseInt(hesapno);
        musterihesabi.kartBorcuOde(musteri.hesapNo,musteri.tcNo);
    }//GEN-LAST:event_kartborcodeActionPerformed

    private void faturaodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faturaodeActionPerformed
     new FaturaOdemeEkrani(yedek).setVisible(true);
     
    }//GEN-LAST:event_faturaodeActionPerformed

    private void paratransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paratransferActionPerformed
 Musteri musteri=new Musteri();
 MusteriHesabi musterihesabi=new MusteriHesabi();
        musteri.isim=ad;
        musteri.soyisim=soyad;
        musteri.tcNo=Integer.parseInt(tcNo);
        musteri.hesapNo=Integer.parseInt(hesapno);
        new ParaTransfer(hesapno).setVisible(true);
        
    }//GEN-LAST:event_paratransferActionPerformed

    private void kredibasvurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kredibasvurActionPerformed
       
      if(i==0) new BasvuruKredi(tcNo,hesapno).setVisible(true);
      else JOptionPane.showMessageDialog(null, "Günde 1 KERE Bu İşlemi Yapabilirsiniz.");
       i++;
    }//GEN-LAST:event_kredibasvurActionPerformed

    private void kartbasvurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartbasvurActionPerformed
  Basvuru basvur =new Basvuru();
  if(y==0) basvur.kredikartBasvurusu(Integer.parseInt(tcNo),Integer.parseInt(hesapno));
  else JOptionPane.showMessageDialog(null, "Günde 1 KERE Bu İşlemi Yapabilirsiniz.");
  y++;
    }//GEN-LAST:event_kartbasvurActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        setVisible(false);
        new LogInEkrani().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_cikisActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
               
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bakiyesorgula;
    private javax.swing.JButton cikis;
    private javax.swing.JButton faturaode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kartbasvur;
    private javax.swing.JButton kartborcode;
    private javax.swing.JButton kartlimitguncelleme;
    private javax.swing.JButton kredibasvur;
    private javax.swing.JButton krediborcode;
    private javax.swing.JButton paracek;
    private javax.swing.JButton paratransfer;
    private javax.swing.JButton parayatir;
    private javax.swing.JButton sifredegistir;
    // End of variables declaration//GEN-END:variables
}
