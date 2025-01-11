package part2;


public class Triangle implements Shape{
    private int height;
    private int base;
    public Triangle(int base, int height){
        this.height=height;
        this.base=base;
    }
    public int getheight(){
        return this.height;
    }
    public int getbase(){
        return this.base;
    }

    public double getArea(){
        return 0.5*this.base*this.height;
    }
    public double getVol(){
        
        return (this.height*this.base*this.base*Math.PI)/3; 
    }
}
