import java.util.Scanner;

public class P4 {
    public static void main(String[] args){
        Scanner sc_height= new Scanner(System.in);

        System.out.println("Enter height");
        int height=sc_height.nextInt();
        if (height==0){
            System.out.println("Error Input!!");
            System.exit(0);
        }

        for (int i=1;i<=height;i++){
            StringBuilder x=new StringBuilder();
            char c=(i%2==1)? 'A':'B'; 
            for  (int j=0;j<i;j++){
                x.append(c);
                x.append(c);
                c=(c=='A')? 'B':'A';
        
            }
            System.out.println(x);
        }

    }
}
