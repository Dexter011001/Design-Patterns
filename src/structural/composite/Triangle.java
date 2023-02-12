package structural.composite;
// Leaf implements base component
public class Triangle implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
}
