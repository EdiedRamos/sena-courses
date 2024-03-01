/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningactivity2;

/**
 *
 * @author ediei
 */
public class Product {
    
    
    private int unitValue = Integer.MAX_VALUE;
    private int quantity = Integer.MAX_VALUE;
    private int valueTotal = Integer.MAX_VALUE;
    
    
    public Product (String unitValue, String quantity) {
       
        this.unitValue = Parsing.toInt(unitValue);
        this.quantity = Parsing.toInt(quantity);
        
        this.valueTotal = this.unitValue * this.quantity;
    }
    
    public int getValueTotal() {
        return valueTotal;
    }
}
