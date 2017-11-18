/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NgDeBao;

/**
 *
 * @author ASUS1
 */
public class Deliveryman {
    
    private String name;
    private String location;
    private String dateTime;

    public Deliveryman(String name, String location, String dateTime) {
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Name: " + name + "  Location: " + location + "  Date and Time: " + dateTime + "\n";
    }
    
}
