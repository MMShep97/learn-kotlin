package academy.learnprogramming.javacode;

import academy.learnprogramming.challenges.challenge2.javacode.Bicycle;

public class RoadBike extends Bicycle {

    // In millimetres
    private int tireWidth;

    public RoadBike(int cadence,
                    int speed,
                    int gear,
                    int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

}
