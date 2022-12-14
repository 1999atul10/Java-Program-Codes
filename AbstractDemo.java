
public class AbstractDemo
{
    public static void main(String[] args)throws Exception
    {
        public abstract class Shape
{
   private double height;  // To hold height.
   private double width;  //To hold width or base

   // Set height and width
   public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }

   //Get height
   public double getHeight() 
   {
       return height;
   }
     
   //Get width
   public double getWidth() 
   {
       return width;
   } 

   // The getArea method is abstract.   
   // It must be overridden in a subclass. 

   public abstract double getArea();
}
public class Rectangle extends Shape
{
    //Calculate and return area of rectangle
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}
public class Triangle extends Shape
{ 
    //Calculate and return area of triangle
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
}     
        Shape shape;
        
        // assign subclass reference to subclass variable
        Rectangle rect = new Rectangle();
        
        // shape points to the object rect.
        shape = rect;

        // Set data in Rectangle's object 
        shape.setValues(78, 5);
        
        //Display the area of rectangle
        System.out.println("Area of rectangle : " + shape.getArea());
        
        // assign subclass reference to subclass variable
        Triangle tri = new Triangle();
        
        // shape points to the object rect.        
        shape = tri;
        
        // Set data in Triangle's object         
        shape.setValues(34,3);
        
        //Display the area of triangle        
        System.out.println("Area of triangle : " + shape.getArea());
    }
}