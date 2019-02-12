package model;


import sound.MidiSynth;

import java.awt.*;


public class Rectangle extends Shape {


    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        this((int) topLeft.getX(), (int) topLeft.getY(), 0, 0); //note to students: calls the other constructor!
        selected = false;
        this.midiSynth = midiSynth;
        instrument = 0;
        playLineCoord = 0;
        PLAYING_COLOR = new Color(230, 158, 60);
    }


    public Rectangle(int x, int y, int w, int h) {
        super(y, x, h, w);
    }

    // EFFECTS: return true if the given Point (x,y) is contained within the bounds of this Rectangle
    public boolean contains(Point point) {
        int point_x = point.x;
        int point_y = point.y;

        return containsX(point_x) && containsY(point_y);
    }

    @Override
    public void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    public void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }

}
