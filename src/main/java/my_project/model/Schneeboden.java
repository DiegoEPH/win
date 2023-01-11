package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Schneeboden extends GraphicalObject {
    public Schneeboden(double x, double y){
        this.x = x;
        this.y =y;
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(Color.white);
        drawTool.drawFilledRectangle(x, y, 900, 250);
    }
}
