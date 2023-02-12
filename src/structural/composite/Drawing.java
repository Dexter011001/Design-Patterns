package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Compositve object - contains group of leaf objects
public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape sh: shapes){
            sh.draw(fillColor);
        }
    }

    public void add(Shape s){
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s){
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
