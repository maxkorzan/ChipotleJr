import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Rice: white, brown, none, all
//        Meat: chicken, steak, carnidas, chorizo, sofritas, veggies, none, all
//        Beans: pinto, black, none, all
//        Salsa: mild, medium, hot, none, all
//        Veggies: lettuce, fajita veggies, none, all
//        Cheese: yes/no
//        Guac: yes/no
//        Queso: yes/no
//        Sour cream: yes/no

//        generate 25 burritos
//            each topping option in an Array (index 0 = "no", index 1 = "all")
//            array[i] - i=randNum(X options);
//
//        calculate price
//            array[i]
//            if i=0 - nothing
//            if i=1 - sum += array[2-->end] * (.50)
//            if i=2,3,4 - sum+=(.50);

        random number of toppings (5-9)
            assign a value to each array
            randNum(5,9) to select which toppings arrays














    }


    public static int randNum(int x,int y){
        Random rand = new Random(int x, y);
        return rand.nextInt(x);
    }

}





