package sample;
import javafx.scene.canvas.GraphicsContext;
abstract class xxxShape extends Object{
    private double x;
    private double y;
    private String color;
    public xxxShape() {
        x=0;
        y=0;
        color=null;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    String getColor() {
        return color;
    }
    void setX(double input) {
        x=input;
    }
    void setY(double input) {
        y=input;
    }
    void setColor(String input) {
        color=input;
    }
    public String toString() {
        return null;
    }
    void draw(GraphicsContext shape)
    {};
}