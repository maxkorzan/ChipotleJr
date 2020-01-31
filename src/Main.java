import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Rice: white, brown, none, all
//        Meat: chicken, steak, carnidas, chorizo, sofritas, veggie_meat, none, all
//        Beans: pinto, black, none, all
//        Salsa: mild, medium, hot, none, all
//        Veggies: lettuce, fajita veggies, none, all

//        ***boolean for these? or array and set index1 as "none"?***
//        Cheese: yes/no
//        Guac: yes/no
//        Queso: yes/no
//        Sour cream: yes/no

        String[] rice =      {"no rice", "all rice", "white", "brown"};
        String[] meat =      {"no meat", "all meat", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie_meat"};
        String[] beans =     {"no beans", "all beans", "pinto", "black"};
        String[] salsa =     {"no salsa", "all salsa", "mild", "medium", "hot"};
        String[] veggies =   {"no veggies", "all veggies", "lettuce", "fajita_veggies"};
        String[] cheese =    {"no cheese", "cheese", "cheese"};
        String[] guac =      {"no guac", "guac", "guac"};
        String[] queso =     {"no queso", "queso", "queso"};
        String[] sourcream = {"no sourcream", "sourcream", "sourcream"};

//        generate 25 burritos
//            each topping option in an Array (index 0 = "no", index 1 = "all")
//            array[i] - i=randNum(X options);

            //        for(int i=0; i<=25; i++) {
            //            String[] burrito+i = new String[];
            //        }

        //String[] burrito1 = new String[];
           // for(int i=0; i<9; i++){            }
            //number of topping types
            int x = 5 + randNum(5);
            //String[] burrito1 = new String[x];

            //select specific toppings
            String[] burrito1 = {rice[randNum(4)],meat[randNum(8)],beans[randNum(4)],salsa[randNum(5)],
            veggies[randNum(4)],cheese[randNum(3)],guac[randNum(3)],queso[randNum(3)], sourcream[randNum(3)]};

            System.out.print("Burrito 1: ");
                for(String key: burrito1){
                    System.out.print(key+", ");
                }

        //calculate price
        double total = 3.00;
        System.out.println();
        System.out.print("total = "+total);
        for(int i=0; i<burrito1.length; i++){
            if(burrito1[i].contains("all")){
                total += (10);
            }
            else {
                total += .50;
            }
            System.out.print(", "+total);
        }
        System.out.println();
        System.out.println("final total = "+total);


//        random number of toppings (5-9)
//            assign a value to each array
//            randNum(5,9) to select which toppings arrays
//            5 + randNum(5)  <== 5-9
//            default index remains 0/false for others (none)

//            ArrayList<String> burrito1 = new ArrayList<>();
//            burrito1.add()


//        calculate price
//            array[i]
//            if i=0 - nothing
//            if i=1 - sum += array[2-->end] * (.50)
//            if i=2,3,4 - sum+=(.50);
//
//        save burritos into an array/ arrayList
//            String array[9] burrito# --> replace[i] with topping X


//        display each burrito:
//            "Burrito "+burrito# +": "+each [i] for burrito array


    }


    public static int randNum(int x){
        Random rand = new Random();
        return rand.nextInt(x);
    }

//    public static int calcPrice(topping x){
//
//    }
//
//    public static

}





