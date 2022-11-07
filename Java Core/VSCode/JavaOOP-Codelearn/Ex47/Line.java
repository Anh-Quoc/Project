package Ex47;

class Line {
    private Point begin;
    private Point end;
    
    public Line(Point begin , Point end){
        setBegin(begin);
        setEnd(end);
    }
    public Line(int x1 , int y1 , int x2 , int y2){
        Point begin = new Point(x1, y1);
        Point end = new Point(x2, y2);
        setBegin(begin);
        setEnd(end);
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }

    public double getLength(){
        return Math.sqrt((begin.getX() - end.getX()) * (begin.getX() - end.getX()) + (begin.getY() - end.getY()) * (begin.getY() - end.getY()));
    }
}