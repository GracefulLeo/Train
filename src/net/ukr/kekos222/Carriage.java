package net.ukr.kekos222;

import java.util.Random;

/**
 * Created by Олег on 16.03.2017.
 */
public class Carriage {

    private boolean light;

    public Carriage(){
        light = new Random().nextBoolean();
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
}
