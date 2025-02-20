package niveles;

public class LevelDesign {
    private String levelName;
    private int difficulty;
    private String environment;

    public LevelDesign(String levelName, int difficulty, String environment) {
        this.levelName = levelName;
        this.difficulty = difficulty;
        this.environment = environment;
    }

    public void displayLevelInfo() {
        System.out.println("Nivel: " + levelName);
        System.out.println("Dificultad: " + difficulty);
        System.out.println("Entorno: " + environment);
    }

    public static void main(String[] args) {
        LevelDesign level1 = new LevelDesign("Commit Caverns", 3, "Subterráneo");
        level1.displayLevelInfo();
    }
}
