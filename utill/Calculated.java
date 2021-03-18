package utill;

import model.DailyPortion;
import model.Pet;

public interface Calculated {

    double calculate(Pet pet);
    double calculateWeightProduct(double percent, DailyPortion dailyPortion);
}
