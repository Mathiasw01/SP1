public class Main {

    public static void main(String[] args) {

        Character hero = new Character("Ragnar", 'W');
        Character enemy = new Character("Goblin", 'R');

        hero.printCharacterSheet();
        enemy.printCharacterSheet();

        // Combat!
        hero.attack(enemy);
        enemy.attack(hero);

        hero.combatCharacterSheet();
        enemy.combatCharacterSheet();

    }
}