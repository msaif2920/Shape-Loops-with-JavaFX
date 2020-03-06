package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        int canvasWidth=500;
        int canvasHeight=500;
        double radius=canvasWidth/2;
        Pane root = new Pane();
        Canvas canvas = new Canvas(canvasWidth,canvasHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();

xxxLine one = new xxxLine();
one.setX(0);
one.setY(0);
one.setX2(50);
one.setY2(50);
one.setColor("green");
one.draw(gc);

/*
xxxCircle two = new xxxCircle();
two.setX(100);
two.setY(100);
two.setRadius(50);
two.setColor("red");
two.draw(gc);

String output=two.toString();
System.out.println(two);
*/

        xxxPolygon three =new
                xxxPolygon(canvasWidth/2,canvasHeight/2,radius,5,"red","cyan");
        three.draw(gc);
        double d=radius*Math.abs(Math.cos(Math.PI/5));
        double ratio= d/radius;
        double newRadius=ratio*radius;
        xxxPolygon four =new
                xxxPolygon(canvasWidth/2,canvasHeight/2,newRadius,5,"yellow","orange");
        four.draw(gc);
        double d2=newRadius*Math.abs(Math.cos(Math.PI/5));

        double ratio2= d2/newRadius;
        double newNewRadius=ratio2*newRadius;
        xxxPolygon five=new
                xxxPolygon(canvasWidth/2,canvasHeight/2,newNewRadius,5,"green","purple");
        five.draw(gc);

        double d3=newNewRadius*Math.abs(Math.cos(Math.PI/5));
        double ratio3= d3/newNewRadius;
        double newNewNewRadius=ratio3*newNewRadius;
        xxxCircle six=new xxxCircle(radius,radius,newNewNewRadius,"blue");
        six.draw(gc);

        Scene scene = new Scene(root, canvasWidth, canvasHeight);
        primaryStage.setTitle("Alternating concentric pentagons and circles");
        primaryStage.setScene(scene);
        primaryStage.show();
        root.getChildren().add(canvas);
    }
    public static void main(String[] args) {
        launch(args);
    }
}