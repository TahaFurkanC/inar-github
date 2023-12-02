package week_13.question_13_05;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObject() {

        dateCreated = new java.util.Date();
    }


    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {

        return color;
    }


    public void setColor(String color) {

        this.color = color;
    }


    public boolean isFilled() {

        return filled;
    }


    public void setFilled(boolean filled) {

        this.filled = filled;
    }

    public java.util.Date getDateCreated() {

        return dateCreated;
    }

    @Override
    public String toString() {
        return "it is created on " + dateCreated +
                "\ncolor: " + color +
                "\nis filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public int compareTo(GeometricObject object){
        if(this.getArea() < object.getArea()){
            return -1;
        } else if (this.getArea() == object.getArea()) {
            return 0;
        }
        else
            return 1;
    }
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2){
        return obj1.compareTo(obj2) == 1 ? obj1 : obj2;
    }
}
