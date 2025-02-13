/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculatorwithgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorWithGUI extends javax.swing.JFrame {

    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";
    private String currentInput = "";
    private String expression = "";

    public CalculatorWithGUI() {
        initComponents();
        addActionListenersToButtons();
    }

    private void addActionListenersToButtons() {
        
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "1";
                expression += "1";
                result.setText(expression);
            }
        });
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "2";
                expression += "2";
                result.setText(expression);
            }
        });
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "3";
                expression += "3";
                result.setText(expression);
            }
        });

        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "4";
                expression += "4";
                result.setText(expression);
            }
        });

        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "5";
                expression += "5";
                result.setText(expression);
            }
        });

        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "6";
                expression += "6";
                result.setText(expression);
            }
        });

        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "7";
                expression += "7";
                result.setText(expression);
            }
        });

        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "8";
                expression += "8";
                result.setText(expression);
            }
        });

        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "9";
                expression += "9";
                result.setText(expression);
            }
        });

        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "0";
                expression += "0";
                result.setText(expression);
            }
        });

        doubleZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput += "00";
                expression += "00";
                result.setText(expression);
            }
        });

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(currentInput);
                operator = "+";
                expression += " + ";
                currentInput = "";
                result.setText(expression);
            }
        });

        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(currentInput);
                operator = "-";
                expression += " - ";
                currentInput = "";
                result.setText(expression);
            }
        });

        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(currentInput);
                operator = "*";
                expression += " * ";
                currentInput = "";
                result.setText(expression);
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(currentInput);
                operator = "/";
                expression += " / ";
                currentInput = "";
                result.setText(expression);
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentInput = "";
                expression = ""; 
                result.setText(expression);
            }
        });

        decimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!currentInput.contains(".")) {
                    currentInput += ".";
                    expression += ".";
                    result.setText(expression);
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!currentInput.isEmpty()) {
                    currentInput = currentInput.substring(0, currentInput.length() - 1);
                    expression = expression.substring(0, expression.length() - 1);
                    result.setText(expression);
                }
            }
        });

        percent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double value = Double.parseDouble(currentInput);
                    double percentValue = value / 100;
                    currentInput = String.valueOf(percentValue);
                    expression = currentInput;
                    result.setText(expression);
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }
        });
        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(currentInput);
                double res = 0;
                switch (operator) {
                    case "+":
                        res = num1 + num2;
                        break;
                    case "-":
                        res = num1 - num2;
                        break;
                    case "*":
                        res = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            res = num1 / num2;
                        } else {
                            result.setText("Error: Division by zero");
                            return;
                        }
                        break;
                }
                expression += " = " + res;
                result.setText(expression);
                num1 = 0;
                num2 = 0;
                currentInput = "";
                operator = "";
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nine = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        six = new javax.swing.JButton();
        five = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        one = new javax.swing.JButton();
        three = new javax.swing.JButton();
        two = new javax.swing.JButton();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        result = new javax.swing.JTextField();
        doubleZero = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        four = new javax.swing.JButton();
        seven = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nine.setBackground(new java.awt.Color(51, 51, 51));
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("9");
        nine.setBorderPainted(false);
        getContentPane().add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 70, 60));

        eight.setBackground(new java.awt.Color(51, 51, 51));
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setText("8");
        eight.setBorderPainted(false);
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 70, 60));

        multiply.setBackground(new java.awt.Color(102, 102, 102));
        multiply.setForeground(new java.awt.Color(255, 255, 255));
        multiply.setText("*");
        multiply.setBorderPainted(false);
        getContentPane().add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 70, 60));

        six.setBackground(new java.awt.Color(51, 51, 51));
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setText("6");
        six.setBorderPainted(false);
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 70, 60));

        five.setBackground(new java.awt.Color(51, 51, 51));
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setText("5");
        five.setBorderPainted(false);
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 70, 60));

        subtract.setBackground(new java.awt.Color(102, 102, 102));
        subtract.setForeground(new java.awt.Color(255, 255, 255));
        subtract.setText("-");
        subtract.setBorderPainted(false);
        getContentPane().add(subtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 70, 60));

        one.setBackground(new java.awt.Color(51, 51, 51));
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setText("1");
        one.setBorderPainted(false);
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 70, 60));

        three.setBackground(new java.awt.Color(51, 51, 51));
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setText("3");
        three.setBorderPainted(false);
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 70, 60));

        two.setBackground(new java.awt.Color(51, 51, 51));
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setText("2");
        two.setBorderPainted(false);
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 70, 60));

        add.setBackground(new java.awt.Color(102, 102, 102));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("+");
        add.setBorderPainted(false);
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 70, 60));

        clear.setBackground(new java.awt.Color(102, 102, 102));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("C");
        clear.setBorderPainted(false);
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 60));

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DEL");
        delete.setBorderPainted(false);
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, 60));

        percent.setBackground(new java.awt.Color(102, 102, 102));
        percent.setForeground(new java.awt.Color(255, 255, 255));
        percent.setText("%");
        percent.setBorderPainted(false);
        getContentPane().add(percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 70, 60));

        divide.setBackground(new java.awt.Color(102, 102, 102));
        divide.setForeground(new java.awt.Color(255, 255, 255));
        divide.setText("/");
        divide.setBorderPainted(false);
        getContentPane().add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 70, 60));
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 100));

        doubleZero.setBackground(new java.awt.Color(51, 51, 51));
        doubleZero.setForeground(new java.awt.Color(255, 255, 255));
        doubleZero.setText("00");
        doubleZero.setBorderPainted(false);
        getContentPane().add(doubleZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 70, 60));

        decimal.setBackground(new java.awt.Color(51, 51, 51));
        decimal.setForeground(new java.awt.Color(255, 255, 255));
        decimal.setText(".");
        decimal.setBorderPainted(false);
        getContentPane().add(decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 70, 60));

        zero.setBackground(new java.awt.Color(51, 51, 51));
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setText("0");
        zero.setBorderPainted(false);
        getContentPane().add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 70, 60));

        equals.setBackground(new java.awt.Color(228, 118, 149));
        equals.setForeground(new java.awt.Color(255, 255, 255));
        equals.setText("=");
        equals.setBorderPainted(false);
        getContentPane().add(equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 70, 60));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        four.setBackground(new java.awt.Color(51, 51, 51));
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setText("4");
        four.setBorderPainted(false);

        seven.setBackground(new java.awt.Color(51, 51, 51));
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setText("7");
        seven.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorWithGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorWithGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorWithGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorWithGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorWithGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton decimal;
    private javax.swing.JButton delete;
    private javax.swing.JButton divide;
    private javax.swing.JButton doubleZero;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton percent;
    private javax.swing.JTextField result;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton subtract;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
