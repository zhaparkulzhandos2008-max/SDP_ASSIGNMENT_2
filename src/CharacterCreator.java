public abstract class CharacterCreator {

    // Factory Method: subclasses decide which concrete Character is created.
    public abstract Character createCharacter();

    // Meaningful common logic that works with the Product.
    public void prepareCharacter() {
        Character character = createCharacter();
        System.out.println("Preparing character: " + character.getName());
        character.attack();
    }
}
