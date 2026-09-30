public class AssignmentTests {
 static int passed=0,failed=0;
 static void check(String n,boolean c){if(c){passed++;System.out.println("PASS "+n);}else{failed++;System.out.println("FAIL "+n);}}
 static void bad(String n,Runnable r){try{r.run();check(n,false);}catch(IllegalArgumentException e){check(n,true);}}
 public static void main(String[] a){
  GameApplication f=new GameApplication(new FantasyFactory()),c=new GameApplication(new CyberpunkFactory()),
   h=new GameApplication(new HorrorFactory()),s=new GameApplication(new SciFiFactory());
  check("1",f.getCharacter() instanceof FantasyCharacter); check("2",f.getWeapon() instanceof FantasyWeapon); check("3",f.getEnemy() instanceof FantasyEnemy);
  check("4",c.getCharacter() instanceof CyberpunkCharacter); check("5",c.getWeapon() instanceof CyberpunkWeapon); check("6",c.getEnemy() instanceof CyberpunkEnemy);
  check("7",h.getCharacter() instanceof HorrorCharacter); check("8",h.getWeapon() instanceof HorrorWeapon); check("9",h.getEnemy() instanceof HorrorEnemy);
  check("10",s.getCharacter() instanceof SciFiCharacter); check("11",s.getWeapon() instanceof SciFiWeapon); check("12",s.getEnemy() instanceof SciFiEnemy);
  check("13",FactorySelector.select("fantasy") instanceof FantasyFactory); check("14",FactorySelector.select("scifi") instanceof SciFiFactory);
  check("15",f.getCharacter() instanceof FantasyCharacter && f.getWeapon() instanceof FantasyWeapon && f.getEnemy() instanceof FantasyEnemy);
  check("16",f.prepareBattle().contains("Magic Sword")); check("17",c.battle().contains("Combat Drone")); check("18",h.missionSummary().contains("Old Axe"));
  bad("19",()->FactorySelector.select("unknown")); bad("20",()->FactorySelector.select(""));
  GameFactory factory=new SciFiFactory(); GameApplication abstraction=new GameApplication(factory);
  check("21",abstraction.getCharacter() instanceof Character && abstraction.getWeapon() instanceof Weapon && abstraction.getEnemy() instanceof Enemy);
  System.out.println("Passed: "+passed+", Failed: "+failed); if(failed>0) throw new AssertionError("Tests failed");
 }
}
