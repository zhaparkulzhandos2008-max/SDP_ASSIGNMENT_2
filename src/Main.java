public class Main {
    public static void main(String[] args) {
        String family = args.length > 0 ? args[0] : "fantasy";

        GameFactory factory;

        if (family.equalsIgnoreCase("fantasy")) {
            factory = new FantasyFactory();
        } else if (family.equalsIgnoreCase("cyberpunk")) {
            factory = new CyberpunkFactory();
        } else if (family.equalsIgnoreCase("horror")) {
            factory = new HorrorFactory();
        } else {
            throw new IllegalArgumentException("Unknown game family: " + family);
        }

        GameApplication game = new GameApplication(factory);
        game.startGame();
    }
}
