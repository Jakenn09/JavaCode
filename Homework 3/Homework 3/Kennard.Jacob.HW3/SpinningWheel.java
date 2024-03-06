import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.animation.RotateTransition;  
import javafx.application.Application;  
import javafx.geometry.Point3D;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;   
import javafx.scene.transform.Rotate;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class SpinningWheel extends Application{
    @Override
    public void start(Stage primaryStage) {
        ColorWheel wheel = new ColorWheel();
        wheel.setTranslateX(0);
        wheel.setTranslateY(100);
        wheel.setScaleX(1);
        wheel.setScaleY(1);
        
        Button Spin = new Button("Spin The Wheel");
        Spin.setText("Spin The Wheel");
        Spin.setTranslateX(250);
        Spin.setTranslateY(250);
         
        RotateTransition rotate = new RotateTransition();  
          
        //Setting Axis of rotation   
        rotate.setAxis(Rotate.Z_AXIS);  
          
        // setting the angle of rotation 
        rotate.setByAngle(2500);  
          
        //setting cycle count of the rotation   
        rotate.setCycleCount(1);  
          
        //Setting duration of the transition   
        rotate.setDuration(Duration.seconds(4));  
        
        //setting Rectangle as the node onto which the   
        // transition will be applied  
        rotate.setNode(wheel);  
          
        //playing the transition   
        rotate.play();
        
        
        Group root = new Group();  
        root.getChildren().add(wheel);  
        Scene scene = new Scene(root,500,500,Color.BLACK);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Spinning Wheel");  
        primaryStage.show();
        
    }
    public static void main(String[] args) {  
        launch(args);  
    }  
}

