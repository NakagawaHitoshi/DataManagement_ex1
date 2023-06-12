import java.util.Random;
import java.util.scanner;

class DiceGame{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What your name?");
        String name = sc.nextLine();
        System.out.println("Hello "+name+"!");
        
        Random rand = new Random();
        int dice1 = rand.nextInt(6)+1;
        int dice2 = rand.nextInt(6)+1;
        System.out.println("Rolling dice...");
        System.out.println("Die 1: "+dice1);
        System.out.println("Die 2: "+dice2);
        System.out.println("Total value;"+(dice1+dice2));
        
        if(dice1+dice2 > 7){
            System.out.println(name +" won!");
        }else{
            System.out.println(name +" lose!"+)
        }
    }
}
