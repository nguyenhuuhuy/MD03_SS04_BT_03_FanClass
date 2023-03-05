package Xay_Dung_Lop_Fan;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FLAST = 3;
    private int sqeed = this.SLOW;
    private boolean isOn = false;
    private  double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFLAST() {
        return FLAST;
    }

    public int getSqeed() {
        return sqeed;
    }

    public void setSqeed(int sqeed) {
        this.sqeed = sqeed;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean on) {
        this.isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.isOn){
            return "Fan is ON{" +
                    "SLOW=" + SLOW +
                    ", MEDIUM=" + MEDIUM +
                    ", FLAST=" + FLAST +
                    ", sqeed=" + sqeed +
                    ", isOn=" + isOn +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan is OFF{" +
                    "SLOW=" + SLOW +
                    ", MEDIUM=" + MEDIUM +
                    ", FLAST=" + FLAST +
                    ", sqeed=" + sqeed +
                    ", isOn=" + isOn +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }
}
