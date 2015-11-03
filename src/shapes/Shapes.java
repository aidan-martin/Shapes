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
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testShapes();
    }

    private static void testShapes() {

        Circle myCircle = new Circle(5.5);

        myCircle.setRadius(3);

        System.out.println("Circle:");
        System.out.printf(" Radius = %.2f \n", myCircle.getRadius());
        System.out.printf(" Diameter = %.2f \n", myCircle.getDiameter());
        System.out.printf(" Circumference = %.2f \n", myCircle.getCircumference());
        System.out.printf(" Area = %.2f \n", myCircle.getArea());

        Rectangle myRectangle = new Rectangle(2.4, 3.6);

        System.out.println("Rectangle:");
        System.out.printf(" Perimeter = %.2f \n", myRectangle.getPerimeter());
        System.out.printf(" Area = %.2f \n", myRectangle.getArea());

        Triangle myTriangle = new Triangle(3.8, 2.9);
        System.out.println("Triangle:");
        System.out.printf(" Area = %.2f \n", myTriangle.getArea());

    }

}
