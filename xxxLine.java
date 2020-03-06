package sample;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
class xxxLine extends xxxShape{
    private double x2;
    private double y2;
    public xxxLine()
    {
        x2=0;
        y2=0;
    }
    public xxxLine(double inpx1,double inpy1,double inpx2,double inpy2)
    {
        setX(inpx1);
        setY(inpy1);
        x2=inpx2;
        y2=inpy2;
    }
    double getX2() {
        return x2;
    }
    double getY2() {
        return y2;
    }
    void setX2(double inputx2) {
        x2=inputx2;
    }
    void setY2(double inputy2) {
        y2=inputy2;
    }
    @Override
    public String toString() {
        double length= Math.sqrt(Math.pow(x2- getX(),2)+Math.pow(y2- getY(),2));
        double angle= Math.abs(Math.toDegrees(Math.atan( (y2-getY())/( x2-getX()))));
        return "Length="+Double.toString(length)+", Angle="+Double.toString(angle);
    }
    @Override

    void draw(GraphicsContext line) {
        line.beginPath();
        line.moveTo(getX(),getY());
        line.lineTo(x2,y2);
        line.setStroke(Color.valueOf(getColor()));
        line.stroke();
    }
}