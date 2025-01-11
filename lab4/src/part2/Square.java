package part2;

public class Square implements Shape{
    private int side;
    public Square(int side){
        this.side=side;
    }
    public int getside(){
        return this.side;
    }

    public double getArea(){
        return Math.pow(this.side,2);
    }
    public double getVol(){
        return Math.pow(this.side,3);
    }

    
}
