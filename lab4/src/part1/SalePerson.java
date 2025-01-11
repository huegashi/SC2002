package part1;

public class SalePerson implements Comparable{
    private String firstName;
    private String lastName;
    private int totalSales;
    public SalePerson(String first, String last, int sales){
        this.firstName=first;
        this.lastName=last;
        this.totalSales=sales;

    }
    public String toString(){
        Integer sales = totalSales;
        String str_sales=sales.toString();
       
        return firstName+lastName+ str_sales;

    }

    public boolean equals(Object o){

        if (o.getClass()==this.getClass()){
            SalePerson s = (SalePerson) o;
            return s.getFirstName()==this.firstName && 
                        s.getFirstName()==this.firstName;
        }
        return false;
    }

    public int compareTo(Object o){
        if (o.getClass()==this.getClass()){
            
            SalePerson s= (SalePerson) o;
            if (this.totalSales==compareTo(s.getTotalSales())){
                return this.lastName.compareTo(s.getLastName());
        
            }else if (this.totalSales>s.getTotalSales()){

                return 1;
            }else{
                return -1;
            }
        }
        System.out.println("Wrong Class");
        return -2;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
    
}
