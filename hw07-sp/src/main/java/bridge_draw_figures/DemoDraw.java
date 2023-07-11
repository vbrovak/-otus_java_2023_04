package bridge_draw_figures;

public class DemoDraw {
    public static void main(String[] args)
    {
        System.out.println("++++ 1 ++++ ");
        Shape Triangle1 = new Triangle(new RedColor());
        Triangle1.draw();

        System.out.println("++++ 2 ++++ ");
        Shape Triangle2 = new Triangle(new BlackColor());
        Triangle2.draw();

        System.out.println("++++ 3 ++++ ");
        Shape Rect = new Rect(new GreenColor());
        Rect.draw();
    }
}