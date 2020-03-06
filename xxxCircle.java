package sample;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
class xxxCircle extends xxxShape {
    private double radius;
    public xxxCircle()
    {
        radius=0;
    }
    public xxxCircle(double inpx1,double inpy1,double inpradius,String inpcolor) {
        setX(inpx1);
        setY(inpy1);
        radius=inpradius;
        setColor(inpcolor);
    }
    double getRadius() {
        return radius;
    }
    void setRadius(int input)
    {

        radius=input;
    }
    @Override
    public String toString() {
        double perimeter= 2* Math.PI* radius;
        double area=Math.PI*Math.pow(radius,2);
        return "Radius="+Double.toString(radius)+",Perimeter="+perimeter+",Area="+area;
    }

    @Override
    void draw(GraphicsContext circle) {
        circle.setStroke(Color.valueOf(getColor()));
        circle.strokeOval(getX()-radius,getY()-radius,radius*2,radius*2);
        circle.setFill(Color.valueOf(getColor()));
        circle.fillOval(getX()-radius,getY()-radius,radius*2,radius*2);
    }
}