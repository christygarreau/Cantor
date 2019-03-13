import processing.core.PApplet;
import processing.core.PVector;
import java.util.ArrayList;

public class CantorSetApp extends PApplet{
    private static CantorSetApp app;
    private int nextIndex;

    public static void main(String[] args){
        PApplet.main("CantorSetApp");
    }
    public void settings(){
        size(1000,500);
    }

    private ArrayList<Line> lines;
    public CantorSetApp(){
        nextIndex = 0;
        lines = new ArrayList<Line>();
        app = this;
    }

    public void setup(){
        background(255);
        stroke(0);
        frameRate(9);
        cantor(width/5, height/2, 500);
    }

    public void draw() {
        if (nextIndex < lines.size()) {
            lines.get(nextIndex).display();
            nextIndex++;
        }
    }

    private void cantor(float x1, float y1, float length) {
        if (length >= 1) {
            PVector start = new PVector(x1,y1);
            PVector end = new PVector(x1+length, y1);
            Line line = new Line(start,end);
            lines.add(line);
            y1 += 20;
            cantor(x1,y1,length/3);
            cantor(x1+length*2/3,y1,length/3);
        }
    }
    public static CantorSetApp getApp(){
        return app;
    }

}
