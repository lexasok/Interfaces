
public class Enemy implements Character {

    public String weapon = "Knife";

    public Enemy() {

    }

    public void attack() {
        System.out.println("Enemy attacks you!");
    }

    public void heal() {
        System.out.println("Enemy heals himself !");
    }

    public void weaponDraw() {
        System.out.println("Enemy draw out weapon!");
    }
}
