/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_laboratorio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class carros extends javax.swing.JFrame {

    /**
     * Creates new form carros
     */ Vector reserva=new Vector();
        Vector reserva2=new Vector();
        int Perfectcounter=0;
        LinkedList Total= new LinkedList();
        LinkedList placas= new LinkedList();
        LinkedList horaingreso= new LinkedList(); 
        Vector horasalidas= new Vector(); 
        LinkedList tiempototal= new LinkedList();
        LinkedList valorpagar= new LinkedList();
        String identificador="";
        boolean uno =false;
        boolean dos =false;
        boolean tres =false;
        boolean cuatro =false;
        boolean cinco =false;
        boolean seis =false;
        boolean siete =false;
        boolean ocho =false;
        boolean nueve =false;
        boolean diez =false;
        boolean once =false;
        boolean doce =false;
    public carros() {
       
        
        initComponents();
        Espacios.removeAllItems();
        Espacios.addItem("Espacio 1.");
        Espacios.addItem("Espacio 2.");
        Espacios.addItem("Espacio 3.");
        Espacios.addItem("Espacio 4.");
        Espacios.addItem("Espacio 5.");
        Espacios.addItem("Espacio 6.");
        Espacios.addItem("Espacio 7.");
        Espacios.addItem("Espacio 8.");
        Espacios.addItem("Espacio 9.");
        Espacios.addItem("Espacio 10.");
        Espacios.addItem("Espacio 11.");
        Espacios.addItem("Espacio 12.");
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
        botoingreso = new javax.swing.JButton();
        Espacios = new javax.swing.JComboBox<>();
        botonsalida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        gana = new javax.swing.JButton();
        placafield = new javax.swing.JTextField();
        horafield = new javax.swing.JTextField();
        Placa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestion de carros");

        botoingreso.setText("igresar carro");
        botoingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoingresoActionPerformed(evt);
            }
        });

        Espacios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Espacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspaciosActionPerformed(evt);
            }
        });

        botonsalida.setText("sacar carro");
        botonsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalidaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "placa", "Hora entrada", "Hota de salida", "tiempo de estadia", "valor a pagar"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        gana.setText("calcular ganancia actual");
        gana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganaActionPerformed(evt);
            }
        });

        placafield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placafieldActionPerformed(evt);
            }
        });

        Placa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Placa.setText("placa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Hora de entrada/salida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Placa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Espacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(placafield, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(botoingreso)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(botonsalida))
                                    .addComponent(horafield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(gana)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Espacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Placa))
                            .addComponent(jLabel3))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(placafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(horafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonsalida)
                                    .addComponent(botoingreso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gana)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalidaActionPerformed
        // TODO add your handling code |here:
        reserva.clear();
        reserva2.clear();
        String placa=placafield.getText();
        String horasalida=horafield.getText();
        reserva.addAll(placas);
        reserva2.addAll(horaingreso);
        if(identificador.charAt(0)==placa.charAt(0)&&identificador.charAt(1)==placa.charAt(1)&&identificador.charAt(2)==placa.charAt(2)&&identificador.charAt(3)==placa.charAt(3)&&identificador.charAt(4)==placa.charAt(4)&&identificador.charAt(5)==placa.charAt(5))
        {
        if(Espacios.getSelectedItem()=="Espacio 1."&& uno==true )
        {   
            horasalidas.add(reserva.indexOf(placa),horasalida);
            uno=false;
            identificador="";
            
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 2."&&dos==true )
        {
            horasalidas.add(reserva.indexOf(placa),horasalida);
            dos=false;
            identificador="";
        }  
        else{
        if(Espacios.getSelectedItem()=="Espacio 3."&&tres==true )
        {
        
            horasalidas.add(reserva.indexOf(placa),horasalida);
          tres=false;
           identificador="";
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 4."&&cuatro==true )
        {
          
            horasalidas.add(reserva.indexOf(placa),horasalida);
            cuatro=false;
            identificador="";
        }  
        else{
        if(Espacios.getSelectedItem()=="Espacio 5."&&cinco==true )
        {
           
            horasalidas.add(reserva.indexOf(placa),horasalida);
            cinco=false;
             identificador="";
        }  
        else{
        if(Espacios.getSelectedItem()=="Espacio 6."&&seis==true )
        {
            
            horasalidas.add(reserva.indexOf(placa),horasalida);
            seis=false;
             identificador="";
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 7."&&siete==true )
        {
           
            horasalidas.add(reserva.indexOf(placa),horasalida);
            siete=false;
             identificador="";
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 8."&&ocho==true )
        {
           
            horasalidas.add(reserva.indexOf(placa),horasalida);
            ocho=false;
             identificador="";
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 9."&&nueve==true )
        {
            
            horasalidas.add(reserva.indexOf(placa),horasalida);
      nueve=false;
       identificador="";
        }  
        else{
        if(Espacios.getSelectedItem()=="Espacio 10."&&diez==true )
        {
            
            horasalidas.add(reserva.indexOf(placa),horasalida);
            diez=false;
             identificador="";
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 11."&&once==true )
        {
           
            horasalidas.add(reserva.indexOf(placa),horasalida);
            once=false;
            identificador="";
        } else
        {
        if(Espacios.getSelectedItem()=="Espacio 12."&&doce==true )
        {
           
            horasalidas.add(reserva.indexOf(placa),horasalida);
           doce=false;
            identificador="";
        } 
        
        else
        {
           JOptionPane.showMessageDialog(null,"Espacio vacio"); 
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
}else
        {
           JOptionPane.showMessageDialog(null,"placa incorrecta intente nuevamente."); 
        }
    }//GEN-LAST:event_botonsalidaActionPerformed

    private void EspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspaciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspaciosActionPerformed

    private void botoingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoingresoActionPerformed
        // TODO add your handling code here:
        reserva.clear();
        reserva2.clear();
        String placa=placafield.getText();
        String horaentrada=horafield.getText();
        reserva.addAll(placas);
        reserva2.addAll(horaingreso);
                   if(Espacios.getSelectedItem()=="Espacio 1."&&uno==false)
        {
            
            placas.add(placa);
            horaingreso.add(horaentrada);
            uno=true;
            identificador=placa;
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 2."&&dos==false)
        {
            placas.add(placa);
            horaingreso.add(horaentrada);
            dos=true;
            identificador=placa;
        }  
        else{
        if(Espacios.getSelectedItem()=="Espacio 3."&&tres==false)
        {
          placas.add(placa);
          horaingreso.add(horaentrada);
          tres=true;
          identificador=placa;
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 4."&&cuatro==false)
        {
           placas.add(placa); 
           horaingreso.add(horaentrada);
           cuatro=true;
           identificador=placa;
        }  
        else{
        if(Espacios.getSelectedItem()=="Espacio 5."&&cinco==false)
        {
            placas.add(placa);
            horaingreso.add(horaentrada);
            cinco=true;
            identificador=placa;
        }  
        else{
        if(Espacios.getSelectedItem()=="Espacio 6."&&seis==false)
        {
            placas.add(placa);
            horaingreso.add(horaentrada);
            seis=true;
            identificador=placa;
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 7."&&siete==false)
        {
            placas.add(placa);
            horaingreso.add(horaentrada);
            siete=true;
            identificador=placa;
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 8."&&ocho==false)
        {
            placas.add(placa);
            horaingreso.add(horaentrada);
            ocho=true;
            identificador=placa;
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 9."&&nueve==false)
        {
            placas.add(placa);
            horaingreso.add(horaentrada);
      nueve=true;
      identificador=placa;
        }  
        else{
        if(Espacios.getSelectedItem()=="Espacio 10."&&diez==false)
        {
            placas.add(placa);
            horaingreso.add(horaentrada);
            diez=true;
            identificador=placa;
        }   
        else{
        if(Espacios.getSelectedItem()=="Espacio 11."&&once==false)
        {
            placas.add(placa);
            horaingreso.add(horaentrada);
            once=true;
            identificador=placa;
        } else
        {
        if(Espacios.getSelectedItem()=="Espacio 12."&&doce==false)
        {
           placas.add(placa);
           horaingreso.add(horaentrada);
           doce=true;
           identificador=placa;
        } 
        
        else
        {
           JOptionPane.showMessageDialog(null,"espacio ocupado"); 
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
           
    }//GEN-LAST:event_botoingresoActionPerformed

    private void placafieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placafieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placafieldActionPerformed

    private void ganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganaActionPerformed
        // TODO add your handling code here:
        for(int contadorultradiscreto=0;contadorultradiscreto<placas.size();contadorultradiscreto++)
        {
            String precio="";
            int minutoss=0,horass=0,tempo=0,auxiliarpalprecio=0;
            int mminuto=0,hhora=0,doubletempo=0;
            String auxiliaresdevuelo1="",minutos="",horas="";
            String auxiliaresdevuelo2="",minuto="",hora="",totaltiempo="";
            int tiempo=0;
            jTable1.setValueAt(reserva.get(contadorultradiscreto),contadorultradiscreto,0);
            jTable1.setValueAt(reserva2.get(contadorultradiscreto),contadorultradiscreto,1);
            jTable1.setValueAt(horasalidas.get(contadorultradiscreto),contadorultradiscreto,2);
            auxiliaresdevuelo1=reserva2.get(contadorultradiscreto).toString();
            auxiliaresdevuelo2=horasalidas.get(contadorultradiscreto).toString();
            if(auxiliaresdevuelo1.length()<5)
            {
            minutos=auxiliaresdevuelo1.substring(2);
           horas=auxiliaresdevuelo1.substring(0, 1);            
            }else{
            minutos=auxiliaresdevuelo1.substring(3);
            horas=auxiliaresdevuelo1.substring(0, 2);
            }
            if(auxiliaresdevuelo2.length()<5)
            {
            minuto=auxiliaresdevuelo2.substring(2);
            hora=auxiliaresdevuelo2.substring(0, 1);            
            }else{
            minuto=auxiliaresdevuelo2.substring(3);
            hora=auxiliaresdevuelo2.substring(0, 2);
            }
            minutoss=Integer.parseInt(minutos);
            mminuto=Integer.parseInt(minuto);
            horass=Integer.parseInt(horas);
            hhora=Integer.parseInt(hora);
            tempo=hhora-horass;
           doubletempo=mminuto-minutoss;
           if(doubletempo<10){
               totaltiempo=tempo+":0"+doubletempo;
           }else
           {
               totaltiempo=tempo+":"+doubletempo;
           }          
           jTable1.setValueAt(totaltiempo,contadorultradiscreto,3);
           tiempo=(tempo*60)+doubletempo;
           if(tiempo>600){
                precio="$13000";
            }else
            {
                auxiliarpalprecio=tiempo*70;
                precio="$"+auxiliarpalprecio;
            }
            jTable1.setValueAt(precio,contadorultradiscreto,4);
        }
    }//GEN-LAST:event_ganaActionPerformed

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
            java.util.logging.Logger.getLogger(carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Espacios;
    private javax.swing.JLabel Placa;
    private javax.swing.JButton botoingreso;
    private javax.swing.JButton botonsalida;
    private javax.swing.JButton gana;
    private javax.swing.JTextField horafield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField placafield;
    // End of variables declaration//GEN-END:variables
}
