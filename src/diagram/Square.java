package diagram;
public class Square extends Shape{
    private double edge;

    public Square() {
        super();
        edge=0;
    }
    
    public Square(int x,int y,String color,boolean move,double edge){
        super(x,y,color,move);
        this.edge=edge;
    }
    
    public void setEdge(double edge) {this.edge=edge;}
    public double getEdge() {return edge;}
    
    @Override
    public String toString(){
        return super.toString()+edge;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Square)
        {
            Square sq =(Square)object;
            if(sq.edge==edge)
                if(sq.x==x && sq.y==y)
                    return true;            
        }
        return false;
    }
}