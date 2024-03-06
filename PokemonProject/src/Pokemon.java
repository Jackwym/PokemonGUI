import java.util.ArrayList;


public class Pokemon {
    public String name;
    public int HP;
    public int AP;
    public String type; // 0-grass, 1-fire, 2-water
    public String[] attacks;
    public int[] accuracy;
    public int[] PP;
    public int[] attackPower;
    boolean hasFainted;
    public int setHP;
    public String attackDescriptor;


    public Pokemon(String name, String type, int HP, int AP) {
        hasFainted = false;
        this.name = name;
        this.type = type;
        this.HP = HP;
        this.AP = AP;
        attacks = new String[3];
        accuracy = new int[3];
        PP = new int[3];
        if (type.equals("grass")) {
            attacks[0] = "leaf storm";
            attacks[1] = "mega drain";
            attacks[2] = "razor leaf";
            accuracy[0] = 90;
            accuracy[1] = 100;
            accuracy[2] = 95;
            PP[0] = 5; // leaf storm
            PP[1] = 15; // mega drain
            PP[2] = 25; // razor leaf
        }
        else if (type.equals("fire")){
            attacks[0] = "ember";
            attacks[1] = "fire punch";
            attacks[2] = "flame wheel";
            accuracy[0] = 100;
            accuracy[1] = 80;
            accuracy[2] = 90;
            PP[0] = 25; // ember
            PP[1] = 15; // fire punch
            PP[2] = 25; // flame wheel
        }
        else {
            attacks[0] = "bubble";
            attacks[1] = "hydro pump";
            attacks[2] = "surf";
            accuracy[0] = 100;
            accuracy[1] = 30;
            accuracy[2] = 90;
            PP[0] = 30; // bubble
            PP[1] = 5; // hydro pump
            PP[2] = 15; // surf
        }
    }


    public Pokemon(String name) {
        switch(name) {
            case "bulbasaur":
                type = "grass";
                HP = 60;
                setHP = 60;
                AP = 40;
                break;
            case "charmander":
                type = "fire";
                HP = 25;
                setHP = 25;
                AP = 70;
                break;
            case "squirtle":
                type = "water";
                HP = 80;
                setHP = 80;
                AP = 20;
                break;
            case "bellsprout":
                type = "grass";
                HP = 40;
                setHP = 40;
                AP = 60;
                break;
            case "ninetails":
                type = "fire";
                HP = 30;
                setHP = 30;
                AP = 50;
                break;
            case "psyduck":
                type = "water";
                HP = 70;
                setHP = 70;
                AP = 40;
                break;
            case "oddish":
                type = "grass";
                HP = 50;
                setHP = 50;
                AP = 50;
                break;
            case "ponyta":
                type = "fire";
                HP = 40;
                setHP = 40;
                AP = 60;
                break;
            case "poliwag":
                type = "water";
                HP = 50;
                setHP = 50;
                AP = 50;
                break;
        }
        hasFainted = false;
        this.name = name;
        attacks = new String[3];
        accuracy = new int[3];
        PP = new int[3];
        attackPower = new int[3];
        if (type.equals("grass")) {
            attacks[0] = "leaf storm";
            attacks[1] = "mega drain";
            attacks[2] = "razor leaf";
            attackPower[0] = 130;
            attackPower[1] = 50;
            attackPower[2] = 55;
            accuracy[0] = 90;
            accuracy[1] = 100;
            accuracy[2] = 95;
            PP[0] = 5; // leaf storm
            PP[1] = 15; // mega drain
            PP[2] = 25; // razor leaf
        }
        else if (type.equals("fire")){
            attacks[0] = "ember";
            attacks[1] = "fire punch";
            attacks[2] = "flame wheel";
            attackPower[0] = 60;
            attackPower[1] = 85;
            attackPower[2] = 70;
            accuracy[0] = 100;
            accuracy[1] = 80;
            accuracy[2] = 90;
            PP[0] = 25; // ember
            PP[1] = 15; // fire punch
            PP[2] = 25; // flame wheel
        }
        else {
            attacks[0] = "bubble";
            attacks[1] = "hydro pump";
            attacks[2] = "surf";
            attackPower[0] = 40;
            attackPower[1] = 185;
            attackPower[2] = 70;
            accuracy[0] = 100;
            accuracy[1] = 30;
            accuracy[2] = 90;
            PP[0] = 30; // bubble
            PP[1] = 5; // hydro pump
            PP[2] = 15; // surf
        }
    }




    public void attack(int attackIndex, Pokemon other) {
        attackDescriptor = "";
        if (PP[attackIndex] == 0) {
            System.out.println("out of PP for this move");
            return;
        }
        double attackDamage = 0;
        if (AP > attackPower[attackIndex]) {
            attackDamage = (Math.random()*(AP-attackPower[attackIndex]))+attackPower[attackIndex];
        }
        else {
            attackDamage = (Math.random()*(attackPower[attackIndex]-AP))+AP;
        }


        if ((type.equals("grass") && other.type.equals("water")) ||
                (type.equals("water") && other.type.equals("fire")) ||
                (type.equals("fire") && other.type.equals("grass"))) {
            attackDamage *= 1.5;
            attackDescriptor = "very effective!";
        }
        int rand = (int) (Math.random() * 100);
        if (rand >= accuracy[attackIndex]) attackDamage = 0.0;
        other.HP -= (int) attackDamage;
        if (other.HP <= 0) {
            other.hasFainted = true;
            attackDescriptor = (other.name + " has fainted!");
        }
    }


    public void switchPokemon(Pokemon[] hand, int indexOfNew) {
        attackDescriptor = "";
        Pokemon temp = hand[0];
        hand[0] = hand[indexOfNew];
        hand[indexOfNew] = temp;
    }




    public void heal() {
        attackDescriptor = "";
        HP += 20;
        if (HP >= setHP) HP = setHP;
        attackDescriptor = ("You healed" + (setHP - HP));
    }


    public void takeCPUTurn(Pokemon[] hand, Pokemon[] handOther) {
        int rand = (int) (Math.random() * 6);
        if (rand <= 3) {
            // attack
            rand = (int) (Math.random() * 3);
            if (rand == 0) {
                hand[0].attack(0, handOther[0]);
            }
            else if (rand == 1) {
                hand[0].attack(1, handOther[0]);
            }
            else {
                hand[0].attack(2, handOther[0]);
            }
        }
        else if (rand == 4) {
            // switch
            rand = (int) (Math.random() * 2);
            if (rand == 0) {
                hand[0].switchPokemon(hand, 1);
            }
            else {
                hand[0].switchPokemon(hand, 2);
            }
        }
        else { // rand == 5
            // heal
            hand[0].heal();
        }
    }
}
