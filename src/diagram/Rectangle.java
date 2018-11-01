package diagram;

public class Rectangle extends Shape{
    private double width,height;

    public Rectangle() {
        super();
        width=height=0;
    }
    
    public Rectangle(int x,int y,String color,boolean move,double width,double height){
        super(x,y,color,move);
        this.width=width;
        this.height=height;
    }
    
    public void setWidth(double width)  {this.width=width;}
    
    public void setHeight(double height) {this.height=height;}
    
    public double getWidth() {return width;}
    
    public double getHeight() {return height;}
    
    @Override
    public String toString(){
        return super.toString()+width+" "+height;
    }
    
    @Override
    public boolean equals(Object object) {
        if(object instanceof Rectangle)
        {
            Rectangle rec =(Rectangle)object;
            if(rec.height==this.height && rec.width==this.width)
                if(rec.x==x && rec.y==y)
                    return true;            
        }
        return false;
    }
}