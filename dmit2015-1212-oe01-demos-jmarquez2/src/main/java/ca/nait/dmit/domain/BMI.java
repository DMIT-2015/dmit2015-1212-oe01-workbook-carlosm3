package ca.nait.dmit.domain;

public class BMI {

    // Fields
    private double weight;
    private double height;

    // Properties
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Constructors
    public BMI() {
        weight = 100;
        height = 60;
    }

    // Overloaded constructor
    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Methods
    public double bmi() {
        return 0;
    }

    public String bmiCategory() {
        return "";
    }
}
