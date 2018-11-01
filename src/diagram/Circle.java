package diagram;
public class Circle extends Shape{
    double radius;

    public Circle() {
        super();
        radius=0;
    }
    
    public Circle(int x,int y,String color,boolean move,double radius)
    {
        super(x,y,color,move);
        this.radius=radius;
    }
    
    public void setRadius(double r) {radius=r;}
    
    public double getRadius() {return radius;}
    
    public boolean equals(Circle c)
    {
        if(this.radius==c.radius)
        if(this.x==c.x)
        if(this.y==c.y)
            return true;
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString()+radius;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Circle)
        {
            Circle c = (Circle)object;
            if(this.radius==c.radius)
            if(this.x==c.x)
            if(this.y==c.y)
                return true;            
        }
        return false;
    }
}