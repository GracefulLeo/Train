package net.ukr.kekos222;

/**
 * Created by Олег on 16.03.2017.
 */
public interface Train {

    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
