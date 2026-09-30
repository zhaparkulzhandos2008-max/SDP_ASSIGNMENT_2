# Assignment 2 - Part C: Abstract Factory

Part C introduces an Abstract Factory for the three related product types:
Character, Weapon, and Enemy.

Abstract Factory:
- GameFactory

Concrete Factories:
- FantasyFactory
- CyberpunkFactory
- HorrorFactory

Each concrete factory creates one complete product family.

GameApplication now depends on GameFactory and product interfaces instead of
directly creating concrete Character, Weapon, and Enemy implementations.

Part B Factory Method classes are also kept in the project so the previous
pattern remains demonstrated.

Compile:
    javac -d out src/*.java

Run:
    java -cp out Main fantasy
    java -cp out Main cyberpunk
    java -cp out Main horror

Suggested commit:
    Introduce Abstract Factory for game families
