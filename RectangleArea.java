import java.util.Scanner;//import the java scanner to allow user to enter values

public class RectangleArea {
    public static void main(String[] args){
    
     Scanner input = new Scanner(System.in);

     //prompt the user to input the lenght
     System.out.println("Enter the length: ");
     double length = input.nextDouble();

     //prompt the user to input the breadth
     System.out.println("Enter the breadth: ");
     double breadth = input.nextDouble();

     //this will output the area
     Area rectangleArea = new Area(length, breadth);
     System.out.print(rectangleArea.Area());
    }
}
class Area{ 
    double length;
    double breadth;

    public Area(double newlength, double newbreadth){
        this.length = newlength;
        this.breadth = newbreadth;
    }
    public double Area(){
        double result = length * breadth;
        return result;
    }
}