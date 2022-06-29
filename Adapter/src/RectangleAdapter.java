public class RectangleAdapter extends Shape {

    Rectangle r = new Rectangle("RED");

    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        r.draw(x1,y1,Math.abs(y1-y2),Math.abs(x1-x2));
    }


}
