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

    public static void main(String[] args) {
        name="Ragnar";
        currentHealth=85;
        maxHealth=100;
        level=1;
        exp=0;
        gold=100.00;
        isAlive=true;
        type='w';
        items= new String[]{"sword", "sheild", "potion"};
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: "+ name);
        System.out.println("Class: "+ type);
        System.out.println("Level: " +level);
        System.out.println("Health: " + currentHealth+ "/" + maxHealth);
        System.out.println("xp: " + exp);
        System.out.println("Gold: "+ gold);
        System.out.println("Alive: "+ isAlive);
        System.out.println("\n\n\n"+"Inventory:" + items.length+":");
        System.out.println("- "+items[0]);
        System.out.println("- "+items[1]);
        System.out.println("- "+items[2]);
    }
}