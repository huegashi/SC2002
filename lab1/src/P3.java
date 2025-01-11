
import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        Scanner sc_start= new Scanner(System.in);
        Scanner sc_end= new Scanner(System.in);
        Scanner sc_increment= new Scanner(System.in);
        final double rate=1.82;

        System.out.println("Enter starting:");
        int start=sc_start.nextInt();
        System.out.println("Enter ending:");
        int end=sc_end.nextInt();
        System.out.println("Enter increment:");
        int increment=sc_increment.nextInt();
        
        System.out.println("US$         S$");
        System.out.println("--------------");
    
        //first table
        for (int i=start;i<=end;i+=increment){
            System.out.println(i +"           "+ rate*i);
        }
        //second table
        System.out.println("US$         S$");
        System.out.println("--------------");
        int i=start;
        while (i<=end){
            
            System.out.println(i +"           "+ rate*i);
            i+=increment;
        }
        //third table
        i=start;
        System.out.println("US$         S$");
        System.out.println("--------------");
        do { 
           
            System.out.println(i +"           "+ rate*i);
            i+=increment;
        } while (i<=end);
    }
    
}