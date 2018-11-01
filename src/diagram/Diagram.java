
package diagram;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author vukhu
 */
public class Diagram {

    ArrayList<Layer> listLayer;
    
    Diagram(){
        listLayer = new ArrayList<>();
    }
    
    void draw()
    {
        for(Layer item:listLayer)
        {
            if(item.getVisible())
            {
                item.show();
            }
        }
    }
    
    public void deleteCircle(){
        for(int i=0;i<listLayer.size();i++)
        {
            for(int j=0;j<listLayer.get(i).listShape.size();j++)
            {
                if(listLayer.get(i).listShape.get(j) instanceof Circle)
                {
                    System.out.println( ((Circle)listLayer.get(i).listShape.get(j)).radius);
                    listLayer.get(i).listShape.remove(j);
                }
            }
        }
    }
    
    public void createGroupShape()
    {
        Map<String,Layer> listGroupShape = new TreeMap<>();
        
        Layer a = new Layer();
        listGroupShape.put(listLayer.get(0).listShape.get(0).getClass().toString(), a);
        for(Layer layer:listLayer)
        {
            for(Shape shape:layer.listShape)
            {
                if(listGroupShape.containsKey(shape.getClass().toString()))
                {
                    listGroupShape.get(shape.getClass().toString()).listShape.add(shape);
                }
                else
                {
                    Layer b = new Layer();
                    b.listShape.add(shape);
                    listGroupShape.put(shape.getClass().toString(), b);
                }
            }
        }
        
        int i=0;
        for(String key: listGroupShape.keySet()){
            System.out.println("Layer "+i);
            listGroupShape.get(key).show();
            i++;
        }
    }
    
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
        
        Shape shape1_0 = new Circle(1, 2, "Circle", true,3.1);
        Shape shape1_1 = new Circle(1, 2, "Circle", true,3.1);
        Shape shape1_2 = new Circle(1, 2, "Circle", true,3.1);
        Shape shape2=new Rectangle(2, 2, "rectangle", true, 5, 5);
        Shape shape3= new Square();
        Shape shape4 = new Triangle();
        
        layer1.listShape.add(shape4);
        layer1.listShape.add(shape3);
        layer1.listShape.add(shape2);
        layer1.listShape.add(shape1_0);
        layer1.listShape.add(shape1_1);
        layer1.listShape.add(shape1_2);
        
        diagram.listLayer.add(layer1);
        diagram.createGroupShape();
        diagram.draw();
    }
    
}