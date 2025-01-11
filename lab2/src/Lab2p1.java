import java.util.Random;
import java.util.Scanner;
public class Lab2p1 {
    public static void main(String[] args)
    {
        int n,m;
        int choice;
        Scanner sc = new Scanner(System.in);

        Scanner sc_m = new Scanner(System.in);
        Scanner sc_n = new Scanner(System.in);
        do {
            
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");

            choice = sc.nextInt();
            switch (choice) {
            case 1:
                mulTest();
                break;
            case 2:
                
                System.out.println("Enter m:");
                m=sc_m.nextInt();
                System.out.println("Enter n:");
                n=sc_n.nextInt();
                System.out.println(m + "/" + n + " = " + (divide(m,n)));
                break;
            case 3: 
                System.out.println("Enter m:");
                m=sc_m.nextInt();
                System.out.println("Enter n:");
                n=sc_n.nextInt();
                System.out.println(m + "%" + n + " = " + (modulus(m,n)));
                break;
            case 4: 
                System.out.println("Enter n:");
                n=sc_n.nextInt();
                int result = countDigits(n);
                if (result >= 1) {
                    System.out.println("n : " + n + "  count = " + result);
                } else {
                    System.out.println("n : " + n + "  Error input!!");
                }
                break;
            case 5:
                
                System.out.println("Enter n:");
                n=sc_n.nextInt();
                System.out.println("Enter digit:");
                int digit=sc_m.nextInt();
                System.out.println("position = " + position(n, digit));
                break;
            case 6: 
                System.out.println("Enter n:");
                long long_n=sc_n.nextLong();
                long long_result = extractOddDigits(long_n);
                if (long_result== -2) {
                    System.out.println("oddDigits = Error input!!");
                }else{
                    System.out.println("oddDigits  = " + long_result);
                }
            
                break;
            case 7: 
                System.out.println("Program terminating ….");
                break;
            }
        } while (choice < 7);
    }

    public static void mulTest(){
        Random rand= new Random();
        int count=0;
        for (int i=0;i<5;i++){
            
            int x=rand.nextInt(9)+1;
            int y=rand.nextInt(9)+1;
            int ans=x*y;
            Scanner sc= new Scanner(System.in);
            System.out.println("How much is " + x + " times " + y + "?");
            int res=sc.nextInt();
            if (res==ans){
                count+=1;
            }
        }
        System.out.println( count + " answers out of 5 are correct");
    }

    public static int divide(int m, int n){
        int count=0;
        while (m>=n){
            m-=n;
            count+=1;
        }
        return count;
        
    }

    public static int modulus(int m, int n){
        while (m>=n){
            m-=n;
        }
        return m;
    }
    public static int countDigits(int n){
        if (n<0){
            return -1;
        }
        int count=0;
        while (n>0){
            n/=10;
            count+=1;
        }
        return count;
    }
    public static int position(int n, int digit){
        int x=countDigits(n);
 
        while (n>0){
            if (n%10==digit){
                return x;
            }
            n/=10;
            x-=1;
        }
        return -1;

    }
    public static long extractOddDigits(long n){
        if (n<0){
            return -2;
        }
        int count=1;
        int result=0;
        while (n>0){
            long x=n%10;
            if (x%2==1){
                result+=count*x;
                count*=10;
            }
            n/=10;
        }
        return (result==0)? -1: result;

    }
}