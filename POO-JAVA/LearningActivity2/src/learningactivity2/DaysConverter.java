/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningactivity2;

/**
 *
 * @author ediei
 */

class DaysConstants {
    static final int HOURS_IN_A_DAY = 24;
    static final int MINUTES_IN_A_DAY = HOURS_IN_A_DAY * 60;
    static final int SECONDS_IN_A_DAY = MINUTES_IN_A_DAY * 60;
}

public class DaysConverter {
 
    private final int days;
    
    public DaysConverter(int days) {
        this.days = Math.max(days, 0);
    }
    
    public int toHours() {
        return days * DaysConstants.HOURS_IN_A_DAY;
    }
    
    public int toMinutes() {
        return days * DaysConstants.MINUTES_IN_A_DAY;
    }
    
    public int toSeconds() {
        return days * DaysConstants.SECONDS_IN_A_DAY;
    }
    
}
