package sample;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
class xxxPolygon extends xxxShape {
    private int N;
    private double radius;
    private String polygonColor;
    public xxxPolygon(){
        N=0;
        radius=0;
        String polygonColor=null;
    }
    void setPolygonColor(String input) { polygonColor=input; }
    String getPolygonColor() {
        return polygonColor;
    }
    public xxxPolygon(double inpx1,double inpy1,double inpradius,int numSides,String
            inpcolor,String polygoncolor){
        setX(inpx1);
        setY(inpy1);
        radius=inpradius;
        N=numSides;
        setColor(inpcolor);
        polygonColor=polygoncolor;
    }
    double getN() {
        return N;
    }
    void setN(int input) {

        N=input;
    }
    double getRadius() { return radius; }
    void setRadius(int input)
    {
        radius=input;
    }
    @Override
    public String toString() {
        double length=2*radius*Math.sin(Math.PI/N);
        double area= (Math.pow(length,2)*N)/((Math.tan(Math.PI/N)*4));
        return "Side length="+length+ ",Interior angle=" +Double.toString(360/N)+",Polygon Perimeter="+length*N+
                ",Polygon Area="+Double.toString(area);
    }
    @Override
    void draw(GraphicsContext polygon) {
        polygon.setStroke(Color.valueOf(getColor()));
        polygon.strokeOval(getX()-radius,getY()-radius,radius*2,radius*2);

        polygon.setFill(Color.valueOf(getColor()));
        polygon.fillOval(getX()-radius,getY()-radius,radius*2,radius*2);

        double[] angle= new double [N];
        double[] xArray = new double[N];
        double[] yArray = new double[N];
        double corners=Math.abs((1.5*Math.PI)/N);
        for(int i=0;i<N;i++)
        {
            angle[i]=corners;
            corners=corners+(2*Math.PI)/N;
        }

        for (int i=0; i<N;i++)
        {
            xArray[i]=Math.abs(radius*Math.cos(angle[i])+getX());
        }

        for (int i=0; i<N;i++)
        {
            yArray[i]=Math.abs(radius*Math.sin(angle[i])+getY());
        }
       /* polygon.setStroke(Color.valueOf(getPolygonColor()));
        polygon.strokePolygon(xArray,yArray,N);*/
        polygon.setFill(Color.valueOf(getPolygonColor()));
        polygon.fillPolygon(xArray,yArray,N);
    }
}