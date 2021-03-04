package view;

import DAO.BanDaDatDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.BanDaDat;

/**
 *
 * @author LongCoi
 */
public class ReceptionistHomeFrm extends javax.swing.JFrame {
    private ArrayList<BanDaDat> listTable;
 
    public ReceptionistHomeFrm() {
        initComponents();
        setLocationRelativeTo(this);
        listTable = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBookTable = new javax.swing.JButton();
        btnOrderFood = new javax.swing.JButton();
        btnStat = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnBookTable.setText("Đặt bàn");
        btnBookTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookTableActionPerformed(evt);
            }
        });

        btnOrderFood.setText("Gọi món");
        btnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFoodActionPerformed(evt);
            }
        });

        btnStat.setText("Thanh toán");
        btnStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatActionPerformed(evt);
            }
        });

        btnPay.setText("Thống kê");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Trang chủ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnBookTable)
                .addGap(18, 18, 18)
                .addComponent(btnOrderFood)
                .addGap(18, 18, 18)
                .addComponent(btnPay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStat)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookTable)
                    .addComponent(btnOrderFood)
                    .addComponent(btnPay)
                    .addComponent(btnStat))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFoodActionPerformed
        BanDaDatDAO bd = new BanDaDatDAO();
        listTable = bd.getBookedTable();
        new SelectTableFrm(listTable).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderFoodActionPerformed

    private void btnBookTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookTableActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Chức năng này đang được thực hiện!");
    }//GEN-LAST:event_btnBookTableActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Chức năng này đang được thực hiện");
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Chức năng này đang được thực hiện!");
    }//GEN-LAST:event_btnStatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ReceptionistHomeFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookTable;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnStat;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
