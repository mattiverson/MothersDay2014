/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mothersday;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author m1v3rpwn
 */
public class Tile {

    public double dx, dy;
    public double x, y;
    public Paint color;

    public Tile() {
        x = 0;
        y = 0;
        dx = 0;
        dy = 0;
        color = Math.random() < 0.5 ? new Color(0, 0, 1, 1) : new Color(0, 1, 0, 1);
    }

    public Tile(double x, double y) {
        this();
        this.x = x;
        this.y = y;
    }

    public void drawSelf(GraphicsContext gc) {
        Paint temp = gc.getFill();
        gc.setFill(color);
        gc.fillRect(x, y, 10, 10);
        gc.setFill(temp);
    }

    public void move() {
        x += dx;
        y += dy;
        if (x < 20 && dx < 0) {
            dx = -dx;
        }
        if (y < 20 && dy < 0) {
            dy = -dy;
        }
        if (x > 780 && dx > 0) {
            dx = -dx;
        }
        if (y > 580 && dy > 0) {
            dy = -dy;
        }
        dx *= 0.995;
        dy *= 0.995;
    }
}
