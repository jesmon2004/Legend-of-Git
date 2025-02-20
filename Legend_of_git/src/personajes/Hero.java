/**
 * 
 */
package personajes;


public class Hero {
    private String name;
    private int level;
    private int power;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.power = 10;
    }

    public void levelUp() {
        level++;
        power += 5;
        System.out.println(name + " ha subido al nivel " + level + "! Poder: " + power);
    }

    public void attack(Villain villain) {
        System.out.println(name + " ataca a " + villain.getName() + "!");
        villain.takeDamage(power);
    }

    public String getName() {
        return name;
    }

}
