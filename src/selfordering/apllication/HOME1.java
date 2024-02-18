/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package selfordering.apllication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import menu_item_classes.*;
/**
 *
 * @author Hirantha perera
 */
public class HOME1 extends javax.swing.JFrame implements Runnable{

    // implement runneble to run didgital clock inside the program while proagm is running
    int hour,second,minute;
    MenuItemLinkedList original_menu_list = new MenuItemLinkedList();
    MenuItemLinkedList menu_list = new MenuItemLinkedList();

    public HOME1() 
    {
        initComponents();
        // these code for adjest coloum width
        TableColumnModel columnModel = tbl_show_menu_items.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(200); // First Name column
        columnModel.getColumn(1).setPreferredWidth(10); // Last Name column
        TableColumnModel columnMode2 = tbl_show_cart.getColumnModel();
        columnMode2.getColumn(0).setPreferredWidth(180); // First Name column
        columnMode2.getColumn(1).setPreferredWidth(10); // Last Name column
         
        //INSERT MENU ITEM DETAILS
        insertMenuDetails();
        // this codes for the digital clock
        Thread t=new Thread(this);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_beverage = new rojeru_san.complementos.RSButtonHover();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_show_cart = new javax.swing.JTable();
        billvalue = new javax.swing.JPanel();
        lbl_netTotal = new javax.swing.JLabel();
        btn_paynow = new rojeru_san.complementos.RSButtonHover();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover4 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover6 = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txt_cusTel = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_show_menu_items = new javax.swing.JTable();
        lbl_timeshow = new java.awt.Label();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        btn_pizza = new rojeru_san.complementos.RSButtonHover();
        btn_appetizer = new rojeru_san.complementos.RSButtonHover();
        btn_dessert = new rojeru_san.complementos.RSButtonHover();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lbl_timeshow1 = new java.awt.Label();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover9 = new rojeru_san.complementos.RSButtonHover();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home UI");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(156, 150, 150));
        jLabel22.setText("copyright ©PDSA | Develop By Hirantha And Liviru");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 990, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nugegoda", "Wellampitiya" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 280, 50));

        btn_beverage.setBackground(new java.awt.Color(204, 0, 51));
        btn_beverage.setText("Beverage");
        btn_beverage.setColorHover(new java.awt.Color(0, 255, 51));
        btn_beverage.setColorTextHover(new java.awt.Color(0, 0, 0));
        btn_beverage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_beverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_beverageActionPerformed(evt);
            }
        });
        jPanel1.add(btn_beverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 130, 50));

        tbl_show_cart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_show_cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ));
        tbl_show_cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_show_cart.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_show_cart.setRowHeight(40);
        tbl_show_cart.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tbl_show_cart.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_show_cart.setShowGrid(true);
        tbl_show_cart.setShowVerticalLines(false);
        jScrollPane3.setViewportView(tbl_show_cart);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 460, 500));

        billvalue.setBackground(new java.awt.Color(255, 255, 255));
        billvalue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        billvalue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_netTotal.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lbl_netTotal.setText("0.00");
        billvalue.add(lbl_netTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 120, -1));

        btn_paynow.setBackground(new java.awt.Color(204, 0, 0));
        btn_paynow.setText("Order Now");
        btn_paynow.setColorHover(new java.awt.Color(0, 153, 0));
        btn_paynow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_paynow.setIconTextGap(18);
        btn_paynow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paynowActionPerformed(evt);
            }
        });
        billvalue.add(btn_paynow, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 240, 74));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel12.setText("Total");
        billvalue.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jPanel1.add(billvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, 460, 220));

        jPanel2.setBackground(new java.awt.Color(235, 232, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover2.setBackground(new java.awt.Color(0, 153, 0));
        rSButtonHover2.setText("Min - Max");
        rSButtonHover2.setColorHover(new java.awt.Color(204, 0, 0));
        rSButtonHover2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 50));

        rSButtonHover3.setBackground(new java.awt.Color(0, 153, 0));
        rSButtonHover3.setText("Max - Min");
        rSButtonHover3.setColorHover(new java.awt.Color(204, 0, 51));
        rSButtonHover3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 50));

        rSButtonHover4.setBackground(new java.awt.Color(0, 153, 0));
        rSButtonHover4.setText("Popular");
        rSButtonHover4.setColorHover(new java.awt.Color(204, 0, 0));
        rSButtonHover4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 120, 50));

        rSButtonHover6.setBackground(new java.awt.Color(0, 153, 0));
        rSButtonHover6.setText("A - Z");
        rSButtonHover6.setColorHover(new java.awt.Color(204, 0, 51));
        rSButtonHover6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Filter By");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 330, 150));

        jPanel3.setBackground(new java.awt.Color(241, 237, 237));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 400, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Display");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 420, 280));

        txt_cusTel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_cusTel.setText("+94");
        txt_cusTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cusTelActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cusTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 320, 50));

        tbl_show_menu_items.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_show_menu_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ));
        tbl_show_menu_items.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_show_menu_items.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_show_menu_items.setRowHeight(40);
        tbl_show_menu_items.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tbl_show_menu_items.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_show_menu_items.setShowGrid(true);
        tbl_show_menu_items.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tbl_show_menu_items);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 580, 740));

        lbl_timeshow.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_timeshow.setForeground(new java.awt.Color(204, 0, 0));
        lbl_timeshow.setText("11.07.00AM");
        jPanel1.add(lbl_timeshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 10, -1, 40));

        rSButtonHover1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (2).png"))); // NOI18N
        rSButtonHover1.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (3).png"))); // NOI18N
        rSButtonHover1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (3).png"))); // NOI18N
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 10, 60, -1));

        rSButtonHover5.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/setting (2).png"))); // NOI18N
        rSButtonHover5.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/setting (3).png"))); // NOI18N
        jPanel1.add(rSButtonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1850, 10, 60, -1));

        btn_pizza.setBackground(new java.awt.Color(204, 0, 51));
        btn_pizza.setText("Pizza");
        btn_pizza.setColorHover(new java.awt.Color(0, 255, 51));
        btn_pizza.setColorTextHover(new java.awt.Color(0, 0, 0));
        btn_pizza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pizzaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 50));

        btn_appetizer.setBackground(new java.awt.Color(204, 0, 51));
        btn_appetizer.setText("Appetizer");
        btn_appetizer.setColorHover(new java.awt.Color(0, 255, 51));
        btn_appetizer.setColorTextHover(new java.awt.Color(0, 0, 0));
        btn_appetizer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_appetizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_appetizerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_appetizer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 50));

        btn_dessert.setBackground(new java.awt.Color(204, 0, 51));
        btn_dessert.setText("Dessert");
        btn_dessert.setColorHover(new java.awt.Color(0, 255, 51));
        btn_dessert.setColorTextHover(new java.awt.Color(0, 0, 0));
        btn_dessert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dessertActionPerformed(evt);
            }
        });
        jPanel1.add(btn_dessert, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 140, 50));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("copyright ©PDSA | Develop By Hirantha And Liviru");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1060, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/output-onlinepngtools.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 210, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Location");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Customer Telephone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dine In", "Take Away", "Delivery", " " }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 280, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Order Type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));

        lbl_timeshow1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_timeshow1.setForeground(new java.awt.Color(204, 0, 0));
        lbl_timeshow1.setText("11.07.00AM");
        jPanel1.add(lbl_timeshow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, 40));

        rSButtonHover7.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (2).png"))); // NOI18N
        rSButtonHover7.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (3).png"))); // NOI18N
        rSButtonHover7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (3).png"))); // NOI18N
        jPanel1.add(rSButtonHover7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 10, 60, -1));

        rSButtonHover9.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/setting (2).png"))); // NOI18N
        rSButtonHover9.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/setting (3).png"))); // NOI18N
        jPanel1.add(rSButtonHover9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 10, 60, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(156, 150, 150));
        jLabel24.setText("copyright ©PDSA | Develop By Hirantha And Liviru");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 800, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_beverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_beverageActionPerformed
        // TODO add your handling code here:
        addBeverageToTableOriginal();
    }//GEN-LAST:event_btn_beverageActionPerformed

    private void btn_paynowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paynowActionPerformed

    }//GEN-LAST:event_btn_paynowActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void txt_cusTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cusTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cusTelActionPerformed

    private void btn_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pizzaActionPerformed
        // TODO add your handling code here:
        addPizzaToTableOriginal();
    }//GEN-LAST:event_btn_pizzaActionPerformed

    private void btn_appetizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_appetizerActionPerformed
        // TODO add your handling code here:
        addAppetizerToTableOriginal();
    }//GEN-LAST:event_btn_appetizerActionPerformed

    private void btn_dessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dessertActionPerformed
        // TODO add your handling code here:
        addDessertToTableOriginal();
    }//GEN-LAST:event_btn_dessertActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(HOME1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel billvalue;
    private rojeru_san.complementos.RSButtonHover btn_appetizer;
    private rojeru_san.complementos.RSButtonHover btn_beverage;
    private rojeru_san.complementos.RSButtonHover btn_dessert;
    private rojeru_san.complementos.RSButtonHover btn_paynow;
    private rojeru_san.complementos.RSButtonHover btn_pizza;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_netTotal;
    private java.awt.Label lbl_timeshow;
    private java.awt.Label lbl_timeshow1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover4;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    private rojeru_san.complementos.RSButtonHover rSButtonHover6;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    private rojeru_san.complementos.RSButtonHover rSButtonHover9;
    private javax.swing.JTable tbl_show_cart;
    private javax.swing.JTable tbl_show_menu_items;
    private javax.swing.JTextField txt_cusTel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() 
    {
         while (true)
        {
            Calendar cal=Calendar.getInstance();
            hour=cal.get(Calendar.HOUR_OF_DAY);
            minute=cal.get(Calendar.MINUTE);
            second=cal.get(Calendar.SECOND); 
            SimpleDateFormat sdf12 =new SimpleDateFormat("hh:mm:ss aa");
            Date dat =cal.getTime();
            String time12=sdf12.format(dat);
            lbl_timeshow1.setText(time12);
        }
    }
    
    //insert Pizza details
    public void insertMenuDetails()
    {
        //insert 10 pizza details
        menu_list.insertProducts("Chicken Pizza","Pizza", 1200.00, 32, 500);
        menu_list.insertProducts("Beef Pepperoni Pizza", "Pizza", 1100.00, 35,200);
        menu_list.insertProducts("Butter Chicken Pizza", "Pizza", 1600.00, 25, 50);
        menu_list.insertProducts("Paneer Pizza", "Pizza", 990.00, 20, 450);
        menu_list.insertProducts("Sausage Delight Pizza", "Pizza", 1350.00, 20, 350);
        menu_list.insertProducts("Italian Pizza", "Pizza", 1450.00, 33, 650);
        menu_list.insertProducts("Pork Pizza", "Pizza", 2200.00, 36, 100);
        menu_list.insertProducts("Italian Veggie Pizza", "Pizza", 1000.00, 15, 1500);
        menu_list.insertProducts("American Spicy Pizza", "Pizza", 1150.00, 16, 400);
        menu_list.insertProducts("Dominoes Pizza", "Pizza", 1800.00, 21, 300);
        
        //insert 5 Appetizers
        menu_list.insertProducts("French Fries", "Appetizer", 300.00, 1000, 35);
        menu_list.insertProducts("Garlic Bread", "Appetizer", 350.00, 2000, 32);
        menu_list.insertProducts("Chicken Nuggets", "Appetizer", 200.00, 1100, 20);
        menu_list.insertProducts("Chicken Wings", "Appetizer", 150.00, 900, 18);
        menu_list.insertProducts("Cheese and Chicken balls", "Appetizer", 220.00, 960, 17);
        
        //insert 10 beverages details
        menu_list.insertProducts("Mineral Water", "Beverage", 300.00, 5400, 32);
        menu_list.insertProducts("Coca Cola", "Beverage", 1100.00, 5000, 23);
        menu_list.insertProducts("Cappuccino", "Beverage", 1200.00, 4500, 25);
        menu_list.insertProducts("Iced Coffee", "Beverage", 900.00, 3050, 31);
        menu_list.insertProducts("Strawberry Milkshake", "Beverage", 1350.00, 1350, 23);
        
        //insert 10 dessert details
        menu_list.insertProducts("Raspberry Cheesecake", "Dessert", 700.00, 2000, 23);
        menu_list.insertProducts("Lava Cake", "Dessert", 750.00, 2200, 33);
        menu_list.insertProducts("English Custard", "Dessert", 900.00, 1150, 32);
        menu_list.insertProducts("Chocolate Brownies", "Dessert", 850.00, 930, 21);
        menu_list.insertProducts("Fruit Torte", "Dessert", 1020.00, 965, 22);
        
        // Store the original pizza list
        original_menu_list.head = copyMenuItemLinkedList(menu_list.head);
    }
    public MenuItemNode copyMenuItemLinkedList(MenuItemNode head) 
    {
        MenuItemNode newHead = null;
        MenuItemNode tail = null;
        MenuItemNode current = head;
        
        while (current != null) 
        {
            MenuItemNode newNode = new MenuItemNode(current.getName(), current.getCategory(), current.getPrice(), current.getPopularity(), current.getPreparationTime());
            if (newHead == null) 
            {
                newHead = newNode;
                tail = newNode;
            } 
            else 
            {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            }
            current = current.next;
        }
        return newHead;
    }
    
    //method to display the Pizza products when Pizza button is pressed
    public void addPizzaToTableOriginal()
    {
        MenuItemNode current_product = original_menu_list.head;
        DefaultTableModel tbl_items = (DefaultTableModel) tbl_show_menu_items.getModel();
        tbl_items.setRowCount(0);
        
        while(current_product != null)
        {
            if(current_product.getCategory().equals("Pizza"))
            {
                tbl_items.addRow(new Object[]{current_product.getName(), current_product.getPrice()});
            }
            current_product = current_product.next;
        }
    }
    //method to display the Appetizer products when appetizer button is pressed
    public void addAppetizerToTableOriginal()
    {
        MenuItemNode current_product = original_menu_list.head;
        DefaultTableModel tbl_items = (DefaultTableModel) tbl_show_menu_items.getModel();
        tbl_items.setRowCount(0);
        
        while(current_product != null)
        {
            if(current_product.getCategory().equals("Appetizer"))
            {
                tbl_items.addRow(new Object[]{current_product.getName(), current_product.getPrice()});
            }
            current_product = current_product.next;
        }
    }
    //method to display the Beverage products when beverage button is pressed
    public void addBeverageToTableOriginal()
    {
        MenuItemNode current_product = original_menu_list.head;
        DefaultTableModel tbl_items = (DefaultTableModel) tbl_show_menu_items.getModel();
        tbl_items.setRowCount(0);
        
        while(current_product != null)
        {
            if(current_product.getCategory().equals("Beverage"))
            {
                tbl_items.addRow(new Object[]{current_product.getName(), current_product.getPrice()});
            }
            current_product = current_product.next;
        }
    }
    //method to display the Dessert products when Dessert button is pressed
    public void addDessertToTableOriginal()
    {
        MenuItemNode current_product = original_menu_list.head;
        DefaultTableModel tbl_items = (DefaultTableModel) tbl_show_menu_items.getModel();
        tbl_items.setRowCount(0);
        
        while(current_product != null)
        {
            if(current_product.getCategory().equals("Dessert"))
            {
                tbl_items.addRow(new Object[]{current_product.getName(), current_product.getPrice()});
            }
            current_product = current_product.next;
        }
    }
}
