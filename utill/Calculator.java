package utill;

import model.DailyPortion;
import model.Pet;

public class Calculator implements Calculated {


    @Override
    public double calculate(Pet pet) {
        if (pet.getWeight() < 0 || pet.getPercentWeight() <= 0) {
            throw new IllegalArgumentException();
        }
        return pet.getWeight() * pet.getPercentWeight() / 100 * 1000;
    }

    @Override
    public double calculateWeightProduct(double percent, DailyPortion dailyPortion) {
        return percent * dailyPortion.getPortion()/100;
    }
}
