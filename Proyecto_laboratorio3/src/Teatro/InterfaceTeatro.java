/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teatro;

import java.util.Arrays;

/**
 *
 * @author Andrew Romero
 */
public class InterfaceTeatro extends javax.swing.JFrame {
 
    int Fila;
    int Columna;
    String sillas[][];
    String Tickets[];
    int VTtickets;
    int VUtickets;
    int VTprice;
    String FilaL;
    boolean Bandera = false;
    String Seatset;
    int PUtickets;
    String letra[];
    int SillasO[];
    int v;
    int SD;
    public int price[] = new int[15];
    
   

    public void SillasDisponibles() {

        if (Bandera == false) {
            int st = 15 * 30;
            Display.setText("Sillas disponibles:\t" + st);
        } else {
            Display.setText("");
            
              SD = (15*30)- VTtickets;
             Display.append("Total de silla Disponibles:\t"+ SD+"\n\n");
             Display.append("         Sillas Disponibles  por Fila"+"\n\n");
             
            for (int i = 0; i < 15; i++) {

                for (int j = 0; j < 30; j++) {

                    if ("*".equals(sillas[i][j])) {

                        v++;
                    }
                }
                int diferencia = 30 - v;
                Display.append("Sillas disponibles en Fila  " + Filap.getItemAt(i)+":" + "\t" + diferencia + "\n");

                v = 0;
            }
        }
    }

    public void UpdatePrice() {
        
        int PI = Integer.parseInt(PrecioI.getText());
        int FP = Filap.getSelectedIndex();
        String F = (String) Filap.getSelectedItem();
        price[FP] = PI;
        letra[FP] = F;
        
        
        
        for (int i = 0; i < 15; i++) {
            Display2.append("Fila" + letra[i] + ":\t$" + price[i] + "\n");
        }
        
    }

    public void Actualizarteatro() {
        
        if ("*".equals(sillas[1][1]) || "#".equals(sillas[1][1])) {
            SD =0;
            VTtickets += VUtickets;
            VTprice += PUtickets;
            PUtickets = 0;
            VUtickets = 0;
            Bandera = true;
            AREA.setText("");
            IngresarS.setText("");
            Display.setText("");
            PrecioTU.setText("");
            constructor();
        } else {
            Display.setText("        Actualice precios!!        ");
        }
    }

    public void constructor() {

        AREA.append("  00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29" + "\n");
        AREA.append("A");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 30; j++) {

                if (Bandera == false) {
                    sillas[i][j] = "#";
                    Seatset = sillas[i][j];
                }
                if (Bandera == true) {
                    Seatset = sillas[i][j];
                }
               AREA.append("  " + Seatset);
            }

            AREA.append("\n");
            AREA.append(Filap.getItemAt(i+1));
        
        }
        
    }

    public void Teatrobuscar() {

        Fila = FilaCombo.getSelectedIndex();
        Columna = ColumnaCombo.getSelectedIndex();
        
       
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 30; j++) {

                if (Fila == i && Columna == j) {
                    if ("*".equals(sillas[Fila][Columna])) {
                        Display.setText("Silla Ocupada seleacione otra");

                    } else {
                        if ("#".equals(sillas[Fila][Columna])) {
                            VUtickets++;
                            Display.setText("");

                            PUtickets += price[Fila];
                            System.out.println(PUtickets);

                            FilaL = (String) FilaCombo.getSelectedItem();
                            IngresarS.append("Ticket" + "No." + VUtickets + " " + "- Silla:" + FilaL + Columna + "$" + price[Fila] + "\n");
                            PrecioTU.setText("" + PUtickets);

                            sillas[Fila][Columna] = "*";

                        } else {

                            Display.setText("        Actualice precios!!        ");

                        }
                    }
                }

            }

        }
    }
        

    public InterfaceTeatro() {
        this.letra = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};

        this.sillas = new String[15][30];

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AREA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        FilaCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ColumnaCombo = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        PrecioTU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SillasDisponibles = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        IngresarS = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Filap = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        PrecioI = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Display2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AREA.setEditable(false);
        AREA.setBackground(new java.awt.Color(102, 153, 255));
        AREA.setColumns(20);
        AREA.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        AREA.setRows(5);
        jScrollPane1.setViewportView(AREA);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Theter sealing Tickets");

        jButton1.setText("Actualizar Precio ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirmacion de venta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        FilaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O" }));
        FilaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilaComboActionPerformed(evt);
            }
        });

        jLabel2.setText("Fila");

        jLabel3.setText("Silla");

        ColumnaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0 ", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10", " 11", " 12", " 13", " 14", " 15", " 16", " 17", " 18", " 19", " 20", " 21", " 22", " 23", " 24", " 25", " 26", " 27", " 28", " 29" }));
        ColumnaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColumnaComboActionPerformed(evt);
            }
        });

        jButton5.setText(" $ Tickets vendidos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        PrecioTU.setEditable(false);
        PrecioTU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioTUActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio Total  $");

        jLabel5.setText("Registro");

        SillasDisponibles.setText("Sillas Disponibles");
        SillasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SillasDisponiblesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Vista General Teatro");

        IngresarS.setEditable(false);
        IngresarS.setColumns(20);
        IngresarS.setRows(5);
        jScrollPane2.setViewportView(IngresarS);

        jLabel7.setText("$");

        jLabel8.setText("Fila:");

        Filap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O" }));
        Filap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilapActionPerformed(evt);
            }
        });

        jLabel9.setText("Ingrese precio:");

        PrecioI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioIActionPerformed(evt);
            }
        });

        Display.setEditable(false);
        Display.setColumns(20);
        Display.setRows(5);
        jScrollPane3.setViewportView(Display);

        Display2.setEditable(false);
        Display2.setColumns(20);
        Display2.setRows(5);
        jScrollPane4.setViewportView(Display2);

        jLabel10.setText("Precios Actuales ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(PrecioI, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Filap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PrecioTU, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(FilaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ColumnaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Agregar))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(117, 117, 117))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addGap(0, 1, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(25, 25, 25)
                        .addComponent(SillasDisponibles)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Filap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrecioI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))))
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColumnaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar)
                    .addComponent(jButton5)
                    .addComponent(SillasDisponibles))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrecioTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        String a;
        a = PrecioI.getText();
        if ("".equals(a)) {
            Display.setText("Ingrese Precio de la fila A");
        }
        else{
            AREA.setText("");
            Display.setText("");
            Display2.setText("");
            UpdatePrice();
            constructor();
        }
            
         
         
            
        
    


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Actualizarteatro();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void FilaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilaComboActionPerformed

    private void ColumnaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColumnaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColumnaComboActionPerformed

    private void SillasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SillasDisponiblesActionPerformed
        SillasDisponibles();        // TODO add your handling code here:
    }//GEN-LAST:event_SillasDisponiblesActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Teatrobuscar();

// TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void PrecioIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioIActionPerformed

    private void PrecioTUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioTUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioTUActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Display.setText("");
        Display.append("Tickets vendidos :" + "\t" + VTtickets + "\n");
        Display.append("Precio total Tickets Vendidos :" + "\t$" + VTprice);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void FilapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilapActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceTeatro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceTeatro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceTeatro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceTeatro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceTeatro().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AREA;
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> ColumnaCombo;
    private javax.swing.JTextArea Display;
    private javax.swing.JTextArea Display2;
    private javax.swing.JComboBox<String> FilaCombo;
    private javax.swing.JComboBox<String> Filap;
    private javax.swing.JTextArea IngresarS;
    private javax.swing.JTextField PrecioI;
    private javax.swing.JTextField PrecioTU;
    private javax.swing.JButton SillasDisponibles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
