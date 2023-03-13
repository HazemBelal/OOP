import java.util.Date;

public class GeometricObject {
     private String color;
     private boolean filled;
     private java.util.Date dateCreated;


    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled()
    {
        return filled;

    }
    public  String toString()
    {
        return(color+","+"the object"+isFilled()+dateCreated.toString());
    }
}
