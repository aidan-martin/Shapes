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
public class Triangle {

    public Triangle(double base, double height) {
        this.height = height;
        this.base = base;

    }
    private double base, height;

    public double getArea() {
        return height * base / 2.0;
    }
}
    

