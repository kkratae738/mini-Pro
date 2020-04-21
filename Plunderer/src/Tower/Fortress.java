package Tower;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Fortress extends javax.swing.JFrame {
    //ราคารายการหนังสือAnima
    String price[]={"139","159","179","189","198" };
    //สร้างโมเดลตาราง
    DefaultTableModel model;
    //สร้างตัว Comma
    DecimalFormat df=new DecimalFormat("#,###.00");
    //หาราคารวม
    double total=0.0;
    //เก็บแถวที่ผู้ใช้เลือก
    int selected;
    //เก็บตำแหน่งที่ซ้ำ
    int n;
    //เก็บราคารวม
     double money;
    private Object Integet;
    public Fortress() {
        initComponents();
        t1.setText(price[0]);
        model=(DefaultTableModel)tb.getModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cddow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cd = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        bn3 = new javax.swing.JButton();
        bn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        lbtotal = new javax.swing.JLabel();
        bn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("โปรแกรมหนังสือAnima");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cddow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cddow.setText("รายการหนังสือAnima");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ราคา/เล่ม");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("จำนวน");

        cd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koutetsujou no Kabaneri ผ่าพิภพดงผีดิบ", "No Game No Life Zero โนเกม โนไลฟ์ ซีโร่ ", "Black Butler  คนลึกไขปริศนาลับ (พ่อบ้านปีศาจ)", "Tokyo Ghoul PINTO โตเกียวกูล ปินโต", "Xie Wang Zhui Qi ทรราชตื๊อรัก" }));
        cd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cdItemStateChanged(evt);
            }
        });

        t2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        t1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t1.setEnabled(false);

        bn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bn3.setText("แก้ไข");
        bn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn3ActionPerformed(evt);
            }
        });

        bn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bn1.setText("เพิ่ม");
        bn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn1ActionPerformed(evt);
            }
        });

        tb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ราการหนังสือ", "ราคา/เล่ม", "จำนวน", "จำนวนเงิน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);
        if (tb.getColumnModel().getColumnCount() > 0) {
            tb.getColumnModel().getColumn(0).setResizable(false);
            tb.getColumnModel().getColumn(1).setResizable(false);
            tb.getColumnModel().getColumn(2).setResizable(false);
        }

        lbtotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbtotal.setText("ราคารวม");

        bn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bn2.setText("ลบ");
        bn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bn1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(bn2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(bn3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cddow)
                .addGap(18, 18, 18)
                .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lbtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cddow, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cdItemStateChanged
        t1.setText(price[cd.getSelectedIndex()]);
    }//GEN-LAST:event_cdItemStateChanged

    private void bn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn1ActionPerformed
      Vector v=new Vector();
        if(t2.getText().isEmpty()){
           JOptionPane.showMessageDialog(this,"กรุณาป้อนจำนวนหนังสือ","คำเตือน",
                   JOptionPane.ERROR_MESSAGE);
           
        }if(checkMenu()){
            //a=จำนวนเดิมที่เพิ่มเข้าไปก่อนหน้า
            int a=Integer.parseInt(model.getValueAt(n,2).toString())
                    +Integer.parseInt(t2.getText());
            System.out.println("a="+a);
            model.setValueAt(a, n, 2);
            //หาจำนวนเงินของแต่ละรายการ
            double price=a*Double.valueOf(tb.getValueAt(n,1).toString());
            System.out.println(" จำนวนเงินใหม่="+price);
            model.setValueAt(df.format(price),n, 3);
            //หาราคารวม
            money=Double.valueOf(t1.getText())*Double.valueOf(t2.getText());
            total+=money;
            lbtotal.setText(" ราคารวม : "+df.format(total)+" บาท ");
       }else{
       v.add(cd.getSelectedItem().toString());
       v.add(t1.getText());
       v.add(t2.getText());
       money=Double.valueOf(t1.getText())*Double.valueOf(t2.getText());
       v.add(df.format(money));
       total+=money;
       model.addRow(v);
       lbtotal.setText(" ราคารวม : "+df.format(total)+" บาท ");
    }//GEN-LAST:event_bn1ActionPerformed
  }
    private void bn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn2ActionPerformed
       if(tb.isRowSelected(selected)){
        double moneySelected=Double.valueOf(tb.getValueAt
        (selected,3).toString().replace(",", ""));
        System.out.println(" แสดงจำนวนเงิน= "+moneySelected);
        total-=moneySelected;
        lbtotal.setText(" ราคารวม : "+df.format(total)+" บาท ");
        if(total==0){
            lbtotal.setText(" ราคารวม : 0.00 บาท ");
        }
        model.removeRow(selected); 
       }else{
           JOptionPane.showMessageDialog(this,"กรุณาเลือกแถวในตาราง","คำเตือน",
                   JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_bn2ActionPerformed
  
    
    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        selected = tb.getSelectedRow();
        String name=tb.getValueAt(selected,0).toString();
        System.out.println("Name="+name);
        System.out.println(" แถวที่เลือก = "+selected);
        t2.setText(tb.getValueAt(selected,2).toString());
        //การเปลี่ยนแปลง Item ใน Combobox
        for(int i = 0; i < cd.getItemCount(); i++){
            if(name.equals(cd.getItemAt(i))){
                cd.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tbMouseClicked

    private void bn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn3ActionPerformed
        //เก็บราคาก่อนแก้ไข
        double before = Double.valueOf(tb.getValueAt(selected,1).toString())
                *Double.valueOf(tb.getValueAt(selected,2).toString());
        System.out.println("before="+before);
        //นำจำนวนลงตาราง
        tb.setValueAt(t2.getText(),selected,2);
        int amount=Integer.valueOf(t2.getText());
        //คำนวณราคาใหม่
        double bey = amount*Double.valueOf(tb.getValueAt(selected,1).toString());
        tb.setValueAt(df.format(bey),selected,3);
        total = total-before+bey;
        lbtotal.setText(" ราคารวม : "+df.format(total)+" บาท ");
    }//GEN-LAST:event_bn3ActionPerformed
    public boolean checkMenu(){
        for (int i = 0; i < tb.getRowCount(); i++){
            if(cd.getSelectedItem().toString().equals(tb.getValueAt(i, 0))){
                 n=i;
                System.out.println(" รายการหนังสือซ้ำกัน "+" ที่แถว = "+n);
                return true;
            }
        } 
        return false;
    }
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
            java.util.logging.Logger.getLogger(Fortress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fortress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fortress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fortress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fortress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bn1;
    private javax.swing.JButton bn2;
    private javax.swing.JButton bn3;
    private javax.swing.JComboBox<String> cd;
    private javax.swing.JLabel cddow;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
