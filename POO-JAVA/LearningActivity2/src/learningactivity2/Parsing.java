/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningactivity2;

/**
 *
 * @author ediei
 */
public class Parsing {
    
    public static int toInt(String value) {
        int intValue;
        try {
            intValue = Integer.parseInt(value);
        } catch(NumberFormatException nfe) {
            intValue = 0;
        }
        return intValue;
    }
    
}
