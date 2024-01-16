package cpsc2150.cars;

/**
 * A simple class to contain information about a car.
 *
 * @invariant 1900 <= year <= Current year + 1 AND 0 <= miles AND
 *            [make is valid] AND [model is valid] AND [color is valid]
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private int miles;
    private String color;

    /**
     * This constructor creates a new car.
     *
     * @param mk make of the car
     * @param md model of the car
     * @param y  year of the car
     * @param ml miles of the car
     * @param c  color of the car
     *
     * @pre 1900 <= y <= Current Year + 1 AND 0 <= ml AND
     *      [mk is valid make] AND [md is valid model] AND [color is valid]
     * @post make = mk AND model = md AND year = y AND miles = ml AND color = c
     */
    public Car(String mk, String md, int y, int ml, String c) {
        make = mk;
        model = md;
        year = y;
        miles = ml;
        color = c;
    }

    /**
     * This method overrides the default implementation of {@code toString} to provide
     * a string representation of the object.
     *
     * @return a string representation of the car
     *
     * @post toString = "A [color], [year], [make] [model] with [miles] miles on it" AND
     *       color = #color AND year = #year AND make = #make AND model = #model AND miles = #miles
     */
    @Override
    public String toString() {
        String s = "A " + color + ", " + year + ", " + make + " " + model + " with " + miles + " miles on it";
        return s;
    }
}