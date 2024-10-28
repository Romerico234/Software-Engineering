public class Performance {
    public static void clientCode(Rectangle rectangle) {
        int width = 5;
        int height = 10;
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getWidth() * rectangle.getHeight());
    }

    public static void main(String[] args) {
        Square square = new Square();
        SquareAdapter adapter = new SquareAdapter(square);
        System.out.println("Client code is working with the Square via the Rectangle interface:");
        clientCode(adapter);
    }
}
