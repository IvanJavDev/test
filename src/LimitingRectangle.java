public class LimitingRectangle {
    int[][] points;
    int width;
    int height;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    String borders;

    public int getWidth() {

        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getBorders() {
        return borders;
    }

}

