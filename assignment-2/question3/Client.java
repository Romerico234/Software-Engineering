public class Client {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(5);
    
        Rectangle rectangle = new SquareAdapter(square);
        rectangle.setWidth(10);
        rectangle.setHeight(20);
    
        System.out.println("Width: " + rectangle.getWidth());   
        System.out.println("Height: " + rectangle.getHeight()); 
    }
}
