public class Main {
    public static void main(String[] args) {
        String family = args.length > 0 ? args[0] : "fantasy";

        GameApplication game = new GameApplication();
        game.configureGame(family);
        game.startGame();
    }
}
