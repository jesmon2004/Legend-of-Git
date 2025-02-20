package personajes;

public class Villain {
    private String name;
    private int health;

    public Villain(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " recibe " + damage + " de daño! Salud restante: " + health);
        if (health <= 0) {
            System.out.println(name + " ha sido derrotado!");
        }
    }
    
    

    public String getName() {
        return name;
        
    }
}

