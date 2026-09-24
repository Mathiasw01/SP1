public class Warrior extends Character{

    Warrior(String name, char type) {
        super(name, type);
        setAttack(10);
        setMaxHealth(150);
        setCurrentHealth(150);
    }
}
