public class FactorySelector {
 public static GameFactory select(String family){
  if(family.equalsIgnoreCase("fantasy")) return new FantasyFactory();
  if(family.equalsIgnoreCase("cyberpunk")) return new CyberpunkFactory();
  if(family.equalsIgnoreCase("horror")) return new HorrorFactory();
  if(family.equalsIgnoreCase("scifi")) return new SciFiFactory();
  throw new IllegalArgumentException("Unknown family: "+family);
 }
}
