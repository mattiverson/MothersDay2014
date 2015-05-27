/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mothersday;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author m1v3rpwn
 */
public class MothersDay extends Application {

    public static ArrayList<Tile> tiles;
    StackPane root;
    Canvas can;

    @Override
    public void start(Stage primaryStage) {
        tiles = new ArrayList<>();
        can = new Canvas(800, 600);
        root = new StackPane();
        Frame timer = new Frame();
        Scene scene = new Scene(root, 800, 600);
        can.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if (e.getButton().equals(MouseButton.PRIMARY)) {
                    double x = e.getSceneX();
                    double y = e.getSceneY();
                    for (Tile t : getNearbyTiles(x, y, 100)) {
                        repel(t, x, y);
                    }
                } else if (e.getButton().equals(MouseButton.SECONDARY)) {
                    double x = e.getSceneX();
                    double y = e.getSceneY();
                    for (Tile t : getNearbyTiles(x, y, 100)) {
                        attract(t, x, y);
                    }
                }
            }
        });
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                if (e.getCode().equals(KeyCode.SPACE)) {
                    tiles.clear();
                    generate();
                } else {
                    for(Tile t: tiles) {
                        t.dx -= 5;
                        t.dx += Math.random() * 10;
                        t.dy -= 5;
                        t.dy += Math.random() * 10;
                    }
                }
            }
        });
        generate();
        timer.start();
        primaryStage.setTitle("Happy Mother's Day!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    public void generate() {
//        HAppy Mother's Day!
        
//        give me an H!
        tiles.add(new Tile(100, 100));
        tiles.add(new Tile(100, 110));
        tiles.add(new Tile(100, 120));
        tiles.add(new Tile(100, 130));
        tiles.add(new Tile(100, 140));
        tiles.add(new Tile(110, 120));
        tiles.add(new Tile(120, 120));
        tiles.add(new Tile(130, 100));
        tiles.add(new Tile(130, 110));
        tiles.add(new Tile(130, 120));
        tiles.add(new Tile(130, 130));
        tiles.add(new Tile(130, 140));
        
//        give me an A!
        
        tiles.add(new Tile(150, 140));
        tiles.add(new Tile(150, 130));
        tiles.add(new Tile(150, 120));
        tiles.add(new Tile(150, 110));
        tiles.add(new Tile(160, 130));
        tiles.add(new Tile(160, 110));
        tiles.add(new Tile(170, 110));
        tiles.add(new Tile(170, 130));
        tiles.add(new Tile(180, 110));
        tiles.add(new Tile(180, 120));
        tiles.add(new Tile(180, 130));
        tiles.add(new Tile(180, 140));
        
//        give me a P!
        
        tiles.add(new Tile(200, 140));
        tiles.add(new Tile(200, 130));
        tiles.add(new Tile(200, 120));
        tiles.add(new Tile(200, 110));
        tiles.add(new Tile(200, 100));
        tiles.add(new Tile(210, 100));
        tiles.add(new Tile(210, 130));
        tiles.add(new Tile(220, 100));
        tiles.add(new Tile(220, 130));
        tiles.add(new Tile(230, 100));
        tiles.add(new Tile(230, 130));
        tiles.add(new Tile(240, 110));
        tiles.add(new Tile(240, 120));
        
//        give me a P!
        
        tiles.add(new Tile(260, 140));
        tiles.add(new Tile(260, 130));
        tiles.add(new Tile(260, 120));
        tiles.add(new Tile(260, 110));
        tiles.add(new Tile(260, 100));
        tiles.add(new Tile(270, 100));
        tiles.add(new Tile(270, 130));
        tiles.add(new Tile(280, 100));
        tiles.add(new Tile(280, 130));
        tiles.add(new Tile(290, 100));
        tiles.add(new Tile(290, 130));
        tiles.add(new Tile(300, 110));
        tiles.add(new Tile(300, 120));
        
//        give me a Y!
        
        tiles.add(new Tile(320, 100));
        tiles.add(new Tile(330, 110));
        tiles.add(new Tile(340, 120));
        tiles.add(new Tile(340, 130));
        tiles.add(new Tile(340, 140));
        tiles.add(new Tile(350, 110));
        tiles.add(new Tile(360, 100));
        
//        give me an M!
        
        tiles.add(new Tile(100, 160));
        tiles.add(new Tile(100, 170));
        tiles.add(new Tile(100, 180));
        tiles.add(new Tile(100, 190));
        tiles.add(new Tile(100, 200));
        tiles.add(new Tile(110, 170));
        tiles.add(new Tile(120, 180));
        tiles.add(new Tile(130, 170));
        tiles.add(new Tile(140, 160));
        tiles.add(new Tile(140, 170));
        tiles.add(new Tile(140, 180));
        tiles.add(new Tile(140, 190));
        tiles.add(new Tile(140, 200));
        
//        give me an O!
        
        tiles.add(new Tile(160, 170));
        tiles.add(new Tile(160, 180));
        tiles.add(new Tile(160, 190));
        tiles.add(new Tile(170, 160));
        tiles.add(new Tile(170, 200));
        tiles.add(new Tile(180, 160));
        tiles.add(new Tile(180, 200));
        tiles.add(new Tile(190, 160));
        tiles.add(new Tile(190, 200));
        tiles.add(new Tile(200, 170));
        tiles.add(new Tile(200, 180));
        tiles.add(new Tile(200, 190));
        
//        give me a T!
        
        tiles.add(new Tile(220, 160));
        tiles.add(new Tile(230, 160));
        tiles.add(new Tile(240, 160));
        tiles.add(new Tile(240, 170));
        tiles.add(new Tile(240, 180));
        tiles.add(new Tile(240, 190));
        tiles.add(new Tile(240, 200));
        tiles.add(new Tile(250, 160));
        tiles.add(new Tile(260, 160));
        
//        give me an H!
        
        tiles.add(new Tile(280, 160));
        tiles.add(new Tile(280, 170));
        tiles.add(new Tile(280, 180));
        tiles.add(new Tile(280, 190));
        tiles.add(new Tile(280, 200));
        tiles.add(new Tile(290, 180));
        tiles.add(new Tile(300, 180));
        tiles.add(new Tile(310, 160));
        tiles.add(new Tile(310, 170));
        tiles.add(new Tile(310, 180));
        tiles.add(new Tile(310, 190));
        tiles.add(new Tile(310, 200));
        
//        give me an E!
        
        tiles.add(new Tile(330, 160));
        tiles.add(new Tile(330, 170));
        tiles.add(new Tile(330, 180));
        tiles.add(new Tile(330, 190));
        tiles.add(new Tile(330, 200));
        tiles.add(new Tile(340, 160));
        tiles.add(new Tile(340, 180));
        tiles.add(new Tile(340, 200));
        tiles.add(new Tile(350, 160));
        tiles.add(new Tile(350, 200));
        
//        give me an R!
        
        tiles.add(new Tile(370, 200));
        tiles.add(new Tile(370, 190));
        tiles.add(new Tile(370, 180));
        tiles.add(new Tile(370, 170));
        tiles.add(new Tile(370, 160));
        tiles.add(new Tile(380, 160));
        tiles.add(new Tile(380, 190));
        tiles.add(new Tile(390, 160));
        tiles.add(new Tile(390, 190));
        tiles.add(new Tile(400, 160));
        tiles.add(new Tile(400, 190));
        tiles.add(new Tile(410, 170));
        tiles.add(new Tile(410, 180));
        tiles.add(new Tile(410, 200));
        
//        give me an '!
        
        tiles.add(new Tile(430, 160));
        tiles.add(new Tile(430, 170));
        
//        give me an S!
        
        tiles.add(new Tile(450, 170));
        tiles.add(new Tile(460, 160));
        tiles.add(new Tile(460, 180));
        tiles.add(new Tile(460, 200));
        tiles.add(new Tile(470, 160));
        tiles.add(new Tile(470, 180));
        tiles.add(new Tile(470, 200));
        tiles.add(new Tile(480, 160));
        tiles.add(new Tile(480, 180));
        tiles.add(new Tile(480, 200));
        tiles.add(new Tile(480, 190));
        tiles.add(new Tile(490, 190));
        
//        give me a D!
        
        tiles.add(new Tile(100, 220));
        tiles.add(new Tile(100, 230));
        tiles.add(new Tile(100, 240));
        tiles.add(new Tile(100, 250));
        tiles.add(new Tile(100, 260));
        tiles.add(new Tile(110, 220));
        tiles.add(new Tile(110, 260));
        tiles.add(new Tile(120, 220));
        tiles.add(new Tile(120, 260));
        tiles.add(new Tile(130, 220));
        tiles.add(new Tile(130, 260));
        tiles.add(new Tile(140, 230));
        tiles.add(new Tile(140, 240));
        tiles.add(new Tile(140, 250));
        
//        give me an A!
        
        tiles.add(new Tile(160, 260));
        tiles.add(new Tile(160, 250));
        tiles.add(new Tile(160, 240));
        tiles.add(new Tile(160, 230));
        tiles.add(new Tile(170, 250));
        tiles.add(new Tile(170, 230));
        tiles.add(new Tile(180, 230));
        tiles.add(new Tile(180, 250));
        tiles.add(new Tile(190, 230));
        tiles.add(new Tile(190, 240));
        tiles.add(new Tile(190, 250));
        tiles.add(new Tile(190, 260));
        
//        give me a Y!
        
        tiles.add(new Tile(210, 220));
        tiles.add(new Tile(220, 230));
        tiles.add(new Tile(230, 240));
        tiles.add(new Tile(230, 250));
        tiles.add(new Tile(230, 260));
        tiles.add(new Tile(240, 230));
        tiles.add(new Tile(250, 220));
        
//        give me an !!!!
        
        tiles.add(new Tile(270, 220));
        tiles.add(new Tile(270, 230));
        tiles.add(new Tile(270, 240));
        tiles.add(new Tile(270, 260));
        
        tiles.add(new Tile(290, 220));
        tiles.add(new Tile(290, 230));
        tiles.add(new Tile(290, 240));
        tiles.add(new Tile(290, 260));
        
        tiles.add(new Tile(310, 220));
        tiles.add(new Tile(310, 230));
        tiles.add(new Tile(310, 240));
        tiles.add(new Tile(310, 260));
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static ArrayList<Tile> getNearbyTiles(double x, double y, int range) {
        ArrayList<Tile> ret = new ArrayList<>();
        for (Tile t : tiles) {
            if (Math.hypot(x - t.x, y - t.y) < range) {
                ret.add(t);
            }
        }
        return ret;
    }

    public void frame() {
        GraphicsContext gc = can.getGraphicsContext2D();
        gc.clearRect(0, 0, 800, 600);
        for (Tile t : tiles) {
            t.move();
            t.drawSelf(can.getGraphicsContext2D());
        }
        root.getChildren().clear();
        root.getChildren().add(can);
    }

    public void attract(Tile t, double x, double y) {
        double dist = Math.hypot(x - t.x, y - t.y);
        double force = dist / 10;
        t.dx = force * ((x - t.x) / dist);
        t.dy = force * ((y - t.y) / dist);
    }

    public void repel(Tile t, double x, double y) {
        double dist = Math.hypot(x - t.x, y - t.y);
        double force = 40 / dist;
        force = force<5?5:force;
        t.dx = -force * ((x - t.x) / dist);
        t.dy = -force * ((y - t.y) / dist);
    }

    public class Frame extends AnimationTimer {

        @Override
        public void handle(long l) {
            frame();
        }

    }
}
