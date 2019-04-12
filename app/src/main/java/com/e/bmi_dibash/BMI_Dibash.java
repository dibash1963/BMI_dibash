package com.e.bmi_dibash;

public class BMI_Dibash {

    private double height, weight, bmi;

    public BMI_Dibash(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double Bmi() {
        bmi = weight / (height / 100 * height / 100);
        bmi = Math.round(bmi * 100) / 100.0D;
        return bmi;

    }

    public String Category() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi > 18.5 && bmi < 24.9) {
            return "Normal Weight";

        } else if (bmi > 25 && bmi < 29.9) {
            return "Overweight";

        }


        else

    {
        return "Obesity";

    }
}
}
