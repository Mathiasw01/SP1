import java.lang.annotation.Target;

public class Character {
    String name;
    int currentHealth=100;
    int maxHealth=100;
    int level=1;
    int exp=0;
    double gold=100;
    boolean isAlive=true;
    char type;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    int attack=5;
    String[] items= {"Sword","sheild","Health Potion"};
    Character(String name,char type){
        this.name=name;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
    int incomingDamage;

    void printCharacterSheet(){
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

    void takeDamage(int amount){
        currentHealth=currentHealth-amount;
        if (currentHealth<=0){
            isAlive=false;
        }
    }
    void heal(int amount){
        if (currentHealth+amount>=maxHealth){
            currentHealth=maxHealth;
        }else {
            currentHealth=currentHealth+amount;
        }
    }
    void addGold(double amount){
        gold=gold+amount;
    }
    boolean removeGold(double amount){
        if (gold>=amount){
            gold=gold-amount;
            return true;
        }else{
            return false;
        }
    }
    void addXP(int amount){
        exp=exp+amount;
    }

    void levelUp(){
        level=level+1;
        maxHealth=maxHealth+5;
        exp=0;
    }

     boolean isHealthCritical(){
        if (currentHealth<=maxHealth*0.25){
            return true;
        }else {
            return false;
        }
    }


    double getHealthPercentage() {
        return ((double) currentHealth / maxHealth) * 100;
    }

    void printInventory(){
        for (int i=0;i<items.length;i++){
            System.out.println("- "+ items[i]);
        }
    }

    void attack(Character target){
        target.takeDamage(attack);
        target.getHealthPercentage();
        System.out.println("\n"+name+ " Attacks " + target.name + "for "+ attack+" damage!");
    }

    void combatCharacterSheet(){
        System.out.println("\n"+"==="+name+"===");
        System.out.println("Level:"+level+ " | Health:"+ currentHealth+"/"+maxHealth+ " | Gold:"+ gold);
    }

}
