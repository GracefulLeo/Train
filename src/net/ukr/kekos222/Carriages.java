package net.ukr.kekos222;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Олег on 16.03.2017.
 */
public class Carriages implements Train {

    private final int size;
    private final List<Carriage> carriages = new ArrayList();
    private int number;

    public Carriages(){
        size = new Random().nextInt(11) + 1;
        for(int i = 0; i < size; i += 1){
            carriages.add(new Carriage());
        }
        number = 0;
    }

    @Override
    public void turnLeft() {
        if (number == 0){
            number = carriages.size() - 1;
        } else {
            number -= 1;
        }

    }

    @Override
    public void turnRight() {
        if (number == carriages.size() - 1){
            number = 0;
        } else {
            number += 1;
        }
    }

    @Override
    public void lightOn() {
        carriages.get(number).setLight(true);
    }

    @Override
    public void lightOff() {
        carriages.get(number).setLight(false);
    }

    @Override
    public boolean isLightOn() {
       return carriages.get(number).isLight();
    }

    @Override
    public boolean isLength(int expectedLength) {
        boolean result = false;

            if (size == expectedLength){
                result = true;
            }

        return result;
    }
}
