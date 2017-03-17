package net.ukr.kekos222;

/**
 * Created by Олег on 16.03.2017.
 */
public class FindAnswer {

    private int steps;
    private int length;

    public int findLength(Train train) {

        while(true) {
            steps++;

            if (train.isLightOn()){
                train.lightOff();
            }

            for(int i = 0; i < steps; i += 1) {
                train.turnRight();

                if (!train.isLightOn()) {
                    train.lightOn();
                    length = i + 1;
                    break;
                }
                length=i+1;
            }

            for(int i = 0; i < length; i += 1){
                train.turnLeft();
            }

            if(train.isLightOn()) return length;
        }
    }
}