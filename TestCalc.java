/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author geese
 */
public class TestCalc {
    
    public static void main(String[] args) {
        Calculations c = new Calculations();
        

        
        
        c.setNum1(1);  
        c.setOperator('/');
        c.setNum2(0);
        c.calculate();
        
        double ans = c.getAnswer();
        
        System.out.println(ans);
        
    }
    
}
