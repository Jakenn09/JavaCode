import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;


public class ColorWheel extends Group
{
    public ColorWheel()
    {
        Arc arc1 = new Arc(250,150,200,200,90,60);
        arc1.setType(ArcType.ROUND);
        arc1.setStroke(Color.RED);
        arc1.setFill(Color.RED);
        
        Arc arc2 = new Arc(250,150,200,200,150,60);
        arc2.setType(ArcType.ROUND);
        arc2.setStroke(Color.LIGHTGREEN);
        arc2.setFill(Color.LIGHTGREEN);
        
        Arc arc3 = new Arc(250,150,200,200,210,60);
        arc3.setType(ArcType.ROUND);
        arc3.setStroke(Color.YELLOW);
        arc3.setFill(Color.YELLOW);
        
        Arc arc4 = new Arc(250,150,200,200,270,60);
        arc4.setType(ArcType.ROUND);
        arc4.setStroke(Color.CYAN);
        arc4.setFill(Color.CYAN);
        
        Arc arc5 = new Arc(250,150,200,200,330,60);
        arc5.setType(ArcType.ROUND);
        arc5.setStroke(Color.PINK);
        arc5.setFill(Color.PINK);
        
        Arc arc6 = new Arc(250,150,200,200,390,60);
        arc6.setType(ArcType.ROUND);
        arc6.setStroke(Color.ORANGE);
        arc6.setFill(Color.ORANGE);
        
        getChildren().addAll(arc1, arc2, arc3, arc4, arc5, arc6);
    }
}