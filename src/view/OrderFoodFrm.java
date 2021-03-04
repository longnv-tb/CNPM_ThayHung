/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.BanDaDatDAO;
import DAO.MonAnDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import model.MonAn;
import javax.swing.table.*;
import model.BanDaDat;
import model.MonAnDaGoi;

/**
 *
 * @author LongCoi
 */
public class OrderFoodFrm extends javax.swing.JFrame {
    private ArrayList<MonAn> listFood;
    private ArrayList<MonAnDaGoi> listOrderedFood;
    private final BanDaDat b;
    private float sum;
    
    public OrderFoodFrm(BanDaDat b) {
        initComponents();
        setLocationRelativeTo(this);
        this.b = b;
        sum = 0;
        jLabel5.setText(b.getBanAn().getTen());
        jLabel8.setText(""+b.getGioDen());
        listOrderedFood = new ArrayList<>();
        listOrderedFood = b.getListMonAnDaGoi();
        DefaultTableModel dtmOrderedFoods = (DefaultTableModel) tblSelectedFood.getModel();
        if(!listOrderedFood.isEmpty()){
            listOrderedFood.forEach((m) -> {
                dtmOrderedFoods.addRow(new Object[]{m.getMonAn().getTen(), m.getGia(), m.getSoLuong(), m.getThanhTien(), m.getGioGoi()});
                sum+=m.getThanhTien();
            });
        }
        jLabel10.setText(""+sum);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFoods = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jLableNhapSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSelectedFood = new javax.swing.JTable();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gọi món");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Bàn:");

        jLabel3.setText("Tên món:");

        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblFoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Loại", "Giá", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFoods.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblFoods);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Danh sách các món tìm được");

        btnSelect.setText("Chọn");
        btnSelect.setEnabled(false);
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLableNhapSoLuong.setText("Nhập số lượng:");
        jLableNhapSoLuong.setEnabled(false);

        txtSoLuong.setEnabled(false);

        btnOK.setText("OK");
        btnOK.setEnabled(false);
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Các món đã gọi");

        tblSelectedFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Giá", "Số lượng", "Thành tiền", "Giờ gọi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSelectedFood);

        btnConfirm.setText("Xác nhận");
        btnConfirm.setEnabled(false);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("đặt");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("jLabel8");

        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Tổng tiền:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(214, 214, 214))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSelect)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLableNhapSoLuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnOK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(165, 165, 165)
                        .addComponent(btnConfirm)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLableNhapSoLuong)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        if(tblFoods.getSelectedRow() < 0) JOptionPane.showMessageDialog(null, "Mời chọn món!");
        else{
            JOptionPane.showMessageDialog(this,"Mời nhập số lượng!");
            jLableNhapSoLuong.setEnabled(true);
            txtSoLuong.setEnabled(true);
            btnOK.setEnabled(true);
            txtSoLuong.requestFocus();
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtFoodName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Chưa nhập tên!");
            txtFoodName.requestFocus();
            return;
        }
        DefaultTableModel dtmResultSearch = (DefaultTableModel) tblFoods.getModel();
        listFood = new ArrayList<>();
        dtmResultSearch.getDataVector().removeAllElements();
        MonAnDAO md = new MonAnDAO();
        listFood = md.searchFood(txtFoodName.getText().trim());
        if(listFood.isEmpty()){
            dtmResultSearch.setNumRows(0);
            JOptionPane.showMessageDialog(null, "Không có kết quả nào phù hợp!");
            return;
        }
        listFood.forEach((m) -> {
            dtmResultSearch.addRow(new Object[]{m.getTen(),m.getLoai(),m.getGia(),m.getMoTa()});
        });
        btnSelect.setEnabled(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if(txtSoLuong.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Chưa nhập số lượng!");
        }
        else{
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                Date date = Calendar.getInstance().getTime();
                MonAnDaGoi mg = new MonAnDaGoi();
                int index = tblFoods.getSelectedRow();
                //System.out.println("index selected:"+index);
                DefaultTableModel dtmOrderedFoods = (DefaultTableModel) tblSelectedFood.getModel();

                //check if that ordered food exist list ordered food.
                for(int i=0; i<listOrderedFood.size(); i++){
                    MonAnDaGoi m = listOrderedFood.get(i);
                    if(listFood.get(index).getId() == m.getMonAn().getId()){
                        int sl = m.getSoLuong();
                        m.setSoLuong(sl+Integer.parseInt(txtSoLuong.getText().trim()));
                    //    System.out.println(m.getSoLuong());
                        m.setThanhTien(m.getSoLuong()*m.getGia());
                        dtmOrderedFoods.setValueAt(m.getSoLuong(),i, 2);
                        dtmOrderedFoods.setValueAt(m.getThanhTien(), i, 3);
                        sum += (Integer.parseInt(txtSoLuong.getText())) * m.getGia(); //update tong tien
                        jLabel10.setText(""+sum);
                        txtSoLuong.setText("");
                        btnConfirm.setEnabled(true);
                        txtSoLuong.setEnabled(false);
                        btnOK.setEnabled(false);
                        return;
                    }
                }

                //if that food not exist in list ordered food
                mg.setMonAn(listFood.get(index));
                mg.setGia(listFood.get(index).getGia());
                mg.setSoLuong(Integer.parseInt(txtSoLuong.getText().trim()));
                mg.setGioGoi(date);
                mg.setThanhTien(mg.getGia()*Integer.parseInt(txtSoLuong.getText().trim()));
                listOrderedFood.add(mg);
                dtmOrderedFoods.addRow(new Object[]{mg.getMonAn().getTen(),mg.getGia(), mg.getSoLuong(),mg.getThanhTien(), sdf.format(mg.getGioGoi())});
                sum+=mg.getThanhTien();
                jLabel10.setText(""+sum);
                txtSoLuong.setText("");
                btnConfirm.setEnabled(true);
                txtSoLuong.setEnabled(false);
                btnOK.setEnabled(false);
       //         System.out.println("size before: "+listOrderedFood.size());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Số lượng không hợp lệ!");
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        b.setListMonAnDaGoi(listOrderedFood);
        BanDaDatDAO bd = new BanDaDatDAO();
        boolean check = bd.updateFoodOfTable(b);
        if(check) {
            JOptionPane.showMessageDialog(null, "Successful!");
            new ReceptionistHomeFrm().setVisible(true);
            this.dispose();
        }
        else JOptionPane.showMessageDialog(null, "Failed");
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        new ReceptionistHomeFrm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLableNhapSoLuong;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblFoods;
    private javax.swing.JTable tblSelectedFood;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables

}
