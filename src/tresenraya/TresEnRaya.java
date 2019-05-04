/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tresenraya;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public class TresEnRaya extends javax.swing.JFrame {
    
    private int jugador;
    private int modo;
 
    public int estado;
    public boolean valido;
    
    Random r = new Random();

  
    public TresEnRaya() {
        initComponents();
        jugador=1;
        modo=1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn_reiniciar = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn_reiniciar.setText("REINICIAR");
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });
        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(156, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       
        if (btn1.getText().isEmpty()) {
            if (getJugador()==1) {
                
                btn1.setText("X");
                
               
            }else{
                
                btn1.setText("O");
               
                
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
              JOptionPane.showMessageDialog(null,"fin de la partida");
            
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       
        if (btn2.getText().isEmpty()) {
            if (getJugador()==1) {
                
                btn2.setText("X");
               
            }else{
               
                btn2.setText("O");
           
                
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
              //  jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
               JOptionPane.showMessageDialog(null,"fin de la partida");
            
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
        if (btn3.getText().isEmpty()) {
            if (getJugador()==1) {
               
                btn3.setText("X");
             
            }else{
               
                btn3.setText("O");
              
                
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
                 JOptionPane.showMessageDialog(null,"fin de la partida");
            
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        
        if (btn4.getText().isEmpty()) {
            if (getJugador()==1) {
                
                btn4.setText("X");
               
            }else{
              
                btn4.setText("O");
              
                
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
            JOptionPane.showMessageDialog(null,"fin de la partida");
            
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       
        if (btn5.getText().isEmpty()) {
            if (getJugador()==1) {
                
                btn5.setText("X");
            
            }else{
               
                btn5.setText("O");
            
                
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
            JOptionPane.showMessageDialog(null,"fin de la partida");
            
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        
        if (btn6.getText().isEmpty()) {
            if (getJugador()==1) {
                
                btn6.setText("X");
              
            }else{
             
                btn6.setText("O");
               
               
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
               JOptionPane.showMessageDialog(null,"fin de la partida");
            
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       
        if (btn7.getText().isEmpty()) {
            if (getJugador()==1) {
                
                btn7.setText("X");
              
            }else{
               
                btn7.setText("O");
                
                
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
               JOptionPane.showMessageDialog(null,"fin de la partida");
            
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
    
        if (btn8.getText().isEmpty()) {
            if (getJugador()==1) {
              
                btn8.setText("X");
              
            }else{
              
                btn8.setText("O");
               
                
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
                JOptionPane.showMessageDialog(null,"fin de la partida");
            
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
     
        if (btn9.getText().isEmpty()) {
            if (getJugador()==1) {
              
                btn9.setText("x");
               
            }else{
            
                btn9.setText("o");
               
                
            }
            
            estado=comprobarEstado();
            
            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }
            
            if (estado != 0)
            System.out.println("fin de la partida");
        }else
            JOptionPane.showMessageDialog(null,"casilla llena");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed
       reiniciar();
    }//GEN-LAST:event_btn_reiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                TresEnRaya tres = new TresEnRaya();
                tres.setTitle("Tres En Raya");
                tres.setVisible(true);
              
                tres.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
 
    public int comprobarEstado() {
        
        if(btn1.getText().equals("x") && btn2.getText().equals("x") && btn3.getText().equals("x") ||
           btn4.getText().equals("x") && btn5.getText().equals("x") && btn6.getText().equals("x") ||
           btn7.getText().equals("x") && btn8.getText().equals("x") && btn9.getText().equals("x") ||
           btn1.getText().equals("x") && btn4.getText().equals("x") && btn7.getText().equals("x") ||
           btn2.getText().equals("x") && btn5.getText().equals("x") && btn8.getText().equals("x") ||     
           btn3.getText().equals("x") && btn6.getText().equals("x") && btn9.getText().equals("x") ||
           btn1.getText().equals("x") && btn5.getText().equals("x") && btn9.getText().equals("x") ||     
           btn3.getText().equals("x") && btn5.getText().equals("x") && btn7.getText().equals("x"))
            return 1;
        
        else if(btn1.getText().equals("o") && btn2.getText().equals("o") && btn3.getText().equals("o") ||
                btn4.getText().equals("o") && btn5.getText().equals("o") && btn6.getText().equals("o") ||
                btn7.getText().equals("o") && btn8.getText().equals("o") && btn9.getText().equals("o") ||
                btn1.getText().equals("o") && btn4.getText().equals("o") && btn7.getText().equals("o") ||
                btn2.getText().equals("o") && btn5.getText().equals("o") && btn8.getText().equals("o") ||     
                btn3.getText().equals("o") && btn6.getText().equals("o") && btn9.getText().equals("o") ||
                btn1.getText().equals("o") && btn5.getText().equals("o") && btn9.getText().equals("o") ||     
                btn3.getText().equals("o") && btn5.getText().equals("o") && btn7.getText().equals("o"))
            return 2;
        
        if (btn1.getText().isEmpty() || btn2.getText().isEmpty() || btn3.getText().isEmpty() ||
            btn4.getText().isEmpty() || btn5.getText().isEmpty() || btn6.getText().isEmpty() ||
            btn7.getText().isEmpty() || btn8.getText().isEmpty() || btn9.getText().isEmpty())
            return 0;
        
        return 3;
    }
    
    public void reiniciar() {
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        setJugador(1);
        
    }
    
    public void jugadaOrdenador() {
        
        valido=false;
        
        do {
            switch(r.nextInt(9)+1) {
                case 1:
                    if (btn1.getText().isEmpty()) {
                        btn1.setText("O");
                        valido=true;
                    }
                    break;
                case 2:
                    if (btn2.getText().isEmpty()) {
                        btn2.setText("O");
                        valido=true;
                    }
                    break;
                case 3:
                    if (btn3.getText().isEmpty()) {
                        btn3.setText("O");
                        valido=true;
                    }
                    break;
                case 4:
                    if (btn4.getText().isEmpty()) {
                        btn4.setText("O");
                        valido=true;
                    }
                    break;
                case 5:
                    if (btn5.getText().isEmpty()) {
                        btn5.setText("O");
                        valido=true;
                    }
                    break;
                case 6:
                    if (btn6.getText().isEmpty()) {
                        btn6.setText("O");
                        valido=true;
                    }
                    break;
                case 7:
                    if (btn7.getText().isEmpty()) {
                        btn7.setText("O");
                        valido=true;
                    }
                    break;
                case 8:
                    if (btn8.getText().isEmpty()) {
                        btn8.setText("O");
                        valido=true;
                    }
                    break;
                case 9:
                    if (btn9.getText().isEmpty()) {
                        btn9.setText("O");
                        valido=true;
                    }
                    break;
            }
        }while(!valido);
    }
    
    public int getJugador() {
        return jugador;
    }
    public void setJugador(int jugador) {
        this.jugador = jugador;
    }
    public int getModo() {
        return modo;
    }
    public void setModo(int modo) {
        this.modo = modo;
    }
}
