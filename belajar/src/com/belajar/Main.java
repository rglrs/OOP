package com.belajar;

//player
class Player {
    String name;
    double health;
    int level;
    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defense(attackPower);
    }

    void defense(double attackPower){
        //akan mengambil damage
        double damage;
        if (this.armor.defensePower < attackPower){
            damage = attackPower - this.armor.defensePower;
        }
        else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

//senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.attackPower = attackPower;
        this.name = name;
    }

    void display(){
        System.out.println("Weapon: " + this.name + " , attack: " + this.attackPower);
    }
}

//armor
class Armor {
    double defensePower;
    String name;

    Armor(String name, double defensePower){
        this.defensePower = defensePower;
        this.name = name;
    }

    void display(){
        System.out.println("Armor: " + this.name + " , defense: " + this.defensePower);
    }
}

public class Main{
    public static void main(String[] args) {

        //membuat object power
        Player player1 = new Player("Ragil", 100);
        Player player2 = new Player("Fina", 100);

        //membuat object weapon
        Weapon sword = new Weapon("sword",50);
        Weapon staff = new Weapon("staff",30);

        //membuat object armor
        Armor vest = new Armor("vest",30);
        Armor dress = new Armor("dress",20);

        //equip senjata dan armor player 1
        player1.equipWeapon(sword);
        player1.equipArmor(vest);
        player1.display();

        // equip senjata dan armor player 2
        player2.equipWeapon(staff);
        player2.equipArmor(dress);
        player2.display();

        System.out.println("\nWAR");
        System.out.println("\nKejadian - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nKejadian - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}