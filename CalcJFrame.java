/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Dialog;
import java.awt.Font;
import java.text.DecimalFormat; 
import java.io.*;
import java.lang.Math;
import java.util.HashSet;


public class CalcJFrame extends javax.swing.JFrame {

    //create instance of class calc to be used to store variables for calculations
    private Calculations calc = new Calculations();
    
    // variable to store number to be validated for errors
    double test;
    
    // switch to tell if the last button pressed was an operator
    boolean operatorPressed = false;
    
    // switch to state in first calculation has occured or not
    boolean initialised = false;
    
    //switch to state if equals button was last button pressed.
    boolean equals = false;
    
    
    
    
    public CalcJFrame() {
        initComponents();
        // set calculator initial size at start of running
        basicSize();
    }

    //method to define size of basic calculator
    private void basicSize(){
        setSize(375,400);
    }
    
    //method to define size of extended calculator
    private void extendedSize(){
        setSize(600,400);
    }
  
    // method to round numbers
    private void roundNumber(String roundingFormat){
       float num1 = 0;
       num1 = Float.parseFloat(txtBox.getText());
       DecimalFormat format = new DecimalFormat(roundingFormat);
       txtBox.setText(String.valueOf(format.format(num1)));
    }
    
    // method to enter number in textbox
    private void numberPressed(String number){
        String value1;
        String value2;
        if (operatorPressed == true){
              txtBox.setText("");
              operatorPressed = false;
              equals = false;
              value1 = txtBox.getText();
        }
        else if (equals == true){
            txtBox.setText("");
            equals = false;
            value1 = txtBox.getText();
        }
        else{
            value1 = txtBox.getText();
        }
        value2 = value1 + number;

        // try catch block to validate number entered into textbox
        try {
        txtBox.setText(value2);
        test = Double.parseDouble(txtBox.getText());
            }
        catch (NumberFormatException nfe){
          if (nfe.getMessage().equals("multiple points")){
              msgMessage.showMessageDialog(this, "The number contains multiple decimal points", "Decimal Points Error", javax.swing.JOptionPane.ERROR_MESSAGE);
          }
          else {
              msgMessage.showMessageDialog(this, "You have not entered a valid number", "Number Format Exception Caught", javax.swing.JOptionPane.ERROR_MESSAGE);
          }    
        }
        
    }
     //method for Decimal point Error testing
    private void Decimal(){
        try {
            calc.calculate();
            } catch (ArithmeticException ae) {
            msgMessage.showMessageDialog(this, "Cannot divide a number by zero", "Decimal Point Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            clearAll();
           }
    }
    
    //method that sets operator and appropriate numbers into calculator when operator is pressed
    private void operation(char operator){
       if(initialised == false){
           calc.setNum1(Double.parseDouble(txtBox.getText()));
           operatorPressed = true;
           } else {      
           calc.setNum2(Double.parseDouble(txtBox.getText()));
           Decimal();
           calc.setNum1(calc.getAnswer());
           txtBox.setText(Double.toString(calc.getAnswer()));
        }
       
        calc.setOperator(operator);

        operatorPressed = true;
        initialised = true;
        
    }   
    
    //method to reset calculator 
    private void clearAll(){
         txtBox.setText("");
         calc.setNum1(0);
        calc.setNum2(0);
        calc.setOperator('0');
        operatorPressed = false;
        initialised = false;
        equals = false;
    }
    
    //method to clear textbox
    private void clearTextBox(){
        txtBox.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpView = new javax.swing.ButtonGroup();
        btnGrpFont = new javax.swing.ButtonGroup();
        btngrpScience = new javax.swing.ButtonGroup();
        btngrpRound = new javax.swing.ButtonGroup();
        msgHotKeys = new javax.swing.JOptionPane();
        msgAbout = new javax.swing.JOptionPane();
        msgMessage = new javax.swing.JOptionPane();
        txtBox = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnPower = new javax.swing.JButton();
        btnPosNeg = new javax.swing.JButton();
        btnFactor = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnPI = new javax.swing.JButton();
        btnFraction4 = new javax.swing.JButton();
        btnAtan = new javax.swing.JButton();
        btnAcos = new javax.swing.JButton();
        btnAsin = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        radDegrees = new javax.swing.JRadioButton();
        radRadians = new javax.swing.JRadioButton();
        btnDivide = new javax.swing.JButton();
        btnAddition = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnMulitply = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuView = new javax.swing.JMenu();
        radBasic = new javax.swing.JRadioButtonMenuItem();
        radExtended = new javax.swing.JRadioButtonMenuItem();
        mnuFont = new javax.swing.JMenu();
        radBold = new javax.swing.JRadioButtonMenuItem();
        radPlain = new javax.swing.JRadioButtonMenuItem();
        mnuRound = new javax.swing.JMenu();
        radRound0 = new javax.swing.JRadioButtonMenuItem();
        radRound1 = new javax.swing.JRadioButtonMenuItem();
        radRound2 = new javax.swing.JRadioButtonMenuItem();
        radRound3 = new javax.swing.JRadioButtonMenuItem();
        radRound4 = new javax.swing.JRadioButtonMenuItem();
        radRound5 = new javax.swing.JRadioButtonMenuItem();
        radRound6 = new javax.swing.JRadioButtonMenuItem();
        radRound7 = new javax.swing.JRadioButtonMenuItem();
        radRound8 = new javax.swing.JRadioButtonMenuItem();
        radRound9 = new javax.swing.JRadioButtonMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuAbout = new javax.swing.JMenuItem();
        mnuHotKeys = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        txtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxActionPerformed(evt);
            }
        });
        getContentPane().add(txtBox);
        txtBox.setBounds(10, 20, 340, 40);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(10, 80, 60, 40);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(80, 80, 60, 40);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(150, 80, 60, 40);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(10, 130, 60, 40);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(80, 130, 60, 40);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(150, 130, 60, 40);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(10, 180, 60, 40);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(80, 180, 60, 40);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(150, 180, 60, 40);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(10, 230, 60, 40);

        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDecimal);
        btnDecimal.setBounds(80, 230, 60, 40);

        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(btnEquals);
        btnEquals.setBounds(150, 230, 60, 40);

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        getContentPane().add(btnE);
        btnE.setBounds(480, 230, 70, 40);

        btnPower.setText("x^y");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });
        getContentPane().add(btnPower);
        btnPower.setBounds(290, 130, 60, 40);

        btnPosNeg.setText("+/-");
        btnPosNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosNegActionPerformed(evt);
            }
        });
        getContentPane().add(btnPosNeg);
        btnPosNeg.setBounds(290, 180, 60, 40);

        btnFactor.setText("x!");
        btnFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorActionPerformed(evt);
            }
        });
        getContentPane().add(btnFactor);
        btnFactor.setBounds(290, 230, 60, 40);

        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCos);
        btnCos.setBounds(390, 130, 70, 40);

        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        getContentPane().add(btnTan);
        btnTan.setBounds(390, 180, 70, 40);

        btnPI.setText("PI");
        btnPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIActionPerformed(evt);
            }
        });
        getContentPane().add(btnPI);
        btnPI.setBounds(390, 230, 70, 40);

        btnFraction4.setText("1/x");
        btnFraction4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFraction4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnFraction4);
        btnFraction4.setBounds(290, 80, 60, 40);

        btnAtan.setText("atan");
        btnAtan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtanActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtan);
        btnAtan.setBounds(480, 180, 70, 40);

        btnAcos.setText("acos");
        btnAcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcos);
        btnAcos.setBounds(480, 130, 70, 40);

        btnAsin.setText("asin");
        btnAsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsinActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsin);
        btnAsin.setBounds(480, 80, 70, 40);

        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });
        getContentPane().add(btnSin);
        btnSin.setBounds(390, 80, 70, 40);

        btnCA.setText("CA");
        btnCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAActionPerformed(evt);
            }
        });
        getContentPane().add(btnCA);
        btnCA.setBounds(10, 280, 170, 40);

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        getContentPane().add(btnCE);
        btnCE.setBounds(190, 280, 160, 40);

        btngrpScience.add(radDegrees);
        radDegrees.setText("Degrees");
        radDegrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDegreesActionPerformed(evt);
            }
        });
        getContentPane().add(radDegrees);
        radDegrees.setBounds(400, 20, 80, 30);

        btngrpScience.add(radRadians);
        radRadians.setText("Radians");
        radRadians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRadiansActionPerformed(evt);
            }
        });
        getContentPane().add(radRadians);
        radRadians.setBounds(400, 50, 93, 23);

        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivide);
        btnDivide.setBounds(220, 130, 60, 40);

        btnAddition.setText("+");
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddition);
        btnAddition.setBounds(220, 180, 60, 40);

        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubtract);
        btnSubtract.setBounds(220, 230, 60, 40);

        btnMulitply.setText("*");
        btnMulitply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulitplyActionPerformed(evt);
            }
        });
        getContentPane().add(btnMulitply);
        btnMulitply.setBounds(220, 80, 60, 40);

        mnuView.setText("View");

        radBasic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        btnGrpView.add(radBasic);
        radBasic.setSelected(true);
        radBasic.setText("Basic");
        radBasic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radBasicItemStateChanged(evt);
            }
        });
        radBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBasicActionPerformed(evt);
            }
        });
        mnuView.add(radBasic);

        radExtended.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        btnGrpView.add(radExtended);
        radExtended.setText("Extended");
        radExtended.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radExtendedItemStateChanged(evt);
            }
        });
        mnuView.add(radExtended);

        jMenuBar1.add(mnuView);

        mnuFont.setText("Font");

        radBold.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        btnGrpFont.add(radBold);
        radBold.setText("Bold");
        radBold.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radBoldItemStateChanged(evt);
            }
        });
        mnuFont.add(radBold);

        radPlain.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        btnGrpFont.add(radPlain);
        radPlain.setSelected(true);
        radPlain.setText("Plain");
        radPlain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radPlainItemStateChanged(evt);
            }
        });
        mnuFont.add(radPlain);

        jMenuBar1.add(mnuFont);

        mnuRound.setText("Round");

        btngrpRound.add(radRound0);
        radRound0.setText("0");
        radRound0.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound0ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound0);

        btngrpRound.add(radRound1);
        radRound1.setText("1");
        radRound1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound1ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound1);

        btngrpRound.add(radRound2);
        radRound2.setText("2");
        radRound2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound2ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound2);

        btngrpRound.add(radRound3);
        radRound3.setText("3");
        radRound3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound3ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound3);

        btngrpRound.add(radRound4);
        radRound4.setText("4");
        radRound4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound4ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound4);

        btngrpRound.add(radRound5);
        radRound5.setText("5");
        radRound5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound5ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound5);

        btngrpRound.add(radRound6);
        radRound6.setText("6");
        radRound6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound6ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound6);

        btngrpRound.add(radRound7);
        radRound7.setSelected(true);
        radRound7.setText("7");
        radRound7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound7ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound7);

        btngrpRound.add(radRound8);
        radRound8.setText("8");
        radRound8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound8ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound8);

        btngrpRound.add(radRound9);
        radRound9.setText("9");
        radRound9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radRound9ItemStateChanged(evt);
            }
        });
        mnuRound.add(radRound9);

        jMenuBar1.add(mnuRound);

        mnuHelp.setText("Help");
        mnuHelp.setToolTipText("");

        mnuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        mnuAbout.setText("About");
        mnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuAbout);

        mnuHotKeys.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, 0));
        mnuHotKeys.setText("Hot Keys");
        mnuHotKeys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuHotKeysMouseClicked(evt);
            }
        });
        mnuHotKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHotKeysActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuHotKeys);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBasicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBasicActionPerformed

    private void txtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoxActionPerformed

    private void radPlainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radPlainItemStateChanged
        //makes text normal text 
        if (radPlain.isSelected()) {
            Font oldFont = txtBox.getFont();
            Font newFont = new Font(oldFont.getName(),Font.PLAIN,oldFont.getSize());
            txtBox.setFont(newFont);
        }
    }//GEN-LAST:event_radPlainItemStateChanged

    private void radBoldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radBoldItemStateChanged
        //makes text bold
        if (radBold.isSelected()) {
            Font oldFont = txtBox.getFont();
            Font newFont = new Font(oldFont.getName(),Font.BOLD,oldFont.getSize());
            txtBox.setFont(newFont);
        }
    }//GEN-LAST:event_radBoldItemStateChanged

    private void radRound0ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound0ItemStateChanged
       //calls roundNumber method to round to 0 decimal points
        if (radRound0.isSelected()){
            roundNumber("#");
        }
    }//GEN-LAST:event_radRound0ItemStateChanged

    private void radBasicItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radBasicItemStateChanged

       basicSize();
    }//GEN-LAST:event_radBasicItemStateChanged

    private void radExtendedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radExtendedItemStateChanged
        extendedSize();
    }//GEN-LAST:event_radExtendedItemStateChanged

    private void radRound1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound1ItemStateChanged
       // calls roundNumber method to round to 1 decimal place
       if (radRound1.isSelected()){
       roundNumber("#.#");
       }
    }//GEN-LAST:event_radRound1ItemStateChanged

    private void radRound2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound2ItemStateChanged
        //calls roundNumber method to round to 2 decimal places
        if (radRound2.isSelected()){
        roundNumber("#.##");
        }
    }//GEN-LAST:event_radRound2ItemStateChanged

    private void mnuHotKeysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuHotKeysMouseClicked

    }//GEN-LAST:event_mnuHotKeysMouseClicked

    private void mnuHotKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHotKeysActionPerformed
        //Show HotKeys Message Box
        msgHotKeys.showMessageDialog(this, "A - About \n K - Hot Keys \n Ctrl + P - Plain Font "
                + "\n B - Basic View \n E - Extended View \n Alt + P - PI \n Alt + E","Hot Keys", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuHotKeysActionPerformed

    private void mnuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutActionPerformed
       //Show About Message Box
        msgAbout.showMessageDialog(this, "Calculator \n Created By: Carwen Barnard \n 11/12/2017","About", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuAboutActionPerformed

    private void radRound3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound3ItemStateChanged
       //calls roundNumber method to round to 3 decimal places
       if (radRound3.isSelected()){
        roundNumber("#.###");
       }
    }//GEN-LAST:event_radRound3ItemStateChanged

    private void radRound4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound4ItemStateChanged
          //calls roundNumber method to round to 4 decimal places
       if (radRound4.isSelected()){
        roundNumber("#.####");
       }
    }//GEN-LAST:event_radRound4ItemStateChanged

    private void radRound5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound5ItemStateChanged
            //calls roundNumber method to round to 5 decimal places
       if (radRound5.isSelected()){
        roundNumber("#.#####");
       }
    }//GEN-LAST:event_radRound5ItemStateChanged

    private void radRound6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound6ItemStateChanged
            //calls roundNumber method to round to 6 decimal places
       if (radRound6.isSelected()){
        roundNumber("#.######");
       }
    }//GEN-LAST:event_radRound6ItemStateChanged

    private void radRound7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound7ItemStateChanged
            //calls roundNumber method to round to 7 decimal places
       if (radRound7.isSelected()){
        roundNumber("#.#######");
       }
    }//GEN-LAST:event_radRound7ItemStateChanged

    private void radRound8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound8ItemStateChanged
            //calls roundNumber method to round to 8 decimal places
       if (radRound8.isSelected()){
        roundNumber("#.########");
       }
    }//GEN-LAST:event_radRound8ItemStateChanged

    private void radRound9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radRound9ItemStateChanged
            //calls roundNumber method to round to 9 decimal places
       if (radRound9.isSelected()){
        roundNumber("#.#########");
       }
    }//GEN-LAST:event_radRound9ItemStateChanged

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        numberPressed("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        numberPressed("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         numberPressed("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         numberPressed("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        numberPressed("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         numberPressed("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       numberPressed("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       numberPressed("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        numberPressed("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
         numberPressed("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
       numberPressed(".");
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed
        operation('+');    
    }//GEN-LAST:event_btnAdditionActionPerformed

    private void btnMulitplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulitplyActionPerformed
        operation('*');
    }//GEN-LAST:event_btnMulitplyActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
       operation('/');
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        operation('-');
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        //to clear stop bug if equals sign is pressed when nothing in textbox
        if ((txtBox.getText().length()) == 0){
            clearAll();
        }
        //to set textbox to the number entered if a number has been entered and equals pressed.
        else if (calc.getOperator() == '0'){
            txtBox.setText(txtBox.getText());
        }
        else {
        calc.setNum2(Double.parseDouble(txtBox.getText()));
        Decimal();
        txtBox.setText(Double.toString(calc.getAnswer()));
        calc.setNum1(calc.getAnswer());
        calc.setNum2(0);
        operatorPressed = false;
        initialised = false;
        equals = true;
        }
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAActionPerformed
        clearAll();
    }//GEN-LAST:event_btnCAActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        clearTextBox();
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnFraction4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFraction4ActionPerformed
        calc.setNum2(Double.parseDouble(txtBox.getText()));
        calc.setNum1(1);
        calc.setOperator('/');
        Decimal();
        txtBox.setText(Double.toString(calc.getAnswer()));
    }//GEN-LAST:event_btnFraction4ActionPerformed

    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        operation('p');
    }//GEN-LAST:event_btnPowerActionPerformed

    private void btnPosNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosNegActionPerformed
        //to create negation button
        float negation = -1*(Float.parseFloat(txtBox.getText()));
        txtBox.setText(Float.toString(negation));
    }//GEN-LAST:event_btnPosNegActionPerformed

    private void btnFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorActionPerformed
        if (Double.parseDouble(txtBox.getText()) < 0 || Double.parseDouble(txtBox.getText()) > 20){
            msgMessage.showMessageDialog(this, "ERROR: Please provide a positive integer between 0 and 20", "Factorial Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else if ((txtBox.getText()).contains(".")){
            msgMessage.showMessageDialog(this, "ERROR: Please provide a whole number", "Factorial Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else{
        long factorial = 1;
        for (long factor = 2;  factor <= Long.parseLong(txtBox.getText()); factor++){
            factorial *= factor;
        }
        txtBox.setText(Long.toString(factorial));
        }
    }//GEN-LAST:event_btnFactorActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        txtBox.setText("");
        numberPressed(Double.toString(Math.E));
    }//GEN-LAST:event_btnEActionPerformed

    private void btnPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIActionPerformed
        txtBox.setText("");
        numberPressed(Double.toString(Math.PI));
    }//GEN-LAST:event_btnPIActionPerformed

    private void radRadiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRadiansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radRadiansActionPerformed

    private void radDegreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDegreesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radDegreesActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        if (radDegrees.isSelected()){
            calc.setAnswer (Math.sin(Math.toRadians(Double.parseDouble(txtBox.getText()))));
            }
        else{
            calc.setAnswer (Math.sin(Double.parseDouble(txtBox.getText())));
        }
        txtBox.setText(Double.toString(calc.getAnswer()));
        
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
         if (radDegrees.isSelected()){
            calc.setAnswer (Math.cos(Math.toRadians(Double.parseDouble(txtBox.getText()))));
            }
        else{
            calc.setAnswer (Math.cos(Double.parseDouble(txtBox.getText())));
        }
        txtBox.setText(Double.toString(calc.getAnswer()));
        
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
         if (radDegrees.isSelected()){
            calc.setAnswer (Math.tan(Math.toRadians(Double.parseDouble(txtBox.getText()))));
            }
        else{
            calc.setAnswer (Math.tan(Double.parseDouble(txtBox.getText())));
        }
        txtBox.setText(Double.toString(calc.getAnswer()));
        
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnAsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsinActionPerformed
        calc.setAnswer(Math.asin(Double.parseDouble(txtBox.getText())));
        if (radDegrees.isSelected()){
            calc.setAnswer(Math.toDegrees(calc.getAnswer()));
        }
        txtBox.setText(Double.toString(calc.getAnswer()));
    }//GEN-LAST:event_btnAsinActionPerformed

    private void btnAcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcosActionPerformed
         calc.setAnswer(Math.acos(Double.parseDouble(txtBox.getText())));
        if (radDegrees.isSelected()){
            calc.setAnswer(Math.toDegrees(calc.getAnswer()));
        }
        txtBox.setText(Double.toString(calc.getAnswer()));
    }//GEN-LAST:event_btnAcosActionPerformed

    private void btnAtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtanActionPerformed
         calc.setAnswer(Math.atan(Double.parseDouble(txtBox.getText())));
        if (radDegrees.isSelected()){
            calc.setAnswer(Math.toDegrees(calc.getAnswer()));
        }
        txtBox.setText(Double.toString(calc.getAnswer()));
    }//GEN-LAST:event_btnAtanActionPerformed
    
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
            java.util.logging.Logger.getLogger(CalcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAcos;
    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnAsin;
    private javax.swing.JButton btnAtan;
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFactor;
    private javax.swing.JButton btnFraction4;
    private javax.swing.ButtonGroup btnGrpFont;
    private javax.swing.ButtonGroup btnGrpView;
    private javax.swing.JButton btnMulitply;
    private javax.swing.JButton btnPI;
    private javax.swing.JButton btnPosNeg;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton btnTan;
    private javax.swing.ButtonGroup btngrpRound;
    private javax.swing.ButtonGroup btngrpScience;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAbout;
    private javax.swing.JMenu mnuFont;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuHotKeys;
    private javax.swing.JMenu mnuRound;
    private javax.swing.JMenu mnuView;
    private javax.swing.JOptionPane msgAbout;
    private javax.swing.JOptionPane msgHotKeys;
    private javax.swing.JOptionPane msgMessage;
    private javax.swing.JRadioButtonMenuItem radBasic;
    private javax.swing.JRadioButtonMenuItem radBold;
    private javax.swing.JRadioButton radDegrees;
    private javax.swing.JRadioButtonMenuItem radExtended;
    private javax.swing.JRadioButtonMenuItem radPlain;
    private javax.swing.JRadioButton radRadians;
    private javax.swing.JRadioButtonMenuItem radRound0;
    private javax.swing.JRadioButtonMenuItem radRound1;
    private javax.swing.JRadioButtonMenuItem radRound2;
    private javax.swing.JRadioButtonMenuItem radRound3;
    private javax.swing.JRadioButtonMenuItem radRound4;
    private javax.swing.JRadioButtonMenuItem radRound5;
    private javax.swing.JRadioButtonMenuItem radRound6;
    private javax.swing.JRadioButtonMenuItem radRound7;
    private javax.swing.JRadioButtonMenuItem radRound8;
    private javax.swing.JRadioButtonMenuItem radRound9;
    private javax.swing.JTextField txtBox;
    // End of variables declaration//GEN-END:variables
}
