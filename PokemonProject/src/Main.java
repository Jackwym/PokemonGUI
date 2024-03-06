import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        new MyFrame();
        Pokemon bulbasaur = new Pokemon("bulbasaur");
        Pokemon charmander = new Pokemon("charmander");
        Pokemon squirtle = new Pokemon("squirtle");
        System.out.println(bulbasaur.HP);
        System.out.println(charmander.HP);
        charmander.attack(0, bulbasaur);
        System.out.println(bulbasaur.HP);
        System.out.println(charmander.HP);
//        Pokemon[] hand = {bulbasaur, charmander, squirtle};
//        bulbasaur.switchPokemon(hand, 2);
//        System.out.println(hand[0].name);
//        System.out.println(hand[1].name);
//        System.out.println(hand[2].name);
    }
}

/*
curScreen:
0-start screen
1-name screen
2-Pokemon selection
3-fade out
4-fade in
5-battle
6-help/stats
7-switch buttons
8-player attack animation
9-CPU attack animation
10-won or lost screen
*/


// line 381 is frame bg


// random: return (int) (Math.random()*(Max-Min))+Min;


/*
elements to be added:
three pokemon switch choice buttons (off if fainted)
player and rival name
health bars
*/
