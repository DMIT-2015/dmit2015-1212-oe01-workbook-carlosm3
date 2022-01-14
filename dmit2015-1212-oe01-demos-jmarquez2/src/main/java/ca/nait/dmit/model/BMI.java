package ca.nait.dmit.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BMI {

    private double weight;
    private double height;

    public double bmi() {
        return 703 * weight / Math.pow(height, 2);
    }

    public String bmiCategory() {
        double bmi = bmi();
        String category;
        if (bmi < 18.5) {
            category = "underweight";
        } else if (bmi < 24.9) {
            category = "normal";
        } else if (bmi < 29.9) {
            category = "overweight";
        } else {
            category = "obese";
        }
        return category;
    }
}
