class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(){
        
    }
    public Rectangle(double length , double width){
        setLength(length);
        setWidth(width);
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + width) * 2;
    }
}