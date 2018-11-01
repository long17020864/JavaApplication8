package diagram;

import java.util.ArrayList;
public class Layer {
    ArrayList<Shape> listShape;
    private boolean visible;
    
    Layer(){
        listShape = new ArrayList<>();
        visible=true;
    }
    
    public void setVisible(boolean _visible){
        visible=_visible;
    }
    
    public boolean getVisible() {return visible;}
    
    public void addShape(Shape shape)
    {
        if(shape!=null)
            listShape.add(shape);
    }
    
    public void deleteShapeEquale(){
        for(Shape item1:listShape)
        {
            for(Shape item2:listShape)
            {
                if(item1.getClass().getName().equals(item2.getClass().getName()))
                {
                    if(item1.equals(item2))
                    {
                        listShape.remove(item1);
                        break;
                    }
                }
            }
        }
    }
    
    public void show()
    {
        System.out.println("");
        for(Shape item:listShape)
        {
            System.out.println(item.toString());
        }
    }
    
    public void deleteTriagle(){
        for(int i=0;i<listShape.size();i++)
        {
            if(listShape.get(i) instanceof Triangle)
            {
                System.out.println(((Triangle) listShape.get(i)).edge1);
                listShape.remove(listShape.get(i));
            }
        }
    }
}