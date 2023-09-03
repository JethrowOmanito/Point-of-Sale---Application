/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication9;
import java.util.Date;
/**
 *
 * @author Jethrow Cruz
 */
public class EmployeeData {
    
    private String employee_name;
    private String shift;
    private String position;
    private String timein;
    private String timeout;
    private Date date;
    
    public EmployeeData(String employee_name,String shift,String position,String timein,String timeout,Date date){

        this.employee_name = employee_name;
        this.shift = shift;
        this.position = position;
        this.timein = timein;
        this.timeout = timeout;
        this.date = date;
        
    }

    public String getEmployee_name() {
    return employee_name;
}

    public String getShift() {
        return shift;
    }

    public String getPosition() {
        return position;
    }

    public String getTimein() {
        return timein;
    }

    public String getTimeout() {
        return timeout;
    }

    public Date getDate() {
        return date;
    }
}
