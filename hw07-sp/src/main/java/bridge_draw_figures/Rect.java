package bridge_draw_figures;

public class Rect extends Shape {

    public Rect(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        color.fillColor();
    }
}