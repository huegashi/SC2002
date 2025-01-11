package lab3;
import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args){
        Plane app = new Plane();

        Scanner sc= new Scanner(System.in);
        Scanner x= new Scanner(System.in);
        Scanner y= new Scanner(System.in);
        int choice;
        do {
                
            System.out.println("Enter the number of your choice:");
            System.out.println("1: Show number of empty seats");
            System.out.println("2: Show the list of empty seats");
            System.out.println("3: Show the list of seat assignments by seat ID");
            System.out.println("4: Show the list of seat assignments by customer ID");
            System.out.println("5: Assign a customer to a seat");
            System.out.println("6: Remove a seat assignment");
            System.out.println("7: Exit");
            choice = sc.nextInt();
            
            switch (choice){
            case 1:
                app.showNumEmptySeats();
                break;
            case 2:
                app.showEmptySeats();
                break;
            case 3:
                app.showAssignedSeats(true);
                break;
            case 4:
                app.showAssignedSeats(false);
                break;
            
            case 5:

                System.out.println("Assigning Seat...");
                System.out.println("Please enter SeatID");
                int seatID=x.nextInt();

                System.out.println("Please enter Customer ID");
                int cust_id=y.nextInt();
                app.assignSeat(seatID, cust_id);
                break;
            
            case 6:
                System.out.println("Unassigning Seat...");
                System.out.println("Please enter SeatID");
                int seatid=x.nextInt();
                app.unAssignSeat(seatid);
                break;
            case 7:
                break;
            }
        } while (choice<7);

    }

    
    
}
