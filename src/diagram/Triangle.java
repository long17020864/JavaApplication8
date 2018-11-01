package diagram;
public class Triangle extends Shape{
    double edge1,edge2,edge3,height;

    public Triangle() {
        super();
        edge1=edge2=edge3=height=0;
    }
    
    public Triangle(int x,int y,String color,boolean move,double _edge1,double _edge2,double _edge3,double _height)
    {
        super(x,y,color,move);
        edge1=_edge1;
        edge2=_edge2;
        edge3=_edge3;
        height=_height;
    }
    
    @Override
    public String toString(){
        return super.toString()+edge1+" "+edge2+" "+edge3+" "+height;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Triangle)
        {
            Triangle tri =(Triangle)object;
            if(tri.edge1==this.edge1 && tri.edge2==this.edge2 && tri.edge3==edge3)
                if(tri.x==x && tri.y==y)
                    return true;            
        }
        return false;
    }
}