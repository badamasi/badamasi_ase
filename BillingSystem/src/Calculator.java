/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Calculator extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double firstnumber;
    double secondnumber;
    double result;
    String operators;

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtDisplay1 = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbt5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbnt9 = new javax.swing.JButton();
        jbnt10 = new javax.swing.JButton();
        jbtn11 = new javax.swing.JButton();
        jbtn15 = new javax.swing.JButton();
        jbtn14 = new javax.swing.JButton();
        jbtn13 = new javax.swing.JButton();
        jbtn12 = new javax.swing.JButton();
        jbtn16 = new javax.swing.JButton();
        jbtn17 = new javax.swing.JButton();
        jbtn18 = new javax.swing.JButton();
        jbtn19 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jtxtDisplay1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtn1.setText("Backspace");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn2.setText("C");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn3.setText("/");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn7.setText("-");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn6.setText("9");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt5.setText("8");
        jbt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt5ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn4.setText("7");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn8.setText("4");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbnt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbnt9.setText("5");
        jbnt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnt9ActionPerformed(evt);
            }
        });

        jbnt10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbnt10.setText("6");
        jbnt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnt10ActionPerformed(evt);
            }
        });

        jbtn11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn11.setText("+");
        jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn11ActionPerformed(evt);
            }
        });

        jbtn15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn15.setText("*");
        jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn15ActionPerformed(evt);
            }
        });

        jbtn14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn14.setText("3");
        jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn14ActionPerformed(evt);
            }
        });

        jbtn13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn13.setText("2");
        jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn13ActionPerformed(evt);
            }
        });

        jbtn12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn12.setText("1");
        jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn12ActionPerformed(evt);
            }
        });

        jbtn16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn16.setText("0");
        jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn16ActionPerformed(evt);
            }
        });

        jbtn17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn17.setText(".");
        jbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn17ActionPerformed(evt);
            }
        });

        jbtn18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtn18.setText("+/-");
        jbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn18ActionPerformed(evt);
            }
        });

        jbtn19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn19.setText("=");
        jbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn19ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtDisplay1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbnt10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbnt9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jtxtDisplay1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn4)
                    .addComponent(jbt5)
                    .addComponent(jbtn6)
                    .addComponent(jbtn7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnt9)
                    .addComponent(jbtn8)
                    .addComponent(jbnt10)
                    .addComponent(jbtn11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn12)
                    .addComponent(jbtn13)
                    .addComponent(jbtn14)
                    .addComponent(jbtn15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn16)
                        .addComponent(jbtn17)
                        .addComponent(jbtn19))
                    .addComponent(jbtn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtxtDisplay1.setText(null);
    }                                     

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        firstnumber = Double.parseDouble(jtxtDisplay1.getText());
        jtxtDisplay1.setText("");
        operators = "/";
    }                                     

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        firstnumber = Double.parseDouble(jtxtDisplay1.getText());
        jtxtDisplay1.setText("");
        operators = "-";
    }                                     

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String Enternum = jtxtDisplay1.getText() + jbtn6.getText();
        jtxtDisplay1.setText(Enternum);

    }                                     

    private void jbt5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String Enternum = jtxtDisplay1.getText() + jbt5.getText();
        jtxtDisplay1.setText(Enternum);

    }                                    

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String Enternum = jtxtDisplay1.getText() + jbtn4.getText();
        jtxtDisplay1.setText(Enternum);

    }                                     

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String Enternum = jtxtDisplay1.getText() + jbtn8.getText();
        jtxtDisplay1.setText(Enternum);

    }                                     

    private void jbnt9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String Enternum = jtxtDisplay1.getText() + jbnt9.getText();
        jtxtDisplay1.setText(Enternum);

    }                                     

    private void jbnt10ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String Enternum = jtxtDisplay1.getText() + jbnt10.getText();
        jtxtDisplay1.setText(Enternum);

    }                                      

    private void jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        firstnumber = Double.parseDouble(jtxtDisplay1.getText());
        jtxtDisplay1.setText("");
        operators = "+";
    }                                      

    private void jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        firstnumber = Double.parseDouble(jtxtDisplay1.getText());
        jtxtDisplay1.setText("");
        operators = "*";
    }                                      

    private void jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String Enternum = jtxtDisplay1.getText() + jbtn14.getText();
        jtxtDisplay1.setText(Enternum);

    }                                      

    private void jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String Enternum = jtxtDisplay1.getText() + jbtn13.getText();
        jtxtDisplay1.setText(Enternum);

    }                                      

    private void jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String Enternum = jtxtDisplay1.getText() + jbtn12.getText();
        jtxtDisplay1.setText(Enternum);

    }                                      

    private void jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String Enternum = jtxtDisplay1.getText() + jbtn16.getText();
        jtxtDisplay1.setText(Enternum);

    }                                      

    private void jbtn17ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String Enternum = jtxtDisplay1.getText() + jbtn17.getText();
        jtxtDisplay1.setText(Enternum);
    }                                      

    private void jbtn18ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Double ab = Double.parseDouble(String.valueOf(jtxtDisplay1.getText()));
        ab = ab * (-1);
        jtxtDisplay1.setText(String.valueOf(ab));
    }                                      

    private void jbtn19ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String ans;
        secondnumber = Double.parseDouble(jtxtDisplay1.getText());
        if (operators == "+"){
            result = firstnumber + secondnumber;
            ans = Double.toString(result);
            jtxtDisplay1.setText(ans);
        }
        else if(operators == "-"){
            result = firstnumber - secondnumber;
            ans = Double.toString(result);
            jtxtDisplay1.setText(ans);
        }
        else if (operators == "/"){
            result = firstnumber / secondnumber;
            ans = Double.toString(result);
            jtxtDisplay1.setText(ans);
        }
        else if (operators == "*"){
            result = firstnumber * secondnumber;
            ans = Double.toString(result);
            jtxtDisplay1.setText(ans);
        }
    }                                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Exit the window
    	MainMenu mm = new MainMenu();
    	mm.setVisible(true);
    	this.dispose();
        
        
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbnt10;
    private javax.swing.JButton jbnt9;
    private javax.swing.JButton jbt5;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn11;
    private javax.swing.JButton jbtn12;
    private javax.swing.JButton jbtn13;
    private javax.swing.JButton jbtn14;
    private javax.swing.JButton jbtn15;
    private javax.swing.JButton jbtn16;
    private javax.swing.JButton jbtn17;
    private javax.swing.JButton jbtn18;
    private javax.swing.JButton jbtn19;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JTextField jtxtDisplay1;
    // End of variables declaration                   
}
