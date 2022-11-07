package Ex1;

public class Rectangle {
    private long Length;
    private long Width;

    public Rectangle(long length , long width) {
        setLength(length);
        setWidth(width);
    }

    public String getArea(){
        return String.valueOf(this.Length * this.Width);
    }

    public String getPerimeter(){
        return String.valueOf((this.Length + this.Width) * 2);
    }

    public long getLength(){
        return this.Length;
    }

    public long getWidth(){
        return this.Width;
    }

    public String toString(){
        return String.valueOf(getLength()) +" "+ String.valueOf(getWidth()) +" "+ getArea() +" "+ getPerimeter();
    }

    public void setLength(long length){
        this.Length = length;
    }
    
    public void setWidth(long width){
        this.Width = width;
    }
}