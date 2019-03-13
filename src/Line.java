import processing.core.PVector;
import java.util.ArrayList;

public class Line{
    private PVector start,end;
    public Line(PVector start,PVector end){
        this.start = start;
        this.end = end;
    }

    public void display(){
        CantorSetApp app = CantorSetApp.getApp();
        app.stroke(0);
        app.line(start.x, start.y, end.x, end.y);
    }

}
