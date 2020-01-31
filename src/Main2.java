import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<String> rice = new ArrayList<>();
        ArrayList<String> meat = new ArrayList<>();
        ArrayList<String> beans = new ArrayList<>();
        ArrayList<String> cheese = new ArrayList<>();
        ArrayList<String> guac = new ArrayList<>();
        ArrayList<String> queso = new ArrayList<>();

        Collections.addAll(rice, "no rice", "all rice", "white", "brown");
        Collections.addAll(meat, "no meat", "all meat", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie_meat");
        Collections.addAll(beans,"no beans", "all beans", "pinto", "black");
        Collections.addAll(cheese,"no cheese", "cheese", "cheese");
        Collections.addAll(guac,"no guac", "guac", "guac");
        Collections.addAll(queso,"no queso", "queso", "queso");


        //Build burrito
        for(int num=0; num<=25; num++){

            ArrayList<String> burrito = new ArrayList<>();
            Collections.addAll(burrito, rice.get(randNum(rice.size())) + "\t \t" + meat.get(randNum(meat.size())) + "\t \t" + queso.get(randNum(queso.size())));

            for(int i=0; i<burrito.size(); i++){
            }


            //System.out.print("Burrito "+i+": ");
            System.out.printf(rice.get(randNum(rice.size())) + "\t \t" + meat.get(randNum(meat.size())) + "\t \t" + queso.get(randNum(queso.size())));
            System.out.println();


        }


    }

    public static int randNum(int x){
        Random rand = new Random();
        return rand.nextInt(x);
    }


}














/*
        String[] rice =      {"no rice", "all rice", "white", "brown"};
        String[] meat =      {"no meat", "all meat", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie_meat"};
        String[] beans =     {"no beans", "all beans", "pinto", "black"};
        String[] salsa =     {"no salsa", "all salsa", "mild", "medium", "hot"};
        String[] veggies =   {"no veggies", "all veggies", "lettuce", "fajita_veggies"};
        String[] cheese =    {"no cheese", "cheese", "cheese"};
        String[] guac =      {"no guac", "guac", "guac"};
        String[] queso =     {"no queso", "queso", "queso"};
        String[] sourcream = {"no sourcream", "sourcream", "sourcream"};*/
