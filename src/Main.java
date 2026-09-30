public class Main {
    public static void main(String[] args) {
        String family = args.length > 0 ? args[0] : "fantasy";

        CharacterCreator creator;

        if (family.equalsIgnoreCase("fantasy")) {
            creator = new FantasyCharacterCreator();
        } else if (family.equalsIgnoreCase("cyberpunk")) {
            creator = new CyberpunkCharacterCreator();
        } else if (family.equalsIgnoreCase("horror")) {
            creator = new HorrorCharacterCreator();
        } else {
            throw new IllegalArgumentException("Unknown game family: " + family);
        }

        creator.prepareCharacter();
    }
}
