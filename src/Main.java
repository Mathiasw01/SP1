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
        if (currentHealth<=0){
            isAlive=false;
        }
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: "+ name);
        System.out.println("Class: "+ type);
        System.out.println("Level: " +level);
        System.out.println("Health: " + currentHealth+ "/" + maxHealth);
        System.out.println("xp: " + exp);
        System.out.println("Gold: "+ gold);
        System.out.println("Alive: "+ isAlive);
        System.out.println("\n\n\n"+"Inventory:" + items.length+":");
        for (int i=0;i<items.length;i++){
            System.out.println("- "+ items[i]);
        }
        System.out.println("\n\n===System===");
        if (currentHealth<maxHealth*0.25){
            System.out.println("Critical Warning");
        }
        if (exp>=1000*level){
            System.out.println("Ready to level up");
        }

        System.out.println("\n\n===Combar===");
        System.out.println(name+" takes " + incomingDamage+ " damage!");
        System.out.println("Healt: " + currentHealth+ "->" + (currentHealth-incomingDamage));
        if (isAlive==true){
            System.out.println(name+" is alive!");
        }else {
            System.out.println(name+" is Dead!");
        }




    }
}