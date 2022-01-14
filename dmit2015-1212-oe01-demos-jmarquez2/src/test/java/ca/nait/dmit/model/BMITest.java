package ca.nait.dmit.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @Test
    void bmi() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(170);
        bmi1.setHeight(71);
        // Delta: results can be off by "delta"
        assertEquals(23.7, bmi1.bmi(), 0.05);
    }

    @Test
    void bmiCategory() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(170);
        bmi1.setHeight(71);
        assertEquals("normal", bmi1.bmiCategory());
    }
}