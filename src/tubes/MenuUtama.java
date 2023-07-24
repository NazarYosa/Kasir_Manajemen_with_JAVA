
package tubes;

import javax.swing.JInternalFrame;
import java.io.File;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class MenuUtama extends javax.swing.JFrame {

    private String judul;

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        setTitle("Penjualan");
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DataBarang = new javax.swing.JButton();
        Penjualan = new javax.swing.JButton();
        Laporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 158, 125));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DataBarang.setBackground(new java.awt.Color(255, 255, 255));
        DataBarang.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        DataBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/databarang (1).png"))); // NOI18N
        DataBarang.setText("Data");
        DataBarang.setBorder(null);
        DataBarang.setIconTextGap(10);
        DataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataBarangActionPerformed(evt);
            }
        });

        Penjualan.setBackground(new java.awt.Color(255, 255, 255));
        Penjualan.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        Penjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/shopping-bag (1).png"))); // NOI18N
        Penjualan.setText("Sale");
        Penjualan.setIconTextGap(10);
        Penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjualanActionPerformed(evt);
            }
        });

        Laporan.setBackground(new java.awt.Color(255, 255, 255));
        Laporan.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/seo-report (1).png"))); // NOI18N
        Laporan.setText("Stok");
        Laporan.setIconTextGap(10);
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/image/logo (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Created By");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("21102192");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("21102061");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("21102196");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("21102049");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Laporan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Penjualan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(DataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(176, 176, 176))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 877, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataBarangActionPerformed
        // Menghapus semua JInternalFrame yang ada pada JDesktopPane
        JInternalFrame[] frames = jDesktopPane1.getAllFrames();
        for (JInternalFrame frame : frames) {
        frame.dispose();
    }
        DataBarang a = new DataBarang();
        JInternalFrame internalframe = new JInternalFrame(judul,false,true,true);
        internalframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        internalframe.setContentPane(a.getContentPane());
        internalframe.setLocation((jDesktopPane1.getWidth()-a.getWidth())/2, (jDesktopPane1.getHeight()-a.getHeight())/2);
        internalframe.pack();
        
        a.setLocationRelativeTo(this);
        internalframe.setVisible(true);
        jDesktopPane1.add(internalframe);
        
        try {
        internalframe.setMaximum(true); // Maksimalkan jendela internal
    } catch (java.beans.PropertyVetoException e) {
        // Tangkap dan tangani pengecualian jika tidak dapat memaksimalkan jendela internal
        e.printStackTrace();
    }
    }//GEN-LAST:event_DataBarangActionPerformed

    private void PenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjualanActionPerformed

        JInternalFrame[] frames = jDesktopPane1.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }

        Penjualan a = new Penjualan();
        JInternalFrame internalframe = new JInternalFrame(judul, false, true, true);
        internalframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Mengatur ukuran JInternalFrame sesuai dengan JDesktopPane
        internalframe.setSize(jDesktopPane1.getSize());

        internalframe.setContentPane(a.getContentPane());
        internalframe.setLocation((jDesktopPane1.getWidth() - a.getWidth()) / 2, (jDesktopPane1.getHeight() - a.getHeight()) / 2);

        a.setLocationRelativeTo(this);
        internalframe.setVisible(true);
        jDesktopPane1.add(internalframe);

        try {
            internalframe.setMaximum(true); // Maksimalkan jendela internal
        } catch (java.beans.PropertyVetoException e) {
            // Tangkap dan tangani pengecualian jika tidak dapat memaksimalkan jendela internal
            e.printStackTrace();
        }

        // Mengatur ukuran JDesktopPane sesuai dengan layar
        jDesktopPane1.setBounds(0, 0, getWidth(), getHeight());

        // Memperbarui tampilan frame utama
        revalidate();
        repaint();

    }//GEN-LAST:event_PenjualanActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
    // Menghapus semua JInternalFrame yang ada pada JDesktopPane
    JInternalFrame[] frames = jDesktopPane1.getAllFrames();
    for (JInternalFrame frame : frames) {
        frame.dispose();
    }
    
    try {
        JasperPrint jp = JasperFillManager.fillReport(
            getClass().getResourceAsStream("reportBarang.jasper"), null, koneksi.getKoneksi());
        JasperViewer viewer = new JasperViewer(jp, false);
        
        JInternalFrame internalframe = new JInternalFrame("Laporan Data Barang", false, true, true);
        internalframe.setContentPane(viewer.getContentPane());
        internalframe.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight()); // Mengatur ukuran
        jDesktopPane1.add(internalframe);
        internalframe.setMaximum(true); // Mengatur JInternalFrame sebagai maksimum (maximized)
        internalframe.setVisible(true); // Menampilkan JInternalFrame
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
    }
    }//GEN-LAST:event_LaporanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menuLogin a = new menuLogin();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuLogin().setVisible(true);
                //new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DataBarang;
    private javax.swing.JButton Laporan;
    private javax.swing.JButton Penjualan;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
