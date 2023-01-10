package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Kugel (einen Kreis), der in eine Schlange eingefügt werden soll. Dabei muss jeder QueueBall immer
 * seinen Vorgänger kennen, damit er zu ihm Abstand halten kann.
 */
public class Schneeflocke extends GraphicalObject {

    /**
     * Erzeugt einen neuen QueueBall
     * @param x Startposition x
     * @param y Startposition y
     */
    public Schneeflocke(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void draw(DrawTool drawTool) {
    }
    }