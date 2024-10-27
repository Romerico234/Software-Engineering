public class SquareAdapter implements Rectangle {
    private final Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void setWidth(int width) {
        square.setSide(width); // Setting width is the same as setting the side in Square
    }

    @Override
    public void setHeight(int height) {
        square.setSide(height); // Setting height is the same as setting the side in Square
    }

    @Override
    public int getWidth() {
        return square.getSide(); 
    }

    @Override
    public int getHeight() {
        return square.getSide(); 
    }
}



