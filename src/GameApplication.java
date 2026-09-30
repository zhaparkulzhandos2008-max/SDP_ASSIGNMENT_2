public class GameApplication {

    private Character character;
    private Weapon weapon;
    private Enemy enemy;

    public void configureGame(String family) {

        // Part A intentionally creates concrete objects directly.
        // This will be refactored in later parts of the assignment.
        if (family.equalsIgnoreCase("fantasy")) {
            character = new FantasyCharacter();
            weapon = new FantasyWeapon();
            enemy = new FantasyEnemy();

        } else if (family.equalsIgnoreCase("cyberpunk")) {
            character = new CyberpunkCharacter();
            weapon = new CyberpunkWeapon();
            enemy = new CyberpunkEnemy();

        } else if (family.equalsIgnoreCase("horror")) {
            character = new HorrorCharacter();
            weapon = new HorrorWeapon();
            enemy = new HorrorEnemy();

        } else {
            throw new IllegalArgumentException("Unknown game family: " + family);
        }
    }

    public void startGame() {
        System.out.println("=== GAME STARTED ===");
        System.out.println("Character: " + character.getName());
        System.out.println("Weapon: " + weapon.getName());
        System.out.println("Enemy: " + enemy.getName());

        character.attack();
        weapon.use();
        enemy.fight();
    }
}
