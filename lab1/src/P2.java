
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
        
        Scanner sc_salary = new Scanner(System.in);
        Scanner sc_merit = new Scanner(System.in);
        char grade;

        System.out.println("Enter Salary:");
        int salary=sc_salary.nextInt();

        System.out.println("Enter Merit:");
        int merit=sc_merit.nextInt();

        if (salary<600){
            grade='C';
        }else if (salary<=649){
            grade= (merit<10)? 'C':'B';
        }else if (salary<700){
            grade='B';
        }else if (salary<=799){
            grade=(merit<20)? 'B':'A';
        }else{
            grade='A';
        }
        
        System.out.println("Grade is " + grade);

    }

}
