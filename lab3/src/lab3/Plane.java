package lab3;
import java.util.Arrays;
import java.util.Comparator;

public class Plane{

    private PlaneSeat[] seats=new PlaneSeat[12];
    //12
    int numEmptySeat;

    public Plane(){
        this.numEmptySeat=12;
        for (int i=0;i<12;i++){
            this.seats[i]= new PlaneSeat(i);
        }
    }
    public PlaneSeat[] sortSeats(){
        PlaneSeat[] seatTemp = new PlaneSeat[12];
        seatTemp=this.seats.clone();
        Arrays.sort(seatTemp, Comparator.comparingInt(PlaneSeat::getCustomerID));

        return seatTemp;
    }
    public void showNumEmptySeats(){
        int count=0;
        for (PlaneSeat x: seats){
            if (!x.isOccupied()){
                count++;
            }
        }
        System.out.println("There are " + count +" empty seats");
    }
        
    
    public void showEmptySeats(){
        System.out.println("The following seats are empty:");
        for (PlaneSeat x: seats){
            if (!x.isOccupied()){
                int y=x.getSeatID()+1;
                System.out.println("SeatID " + y);
            }
        }
    }

    public void showAssignedSeats(boolean bySeatID){
        if (bySeatID){
            for (PlaneSeat x: seats){
                if (x.isOccupied()==true){
                    int y=x.getSeatID()+1;
                    System.out.println("SeatID " + y + " assigned to CustomerID " + x.getCustomerID());
    
                }
            }

        }else{
            PlaneSeat[] by_Seats=new PlaneSeat[12];
            by_Seats=sortSeats();
            for (PlaneSeat x: by_Seats){
                if (x.isOccupied()==true){
                    int y=x.getSeatID()+1;
                    System.out.println( "SeatID " + y + " assigned to " + x.getCustomerID());
    
                }
            }
        }
    }

    public void assignSeat(int seatID, int cust_id){
        if (this.seats[seatID-1].isOccupied()){
            System.out.println("Seat already assigned to a customer.");
        }else{
            this.seats[seatID-1].assign(cust_id);
            this.numEmptySeat--;
            System.out.println("Seat Assigned!");
        }

    }
    public void unAssignSeat(int seatID){

        this.seats[seatID-1].unAssign();
        this.numEmptySeat++;
        System.out.println("Seat Unassigned!");

    }
}