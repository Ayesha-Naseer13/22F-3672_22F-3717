package main;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class MyCalcApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel(); 
        
       
        CalculatorView view1 = new CalculatorView();
        CalculatorView view2 = new CalculatorView();
        
        
        CalculatorController controller1 = new CalculatorController(model, view1);
        CalculatorController controller2 = new CalculatorController(model, view2);
     
        view1.setVisible(true);
        view2.setVisible(true);
    }
}
