public abstract class CharacterCreator {
    public abstract Character createCharacter();

    public Character prepareCharacter() {
        Character character = createCharacter();
        System.out.println("Preparing character: " + character.getName());
        character.attack();
        return character;
    }
}
