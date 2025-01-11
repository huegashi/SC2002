package part2;

import java.util.Scanner;
//I used square for cuboid and cylinder for rectangle instead
//since it seemed less appropriate for square to take on cylinder compared to rectangle 
public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of shapes: ");
        int n=sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println("What Shape? ");
            System.out.println("(1) Cuboid ");
            System.out.println("(2) Cylinder");
            System.out.println("(3) Sphere ");
            System.out.println("(4) Cone ");
            System.out.println("(5) Exit ");
            int shape=sc.nextInt();
 
            switch (shape) {
                case 1:
                    System.out.println("Cuboid Chosen! Enter length of side: ");

                    Square sq= new Square(sc.nextInt());
                    System.out.println("Volume = " + sq.getVol());     
                    break;
                case 2:
                    System.out.println("Cylinder Chosen! Enter width: ");
                    int w=sc.nextInt();
                    System.out.println("Enter length: ");

                    Rectangle rec= new Rectangle(w, sc.nextInt());
                    System.out.println("Volume = " + rec.getVol());     
                    break;

                case 3:
                    System.out.println("Sphere Chosen! Enter radius: ");
                    Circle cc= new Circle(sc.nextInt());
                    System.out.println("Volume = " + cc.getVol());     
                    break;
                case 4:
                    System.out.println("Cone Chosen! Enter height: ");
                    int h=sc.nextInt();
                    System.out.println("Enter base: ");
                    //1int x=sc.nextInt();
                    
                    Triangle tg= new Triangle(sc.nextInt(),h);
                    System.out.println("Volume = " + tg.getVol());     
                    break;

                default:
                    System.out.println("Exiting... ");
                    System.exit(0);
            }
        }
    }
    
}
