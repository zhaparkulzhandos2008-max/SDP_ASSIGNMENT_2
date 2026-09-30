public class GameApplication {
    private final Character character;
    private final Weapon weapon;
    private final Enemy enemy;

    public GameApplication(GameFactory factory) {
        character = factory.createCharacter();
        weapon = factory.createWeapon();
        enemy = factory.createEnemy();
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
