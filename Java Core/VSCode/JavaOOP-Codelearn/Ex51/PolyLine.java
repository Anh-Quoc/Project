package Ex51;

import java.util.ArrayList;
import java.util.List;

class PolyLine {
    private List<Point> points;
    
    public PolyLine(){        
        points = new ArrayList<>();
    }
    public PolyLine(List<Point> points){
        this.points = points;
    }
    public void appendPoint(Point point){
        points.add(point);
    }
    public void appendPoint(int x , int y){
        Point point = new Point(x , y);
        points.add(point);
    }
    public double getLength(){
        double length = 0;
		for (int i = 0; i < points.size() - 1; i++) {
			int x1 = points.get(i).getX();
			int y1 = points.get(i).getY();
			int x2 = points.get(i + 1).getX();
			int y2 = points.get(i + 1).getY();
			double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			length += distance;
		}
		return length;

    }
}