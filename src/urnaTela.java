/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vdpom
 */
public class urnaTela extends javax.swing.JFrame {
    
   public int confirm;
   public int voto1=0;
   public int voto2=0;
   public int voto3=0;
   public int voto4=0;
   public int voto5=0;
   public int voto6=0;

    /**
     * Creates new form urnaTela
     */
    public urnaTela() {
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

        jPanel1 = new javax.swing.JPanel();
        bill = new javax.swing.JButton();
        branco = new javax.swing.JButton();
        ada = new javax.swing.JButton();
        james = new javax.swing.JButton();
        rasmus = new javax.swing.JButton();
        grace = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        votosbill = new javax.swing.JButton();
        votosada = new javax.swing.JButton();
        votosjames = new javax.swing.JButton();
        votosrasmus = new javax.swing.JButton();
        votosgrace = new javax.swing.JButton();
        votosbranco = new javax.swing.JButton();
        resultada = new javax.swing.JTextField();
        resultbill = new javax.swing.JTextField();
        resultjames = new javax.swing.JTextField();
        resultgrace = new javax.swing.JTextField();
        resultrasmus = new javax.swing.JTextField();
        resultbranco = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        foto = new javax.swing.JLabel();
        votado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        bill.setText("BILL GATES");
        bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billMouseClicked(evt);
            }
        });

        branco.setText("VOTO BRANCO");
        branco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brancoMouseClicked(evt);
            }
        });

        ada.setText("ADA LOVELACE");
        ada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adaMouseClicked(evt);
            }
        });

        james.setText("JAMES GOSLING");
        james.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jamesMouseClicked(evt);
            }
        });

        rasmus.setText("RASMUS LERDORF");
        rasmus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rasmusMouseClicked(evt);
            }
        });

        grace.setText("GRACE HOPPER");
        grace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                graceMouseClicked(evt);
            }
        });

        confirmar.setBackground(new java.awt.Color(0, 255, 0));
        confirmar.setText("CONFIRMAR");
        confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rasmus, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(james, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(branco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rasmus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(james)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 90, 250, 270);

        votosbill.setText("BILL");
        votosbill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votosbillMouseClicked(evt);
            }
        });
        getContentPane().add(votosbill);
        votosbill.setBounds(290, 130, 80, 30);

        votosada.setText("ADA");
        votosada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votosadaMouseClicked(evt);
            }
        });
        getContentPane().add(votosada);
        votosada.setBounds(290, 170, 80, 30);

        votosjames.setText("JAMES");
        votosjames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votosjamesMouseClicked(evt);
            }
        });
        votosjames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votosjamesActionPerformed(evt);
            }
        });
        getContentPane().add(votosjames);
        votosjames.setBounds(290, 250, 80, 30);

        votosrasmus.setText("RASMUS");
        votosrasmus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votosrasmusMouseClicked(evt);
            }
        });
        getContentPane().add(votosrasmus);
        votosrasmus.setBounds(290, 210, 80, 30);

        votosgrace.setText("GRACE");
        votosgrace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votosgraceMouseClicked(evt);
            }
        });
        getContentPane().add(votosgrace);
        votosgrace.setBounds(290, 290, 80, 30);

        votosbranco.setText("BRANCO");
        votosbranco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votosbrancoMouseClicked(evt);
            }
        });
        getContentPane().add(votosbranco);
        votosbranco.setBounds(290, 330, 80, 30);
        getContentPane().add(resultada);
        resultada.setBounds(400, 170, 70, 30);
        getContentPane().add(resultbill);
        resultbill.setBounds(400, 130, 70, 30);
        getContentPane().add(resultjames);
        resultjames.setBounds(400, 250, 70, 30);
        getContentPane().add(resultgrace);
        resultgrace.setBounds(400, 290, 70, 30);
        getContentPane().add(resultrasmus);
        resultrasmus.setBounds(400, 210, 70, 30);
        getContentPane().add(resultbranco);
        resultbranco.setBounds(400, 330, 70, 30);

        jTextField7.setText("QUANTIDADE DE VOTOS:");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(290, 90, 180, 30);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 10, 10, 10);

        jTextField8.setBackground(new java.awt.Color(255, 0, 0));
        jTextField8.setText("ELEIÇÃO DE MELHOR PROGRAMADOR.");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(140, 10, 250, 30);
        getContentPane().add(foto);
        foto.setBounds(70, 100, 140, 200);
        getContentPane().add(votado);
        votado.setBounds(140, 50, 250, 30);

        jLabel1.setText("Desenvolvido por: Victor Davi Pompeu de Mattos.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 380, 450, 20);

        jLabel2.setText("E-mail: vd.pompeu@gmail.com");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 400, 270, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billMouseClicked
        votado.setText("Você vota em Bill Gates?");
            confirm = 00;
   
    }//GEN-LAST:event_billMouseClicked

    private void adaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adaMouseClicked
        votado.setText("Você vota em Ada Lovelace?");
            confirm = 01;
    }//GEN-LAST:event_adaMouseClicked

    private void votosjamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votosjamesActionPerformed
      
    }//GEN-LAST:event_votosjamesActionPerformed

    private void rasmusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rasmusMouseClicked
        votado.setText("Você vota em Rasmus Lerdorf?");
            confirm = 02;
    }//GEN-LAST:event_rasmusMouseClicked

    private void graceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graceMouseClicked
        votado.setText("Você vota em Grace Hopper?");
            confirm = 04;
    }//GEN-LAST:event_graceMouseClicked

    private void jamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jamesMouseClicked
        votado.setText("Você vota em James Gosling?");
            confirm = 03;
    }//GEN-LAST:event_jamesMouseClicked

    private void confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseClicked
        if(confirm == 00){
            voto1++;
        }
        else if(confirm == 01){
            voto2++;
        }
        else if(confirm == 02){
            voto3++;
        }
        else if(confirm == 03){
            voto4++;
        }
        else if(confirm == 04){
            voto5++;
        }
        else if(confirm == 05){
            voto6++;
        }
    }//GEN-LAST:event_confirmarMouseClicked

    private void brancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brancoMouseClicked
        votado.setText("Você vota em Branco?");
        confirm = 05;
    }//GEN-LAST:event_brancoMouseClicked

    private void votosbillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votosbillMouseClicked
        resultbill.setText(" " + voto1);
    }//GEN-LAST:event_votosbillMouseClicked

    private void votosadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votosadaMouseClicked
        resultada.setText(" " + voto2);
    }//GEN-LAST:event_votosadaMouseClicked

    private void votosrasmusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votosrasmusMouseClicked
        resultrasmus.setText(" " + voto3);
    }//GEN-LAST:event_votosrasmusMouseClicked

    private void votosjamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votosjamesMouseClicked
        resultjames.setText(" " + voto4);
    }//GEN-LAST:event_votosjamesMouseClicked

    private void votosgraceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votosgraceMouseClicked
        resultgrace.setText(" " + voto5);
    }//GEN-LAST:event_votosgraceMouseClicked

    private void votosbrancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votosbrancoMouseClicked
       resultbranco.setText(" " + voto6);
    }//GEN-LAST:event_votosbrancoMouseClicked

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
            java.util.logging.Logger.getLogger(urnaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(urnaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(urnaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urnaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urnaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ada;
    private javax.swing.JButton bill;
    private javax.swing.JButton branco;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel foto;
    private javax.swing.JButton grace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton james;
    private javax.swing.JButton rasmus;
    private javax.swing.JTextField resultada;
    private javax.swing.JTextField resultbill;
    private javax.swing.JTextField resultbranco;
    private javax.swing.JTextField resultgrace;
    private javax.swing.JTextField resultjames;
    private javax.swing.JTextField resultrasmus;
    private javax.swing.JTextField votado;
    private javax.swing.JButton votosada;
    private javax.swing.JButton votosbill;
    private javax.swing.JButton votosbranco;
    private javax.swing.JButton votosgrace;
    private javax.swing.JButton votosjames;
    private javax.swing.JButton votosrasmus;
    // End of variables declaration//GEN-END:variables
}
