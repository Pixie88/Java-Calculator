/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.lang.Math;

public class Calculations {
    //setting variables for calculations
        private double num1 = 0;
        private double num2 = 0;
        private char operator = '0';
        private double answer;
          
        
//switch for calculations
public void calculate() throws ArithmeticException {
    
    switch (getOperator()){  
        case '0': setAnswer(0);
              break;
        case '+': setAnswer(getNum1() + getNum2());
              break;
        case '-': setAnswer(getNum1() - getNum2());
              break;
        case '/': 
            if (getNum2() == 0){
               // throws exception to CalcJFrame
                throw new ArithmeticException("Cannot divide a number by zero");
            }
            setAnswer(getNum1() / getNum2());
              break;
        case  '*': setAnswer(getNum1() * getNum2());
               break;
                
        case 'p': setAnswer(Math.pow(getNum1(), getNum2()));
               break;
            }
        }

    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * @return the operator
     */
    public char getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(char operator) {
        this.operator = operator;
    }

    /**
     * @return the answer
     */
    public double getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(double answer) {
        this.answer = answer;
    }

  
}
    
    
 



