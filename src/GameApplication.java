public class GameApplication {
 protected final Character character; protected final Weapon weapon; protected final Enemy enemy;
 public GameApplication(GameFactory factory){character=factory.createCharacter();weapon=factory.createWeapon();enemy=factory.createEnemy();}
 public Character getCharacter(){return character;} public Weapon getWeapon(){return weapon;} public Enemy getEnemy(){return enemy;}
 public String prepareBattle(){return character.getName()+" equips "+weapon.getName();}
 public String battle(){character.attack();weapon.use();enemy.fight();return character.getName()+" fights "+enemy.getName()+" using "+weapon.getName();}
 public String missionSummary(){return "Mission: "+character.getName()+" vs "+enemy.getName()+" | weapon: "+weapon.getName();}
 public void startGame(){System.out.println(prepareBattle());System.out.println(battle());System.out.println(missionSummary());}
}
