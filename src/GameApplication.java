public class GameApplication {
 protected final Character character; protected final Weapon weapon; protected final Enemy enemy;
 public GameApplication(GameFactory factory){character=factory.createCharacter();weapon=factory.createWeapon();enemy=factory.createEnemy();}
 public Character getCharacter(){return character;} public Weapon getWeapon(){return weapon;} public Enemy getEnemy(){return enemy;}
 public void startGame(){System.out.println(character.getName()+" | "+weapon.getName()+" | "+enemy.getName());}
}
