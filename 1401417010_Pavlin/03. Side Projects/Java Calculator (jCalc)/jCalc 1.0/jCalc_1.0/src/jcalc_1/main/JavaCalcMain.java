package jcalc_1.main;

import jcalc_1.sounds.SoundEffect;

public class JavaCalcMain extends javax.swing.JFrame {
    
    private int total = 0;
    private char operator;
    private String error0 = "";
    
    public JavaCalcMain() {
        initComponents();
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("startup.wav");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcDisplay = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        buttonPlus = new javax.swing.JButton();
        buttonMinus = new javax.swing.JButton();
        buttonMultiplied = new javax.swing.JButton();
        buttonDivided = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Calculator (jCalc) 1.0");
        setResizable(false);

        calcDisplay.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
        calcDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcDisplay.setText("0");
        calcDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcDisplayActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(0, 0, 0));
        button1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 0, 0));
        button2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(0, 0, 0));
        button3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(0, 0, 0));
        button4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(0, 0, 0));
        button5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(0, 0, 0));
        button6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(0, 0, 0));
        button7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(0, 0, 0));
        button8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(0, 0, 0));
        button9.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button0.setBackground(new java.awt.Color(0, 0, 0));
        button0.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button0.setForeground(new java.awt.Color(255, 255, 255));
        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        buttonPlus.setBackground(new java.awt.Color(100, 96, 96));
        buttonPlus.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        buttonPlus.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlus.setText("+");
        buttonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlusActionPerformed(evt);
            }
        });

        buttonMinus.setBackground(new java.awt.Color(100, 96, 96));
        buttonMinus.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        buttonMinus.setForeground(new java.awt.Color(255, 255, 255));
        buttonMinus.setText("-");
        buttonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinusActionPerformed(evt);
            }
        });

        buttonMultiplied.setBackground(new java.awt.Color(100, 96, 96));
        buttonMultiplied.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        buttonMultiplied.setForeground(new java.awt.Color(255, 255, 255));
        buttonMultiplied.setText("x");
        buttonMultiplied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultipliedActionPerformed(evt);
            }
        });

        buttonDivided.setBackground(new java.awt.Color(100, 96, 96));
        buttonDivided.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        buttonDivided.setForeground(new java.awt.Color(255, 255, 255));
        buttonDivided.setText("/");
        buttonDivided.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDividedActionPerformed(evt);
            }
        });

        buttonClear.setBackground(new java.awt.Color(100, 96, 96));
        buttonClear.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(255, 255, 255));
        buttonClear.setText("clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonEquals.setBackground(new java.awt.Color(100, 96, 96));
        buttonEquals.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        buttonEquals.setForeground(new java.awt.Color(255, 255, 255));
        buttonEquals.setText("=");
        buttonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonMultiplied, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDivided, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(calcDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMultiplied, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDivided, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcDisplayActionPerformed

    }//GEN-LAST:event_calcDisplayActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("1.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("1");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("1");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("1");
        }
        
        else if(calcDisplay.getText().length() < 9) {  
            String display = calcDisplay.getText() + "1";
            calcDisplay.setText(display);
        }
        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("3.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("3");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("3");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("3");
        }
        
        else if(calcDisplay.getText().length() < 9) {  
            String display = calcDisplay.getText() + "3";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("2.wav"); 
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("2");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("2");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("2");
        }
        
        else if(calcDisplay.getText().length() < 9) {    
            String display = calcDisplay.getText() + "2";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("clear.wav");
        
        calcDisplay.setText("0");
        total = 0;
    }//GEN-LAST:event_buttonClearActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("4.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("4");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("4");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("4");
        }
        
        else if(calcDisplay.getText().length() < 9) {    
            String display = calcDisplay.getText() + "4";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("5.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("5");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("5");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("5");
        }
        
        else if(calcDisplay.getText().length() < 9) {    
            String display = calcDisplay.getText() + "5";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("6.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("6");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("6");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("6");
        }
        
        else if(calcDisplay.getText().length() < 9) {    
            String display = calcDisplay.getText() + "6";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("7.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("7");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("7");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("7");
        }
        
        else if(calcDisplay.getText().length() < 9) {    
            String display = calcDisplay.getText() + "7";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("8.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("8");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("8");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("8");
        }
        
        else if(calcDisplay.getText().length() < 9) {    
            String display = calcDisplay.getText() + "8";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("9.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("9");
        }

        else  if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("9");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("9");
        }
        
        else if(calcDisplay.getText().length() < 9) {    
            String display = calcDisplay.getText() + "9";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button9ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("0.wav");
        
        if(calcDisplay.getText().equals("0")) {
            calcDisplay.setText("0");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("0");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("0");
        }
        
        else if(calcDisplay.getText().length() < 9) {    
            String display = calcDisplay.getText() + "0";
            calcDisplay.setText(display);
        }
    }//GEN-LAST:event_button0ActionPerformed

    private void buttonMultipliedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultipliedActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("multiplied.wav");

        if(calcDisplay.getText().matches("[0-9]+")) {
            total = Integer.parseInt(calcDisplay.getText());
            calcDisplay.setText("x");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("x");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("0");
            total = 0;
        }
        
        getOperator("x");
    }//GEN-LAST:event_buttonMultipliedActionPerformed

    private void buttonDividedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDividedActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("divided.wav");
        
        if(calcDisplay.getText().matches("[0-9]+")) {
            total = Integer.parseInt(calcDisplay.getText());
            calcDisplay.setText("/");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("/");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("0");
            total = 0;
        }
        
        getOperator("/");
    }//GEN-LAST:event_buttonDividedActionPerformed

    private void buttonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinusActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("minus.wav");
        
        if(calcDisplay.getText().matches("[0-9]+")) {
            total = Integer.parseInt(calcDisplay.getText());
            calcDisplay.setText("-");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("-");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("0");
            total = 0;
        }
        
        getOperator("-");
    }//GEN-LAST:event_buttonMinusActionPerformed

    private void buttonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlusActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("plus.wav");
        
        if(calcDisplay.getText().matches("[0-9]+")) {
            total = Integer.parseInt(calcDisplay.getText());
            calcDisplay.setText("+");
        }
        
        else if(calcDisplay.getText().matches("[+-/x]")) {
            calcDisplay.setText("+");
        }
        
        else if(calcDisplay.getText().contains("Error / by Zero") || calcDisplay.getText().contains("Error Overflow ")) {
        
            calcDisplay.setText("0");
            total = 0;
        }
        
        getOperator("+");
    }//GEN-LAST:event_buttonPlusActionPerformed

    private void getOperator(String lastSelected) {
        operator = lastSelected.charAt(0);
    }
    
    private void buttonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualsActionPerformed
        
        SoundEffect soundObject = new SoundEffect();
        soundObject.sound("equals.wav");

        switch(operator) {
            
            case '+':
            if(calcDisplay.getText().matches("[0-9]+")) {
                total += Integer.parseInt(calcDisplay.getText());
            }
            break;
                
            case '-':
            if(calcDisplay.getText().matches("[0-9]+")) {
                total -= Integer.parseInt(calcDisplay.getText());
            }
            break;
                
            case 'x':
            if(calcDisplay.getText().matches("[0-9]+")) {
                total *= Integer.parseInt(calcDisplay.getText());
            }
            break;
                
            case '/':
            try {
                if(calcDisplay.getText().matches("[0-9]+")) {
                    total /= Integer.parseInt(calcDisplay.getText());
                }
            }
            
            catch(ArithmeticException error) {
                error0 = "Error 0";
            }
            break;
        }

        String sTotal = Integer.toString(total);

        if(error0.equals("Error 0")) {
            
            calcDisplay.setText("Error / by Zero");
            error0 = "";
        }
        
        else if(sTotal.length() < 10) {
            
            calcDisplay.setText(sTotal);
        }

        else {
            calcDisplay.setText("Error Overflow " + sTotal);
        }  
    }//GEN-LAST:event_buttonEqualsActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalcMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new JavaCalcMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDivided;
    private javax.swing.JButton buttonEquals;
    private javax.swing.JButton buttonMinus;
    private javax.swing.JButton buttonMultiplied;
    private javax.swing.JButton buttonPlus;
    private javax.swing.JTextField calcDisplay;
    // End of variables declaration//GEN-END:variables
}
