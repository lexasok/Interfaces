import java.util.Random;

public class Interfaces {

    public static Character summonCharacter() {
        Random random = new Random();
        if (Math.abs(random.nextInt()) % 2 == 0) {
             return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {

    }
}
