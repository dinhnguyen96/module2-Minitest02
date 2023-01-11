package bai01;

public class Trapezoid {

    private double bottomEdgeMin;
    private double bottomEdgeMax;
    private double height;
    private double oneSide;
    private double twoSide;

    public Trapezoid(double bottomEdgeMin, double bottomEdgeMax, double height, double oneSide, double twoSide) {
        this.bottomEdgeMin = bottomEdgeMin;
        this.bottomEdgeMax = bottomEdgeMax;
        this.height = height;
        this.oneSide = oneSide;
        this.twoSide = twoSide;
    }

    public double getBottomEdgeMin() {
        return this.bottomEdgeMin;
    }

    public void setBottomEdgeMin(double bottomEdgeMin) {
        this.bottomEdgeMin = bottomEdgeMin;
    }

    public double getBottomEdgeMax() {
        return this.bottomEdgeMax;
    }

    public void setBottomEdgeMax(double bottomEdgeMax) {
        this.bottomEdgeMax = bottomEdgeMax;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getOneSide() {
        return this.oneSide;
    }

    public void setOneSide(double oneSide) {
        this.oneSide = oneSide;
    }

    public double getTwoSide() {
        return this.twoSide;
    }

    public void setTwoSide(double twoSide) {
        this.twoSide = twoSide;
    }

    public double getPerimeter()
    {
       return bottomEdgeMax+bottomEdgeMin+oneSide+twoSide;
    }
    public double getArea()
    {
        return ((bottomEdgeMax+bottomEdgeMin)*height)/2;
    }

}
