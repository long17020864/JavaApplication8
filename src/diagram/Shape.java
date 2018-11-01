
package diagram;

public abstract class Shape {
    protected double x,y;
    protected String color;
    protected boolean move;
    
    Shape(){
        x=0;
        y=0;
        color="white";
        move=true;
    }
    
    Shape(double _x,double _y,String _color,boolean _move){
        x=_x;
        y=_y;
        color=_color;
        move =_move;
    }
    
    public abstract boolean equals(Object object);
    
    public String toString(){
        return x+" "+y+" "+color+" ";
    }
}