public class Rectangle {
        private String color;

        public Rectangle(String color){
            this.setColor(color);
        }

        public void draw(int x, int y, int width, int height) {
            System.out.println(this.color + " Rectangle with coordinate left-down point ("
                    + x + "," + y + ") width: "
                    + width + ", height: " + height);
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
}
