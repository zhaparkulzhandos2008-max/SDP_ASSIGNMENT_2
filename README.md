# Assignment 2 — Part B: Factory Method

Part B refactors Character creation using the Factory Method pattern.

## Structure

Product:
- Character

Concrete Products:
- FantasyCharacter
- CyberpunkCharacter
- HorrorCharacter

Creator:
- CharacterCreator

Concrete Creators:
- FantasyCharacterCreator
- CyberpunkCharacterCreator
- HorrorCharacterCreator

`createCharacter()` is the Factory Method. Each concrete creator decides which
Character implementation to instantiate.

`prepareCharacter()` is common business logic in the Creator. It obtains the
Character through the Factory Method and then works with the Character abstraction.

## Why this is Factory Method

Creation is defined as an overridable method in the abstract `CharacterCreator`.
Concrete creator subclasses override that method and choose the concrete Product.
It is not a static factory because object creation is selected through polymorphism
and inheritance.

## Compile and Run

    javac -d out src/*.java
    java -cp out Main fantasy
    java -cp out Main cyberpunk
    java -cp out Main horror

## Suggested Git Commit

    Introduce Factory Method for character creation
