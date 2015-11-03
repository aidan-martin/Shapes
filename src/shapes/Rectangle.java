/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author aidanmartin
 */
public class Rectangle {
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    private double length, width;
    
    public double getPerimeter(){
        return 2.0 * (length + width);
    }
    
    public double getArea(){
        return length * width;     
    }
    
}
