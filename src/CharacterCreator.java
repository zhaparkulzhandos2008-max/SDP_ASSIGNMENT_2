public abstract class CharacterCreator { public abstract Character createCharacter(); public Character prepareCharacter(){ Character c=createCharacter(); c.attack(); return c; } }
