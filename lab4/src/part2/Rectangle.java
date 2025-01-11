package part2;

public class Rectangle implements Shape{
    private int height;
    private int width;
    public Rectangle(int width, int height){
        this.height=height;
        this.width=width;
    }
    public int getheight(){
        return this.height;
    }
    public int getwidth(){
        return this.width;
    }

    public double getArea(){
        return this.width*this.height;
    }
    public double getVol(){
        return Math.pow(this.width,2)*Math.PI*height;
    }
}