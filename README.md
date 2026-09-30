# Assignment 2 — Part A: Start Without Factories

## Domain
This project uses a game system with three product types:

- Character
- Weapon
- Enemy

There are three original product families:

- Fantasy
- Cyberpunk
- Horror

Therefore, the initial system contains 9 concrete products.

## Purpose of Part A
This version intentionally does NOT use Factory Method or Abstract Factory.
`GameApplication` directly creates concrete objects with `new` and selects
a family using an `if / else if` chain.

This implementation is intentionally difficult to extend. It will be
refactored in later parts of Assignment 2.

## Design Problems

### 1. Client depends on concrete classes
`GameApplication` directly knows classes such as `FantasyCharacter`,
`CyberpunkWeapon`, and `HorrorEnemy`. The client is therefore tightly
coupled to concrete implementations.

### 2. Large conditional creation logic
All object creation is located inside the `if / else if` chain in
`configureGame()`. As more families are added, this method becomes larger
and harder to maintain.

### 3. Adding a family requires modifying existing client code
To add another family, for example Sci-Fi, `GameApplication` must be edited
and another condition must be added. The existing client is therefore not
closed for modification.

### Additional problem: incompatible products can be combined
Because the client manually creates every object, a programmer can
accidentally combine products from different families, for example:

    character = new FantasyCharacter();
    weapon = new CyberpunkWeapon();
    enemy = new HorrorEnemy();

Nothing in the Part A architecture prevents this combination.

## Compile and Run

From the project folder:

    javac -d out src/*.java
    java -cp out Main fantasy

Other examples:

    java -cp out Main cyberpunk
    java -cp out Main horror

## Suggested Git Commit

    Initial domain model without factories

This Part A version should remain in Git history before refactoring it
with Factory Method and Abstract Factory.
