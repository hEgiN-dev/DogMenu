package model;

import java.util.Objects;

public class DailyPortion {

    private Double portion;

    public Double getPortion() {
        return portion;
    }

    public void setPortion(Double portion) {
      this.portion = portion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DailyPortion)) return false;
        DailyPortion that = (DailyPortion) o;
        return Objects.equals(getPortion(), that.getPortion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPortion());
    }

    @Override
    public String toString() {
        return "Дневная порция : " + portion +
                " грамм";
    }
}
