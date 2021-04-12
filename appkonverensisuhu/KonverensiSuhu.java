/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class KonverensiSuhu extends javax.swing.JFrame {
    double Celcius;
    double Fahrenheit;
    double Kelvin;
    double Reamur;
    
    public KonverensiSuhu() {
        initComponents();
    }

    private void Celcius(){
        Celcius = Double.parseDouble(txtSuhu.getText());
        Fahrenheit = Celcius * 1.8 +32;
        Kelvin = Celcius + 273.15;
        Reamur = Celcius * 0.8;
       lblCelcius.setText(Celcius+" Celcius");
       lblFahrenheit.setText(Fahrenheit + "Fahrenheit");
       lblKelvin.setText(Kelvin + "Kelvin");
       lblReamur.setText(Reamur + "Reamur");
    }
    private void Fahrenheit(){
       Fahrenheit = Double.parseDouble(txtSuhu.getText());
        Celcius = (Fahrenheit - 32) / 1.8;
        Reamur = (Fahrenheit - 32) / 2.25;
        Kelvin = (Fahrenheit + 459.67) / 1.8;
       lblCelcius.setText(Celcius+" Celcius");
       lblFahrenheit.setText(Fahrenheit + "Fahrenheit");
       lblKelvin.setText(Kelvin + "Kelvin");
       lblReamur.setText(Reamur + "Reamur"); 
    }
    private void Kelvin(){
      Kelvin = Double.parseDouble(txtSuhu.getText());
        Fahrenheit = Kelvin * 1.8 - 459.67;
        Celcius = Kelvin - 273.15;
        Reamur = (Kelvin - 273.15) * 0.8;
       lblCelcius.setText(Celcius+" Celcius");
       lblFahrenheit.setText(Fahrenheit + "Fahrenheit");
       lblKelvin.setText(Kelvin + "Kelvin");
       lblReamur.setText(Reamur + "Reamur");   
    }
    private void Reamur(){
       Reamur = Double.parseDouble(txtSuhu.getText());
        Fahrenheit = (Reamur * 2.25) + 32;
        Kelvin = (Reamur / 0.8) + 273.15;
        Celcius = (Reamur / 0.8);
       lblCelcius.setText(Celcius+" Celcius");
       lblFahrenheit.setText(Fahrenheit + "Fahrenheit");
       lblKelvin.setText(Kelvin + "Kelvin");
       lblReamur.setText(Reamur + "Reamur");   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        btnKonversi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCelcius = new javax.swing.JLabel();
        lblFahrenheit = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        lblReamur = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Aplikasi Konverensi Suhu");

        rbCelcius.setText("Celcius");

        rbFahrenheit.setText("Fahrenheit");

        rbKelvin.setText("Kelvin");

        rbReamur.setText("Reamur");

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Hasil Konversi");

        lblCelcius.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCelcius.setText("Celcius");

        lblFahrenheit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFahrenheit.setText("Fahrenheit");

        lblKelvin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblKelvin.setText("Kelvin");

        lblReamur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReamur.setText("Reamur");

        jLabel7.setText("Masukkan Suhu:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCelcius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFahrenheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbKelvin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbReamur))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCelcius))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFahrenheit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblKelvin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblReamur))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbCelcius)
                        .addComponent(rbFahrenheit)
                        .addComponent(rbKelvin)
                        .addComponent(rbReamur)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKonversi)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCelcius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKelvin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReamur)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        if (rbCelcius.isSelected()){
            Celcius();
        }else if(rbFahrenheit.isSelected()){
            Fahrenheit();
        }else if(rbKelvin.isSelected()){
            Kelvin();
        }else if(rbReamur.isSelected()){
            Reamur();
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSuhu.setText("");
        lblCelcius.setText("Celcius");
        lblFahrenheit.setText("Fahrenheit");
        lblKelvin.setText("Kelvin");
        lblReamur.setText("Reamur");
        rbCelcius.setSelected(false);
        rbFahrenheit.setSelected(false);
        rbKelvin.setSelected(false);
        rbReamur.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(KonverensiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonverensiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonverensiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonverensiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonverensiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblFahrenheit;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblReamur;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
