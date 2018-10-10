import java.util.Scanner;
class Rextester
{
    public class Circle
    {
       private double radius;
       private String color;
        
        public Circle()
        {
            double radius = 1.0;
            String color = "red";  
        }
        
        public double Circle(double radius)
        {
            this.radius=radius;
        }
            
        public double getRadius()
        {
           return radius;
           System.out.println("Radius : "+radius);
        }
        
        public double getArea()
        {
            return area= 3.14*radius*radius;
            System.out.println("Area : "+area);
        }
        
    }   
}
        
class Circles_1
{
            
    public static void main(String[] args)
    {
        Circle cir = new Circle();
        cir.Circle();
        cir.Circle(1.0);
        cir.getRadius();
        cir.getArea();
    }
}
  