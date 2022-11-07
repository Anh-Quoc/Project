package Ex48;

class Triangle {
    private Point vertice1;    
    private Point vertice2;    
    private Point vertice3;
    public Triangle(Point vertice1, Point vertice2 , Point vertice3){
        setvertice1(vertice1);
        setvertice2(vertice2);
        setvertice3(vertice3);
    }   
    public Triangle(int x1 , int y1 , int x2 , int y2 , int x3 , int y3){
        vertice1 = new Point(x1, y1);
        vertice2 = new Point(x2, y2);
        vertice3 = new Point(x3, y3);
        setvertice1(vertice1);
        setvertice2(vertice2);
        setvertice3(vertice3);
    } 
    public void setvertice1(Point vertice1) {
        this.vertice1 = vertice1;
    }
    public void setvertice2(Point vertice2) {
        this.vertice2 = vertice2;
    }
    public void setvertice3(Point vertice3) {
        this.vertice3 = vertice3;
    }
    public Point getvertice1() {
        return vertice1;
    }
    public Point getvertice2() {
        return vertice2;
    }
    public Point getvertice3() {
        return vertice3;
    }
    public double getPerimeter(){
        double AB = Math.sqrt((vertice1.getX() - vertice2.getX()) * (vertice1.getX() - vertice2.getX()) + (vertice1.getY() - vertice2.getY()) * (vertice1.getY() - vertice2.getY()));
        double AC = Math.sqrt((vertice1.getX() - vertice3.getX()) * (vertice1.getX() - vertice3.getX()) + (vertice1.getY() - vertice3.getY()) * (vertice1.getY() - vertice3.getY()));
        double CB = Math.sqrt((vertice3.getX() - vertice2.getX()) * (vertice3.getX() - vertice2.getX()) + (vertice3.getY() - vertice2.getY()) * (vertice3.getY() - vertice2.getY()));
        return AB + AC + CB;
    }
}