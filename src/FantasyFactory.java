public class FantasyFactory implements GameFactory {
    @Override
    public Character createCharacter() {
        return new FantasyCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new FantasyWeapon();
    }

    @Override
    public Enemy createEnemy() {
        return new FantasyEnemy();
    }
}
