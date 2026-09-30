public class CyberpunkFactory implements GameFactory {
    @Override
    public Character createCharacter() {
        return new CyberpunkCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new CyberpunkWeapon();
    }

    @Override
    public Enemy createEnemy() {
        return new CyberpunkEnemy();
    }
}
