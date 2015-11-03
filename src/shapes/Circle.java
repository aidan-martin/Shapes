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
public class Circle {
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    private double radius;
    
    public double getRadius(){
        return radius;
       
    }
        
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getDiameter(){
        return radius * 2;
        
    }
    
    public double getCircumference(){
        return Math.PI * 2 * radius;
        
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
