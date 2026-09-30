public class HorrorFactory implements GameFactory {
    @Override
    public Character createCharacter() {
        return new HorrorCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new HorrorWeapon();
    }

    @Override
    public Enemy createEnemy() {
        return new HorrorEnemy();
    }
}
