package part2;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of shapes: ");
        int n=sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println("What Shape? ");
            System.out.println("(1) Sqaure ");
            System.out.println("(2) Rectangle");
            System.out.println("(3) Circle ");
            System.out.println("(4) Traingle ");
            System.out.println("(5) Exit ");
            int shape=sc.nextInt();

            switch (shape) {
                case 1:
                    System.out.println("Square Chosen! Enter length of side: ");

                    Square sq= new Square(sc.nextInt());
                    System.out.println("Area = " + sq.getArea());     
                    break;
                case 2:
                    System.out.println("Rectangle Chosen! Enter width: ");
                    int w=sc.nextInt();
                    System.out.println("Enter length: ");

                    Rectangle rec= new Rectangle(w, sc.nextInt());
                    System.out.println("Area = " + rec.getArea());     
                    break;

                case 3:
                    System.out.println("Circle Chosen! Enter radius: ");
                    Circle cc= new Circle(sc.nextInt());
                    System.out.println("Area = " + cc.getArea());     
                    break;
                case 4:
                    System.out.println("Traigle Chosen! Enter height: ");
                    int h=sc.nextInt();
                    System.out.println("Enter base: ");

                    Triangle tg= new Triangle(sc.nextInt(),h);
                    System.out.println("Area = " + tg.getArea());     
                    break;

                default:
                    System.out.println("Exiting... ");
                    System.exit(0);
            }
        }
    }
    
}
