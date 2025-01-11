package part2;

public class Circle implements Shape{
    private int radius;
    public Circle(int rad){
        this.radius=rad;
    }
    public int getside(){
        return this.radius;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    public double getVol(){
        return (4/3)*Math.PI*Math.pow(this.radius,3);
    }
}
