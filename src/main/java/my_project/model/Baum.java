package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Kugel (einen Kreis), der in eine Schlange eingefügt werden soll. Dabei muss jeder QueueBall immer
 * seinen Vorgänger kennen, damit er zu ihm Abstand halten kann.
 */
public class Baum extends GraphicalObject {

    /**
     * Erzeugt einen neuen QueueBall
     * @param x Startposition x
     * @param y Startposition y
     */
    public Baum(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(75, 35, 0));
        drawTool.drawFilledRectangle(x,y,50,50);
        drawTool.setCurrentColor(new Color(0, 69, 7));
        drawTool.drawFilledTriangle(25, 430, 225, 430, 125, 320);
    }
}