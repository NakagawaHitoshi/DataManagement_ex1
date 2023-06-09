import java.util.Random;

class DiceGame{
    public static void main(String[] args){
        Random rand = new Random();
        int dice1 = rand.nextInt(6)+1;
        int dice2 = rand.nextInt(6)+1;
        System.out.println("Rolling dice...");
        System.out.println("Die 1: "+dice1);
        System.out.println("Die 2: "+dice2);
        System.out.println("Total value;"+(dice1+dice2));
    }
}
