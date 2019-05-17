import java.util.Random;

public class Dice {
    static int roll(int _maxNumber){
        int result;
        Random random = new Random();

        result = random.nextInt(_maxNumber) + 1;


        System.out.println("주사위 결과: " + result);
        return result;
    }

    static int roll(int _times, int _maxNumber){
        int result = 0;

        for(int i = 0; i < _times; i++){
            result += roll(_maxNumber);
        }

        return result;
    }
}