/*
 * This class determines and sets plane speed
 *
 * @author  Rodas Nega
 * @version 1.0
 * @since   2022-10-23
*/

/**
*  Make an airplane speed class.
*/

public class Airplane {
    /**
     * Declaring variable for airplane speed.
    */
    private int speed;

    /**
     * The getter method for plane speed.
     *
     * @return the plane speed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * The setter method for the plane speed.
     *
     * @param userSpeed the speed determined by the user
     * @return the new speed
    */
    public int setSpeed(int userSpeed) {
        this.speed = userSpeed;
    }
}

