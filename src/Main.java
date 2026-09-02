public class Main {
    static String name;
    static int currentHealth;
    static int maxHealth;
    static int level;
    static int exp;
    static double gold;
    static boolean isAlive;
    static char type;
    static String[] items;
    static int incomingDamage;

    static void printCharacterSheet(){
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: "+ name);
        System.out.println("Class: "+ type);
        System.out.println("Level: " +level);
        System.out.println("Health: " + currentHealth+ "/" + maxHealth);
        System.out.println("xp: " + exp);
        System.out.println("Gold: "+ gold);
        System.out.println("Alive: "+ isAlive);
        System.out.println("\n\n\n"+"Inventory:" + items.length+":");
    }

    static void takeDamage(int amount){
        currentHealth=currentHealth-amount;
        if (currentHealth<=0){
            isAlive=false;
        }
    }
    static void heal(int amount){
        if (currentHealth+amount>=maxHealth){
            currentHealth=maxHealth;
        }else {
            currentHealth=currentHealth+amount;
        }
    }
    void addGold(double amount){
        gold=gold+amount;
    }
    static boolean removeGold(double amount){
        if (gold>=amount){
        gold=gold-amount;
        return true;
        }else{
            return false;
        }
    }
    static void addXP(int amount){
        exp=exp+amount;
    }

    void levelUp(){
        level=level+1;
        maxHealth=maxHealth+5;
        exp=0;
    }

    static boolean isHealthCritical(){
        if (currentHealth<=maxHealth*0.25){
            return true;
        }else {
            return false;
        }
    }

    boolean isAlive(){
        if (currentHealth>0){
            return true;
        }else {
            return false;
        }
    }

    static double getHealthPercentage(){
        int healthPercentage;
        healthPercentage=currentHealth/(maxHealth/100);
        return healthPercentage;
    }

    void printInventory(){
        for (int i=0;i<items.length;i++){
            System.out.println("- "+ items[i]);
        }
    }
    public static void main(String[] args) {
        name="Ragnar";
        currentHealth=85;
        maxHealth=100;
        level=1;
        exp=0;
        gold=100.00;
        isAlive=true;
        type='w';
        incomingDamage=30;
        items= new String[]{"sword", "sheild", "potion"};
        printCharacterSheet();

        takeDamage(30);
        heal(20);
        addXP(500);

        if (removeGold(100.0)) {
            System.out.println("Bought a potion!");
        } else {
            System.out.println("Not enough gold!");
        }

        System.out.println("Health: " + getHealthPercentage() + "%");

        if (isHealthCritical()) {
            System.out.println("WARNING: Find a healer!");
        }

        printCharacterSheet();





    }
}