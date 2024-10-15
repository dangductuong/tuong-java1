public class Rectangle {
    private float length, width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return length *width;
    }
    public double getPerimeter (){
        return (length + width) *2;
    }

}
