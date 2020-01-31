import java.util.Random;

public class JustMakeItWork {
    public static void main(String[] args) {

        String[] rice =      {"no rice", "all rice", "white rice", "brown rice"};
        String[] meat =      {"no meat", "all meat", "chicken", "steak", "carnitas", "chorizo", "sofritas", "veggie_meat"};
        String[] beans =     {"no beans", "all beans", "pinto beans", "black beans"};
        String[] salsa =     {"no salsa", "all salsa", "mild salsa", "medium salsa", "hot salsa"};
        String[] veggies =   {"no veggies", "all veggies", "lettuce", "fajita_veggies"};
        String[] cheese =    {"no cheese", "cheese", "cheese"};
        String[] guac =      {"no guac", "guac", "guac"};
        String[] queso =     {"no queso", "queso", "queso"};
        String[] sourcream = {"no sourcream", "sourcream", "sourcream"};



        //burrito
        for(int numBurritos=1; numBurritos<=25; numBurritos++){

            double price;
            double total=3.00;

            //RICE
            int riceRandom = randNum(rice.length);
            String riceChoice = rice[riceRandom];

            if(riceRandom==0){
                price=0;
            } else if(riceRandom==1){
                price=(rice.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(riceChoice + " price: "+price);
//        System.out.print(" total: "+total);
//        System.out.println();

            //MEAT
            int meatRandom = randNum(meat.length);
            String meatChoice = meat[meatRandom];

            if(meatRandom==0){
                price=0;
            } else if(meatRandom==1){
                price=(meat.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(meatChoice + " price: "+price);
//        System.out.print(" total: "+total);
//        System.out.println();


            //BEANS
            int beansRandom = randNum(beans.length);
            String beansChoice = beans[beansRandom];

            if(beansRandom==0){
                price=0;
            } else if(beansRandom==1){
                price=(beans.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(beansChoice+ " price: "+price);
//        System.out.print(" total: "+total);
//        System.out.println();


            //SALSA
            int salsaRandom = randNum(salsa.length);
            String salsaChoice = salsa[salsaRandom];

            if(salsaRandom==0){
                price=0;
            } else if(salsaRandom==1){
                price=(salsa.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(salsaChoice + " price: "+price);
//        System.out.print(" total: "+total);
//        System.out.println();


            //VEGGIES
            int veggiesRandom = randNum(veggies.length);
            String veggiesChoice = veggies[veggiesRandom];

            if(veggiesRandom==0){
                price=0;
            } else if(veggiesRandom==1){
                price=(veggies.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(veggiesChoice + " price: "+price);
//        System.out.print(" total: "+total);
//        System.out.println();


            //CHEESE
            int cheeseRandom = randNum(cheese.length);
            String cheeseChoice = cheese[cheeseRandom];

            if(cheeseRandom==0){
                price=0;
            } else if(cheeseRandom==1){
                price=(cheese.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(cheeseChoice + " price: "+price);
//        System.out.print(" total: "+total);
//        System.out.println();


            //GUAC
            int guacRandom = randNum(guac.length);
            String guacChoice = guac[guacRandom];

            if(guacRandom==0){
                price=0;
            } else if(guacRandom==1){
                price=(guac.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(guacChoice + " price: "+price);
//        System.out.print(" total: "+total);
//        System.out.println();


            //QUESO
            int quesoRandom = randNum(queso.length);
            String quesoChoice = queso[quesoRandom];

            if(quesoRandom==0){
                price=0;
            } else if(quesoRandom==1){
                price=(queso.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(quesoChoice+ " price: "+price);
//        System.out.print(" total: "+total);
//        System.out.println();


            //SOURCREAM
            int sourcreamRandom = randNum(sourcream.length);
            String sourcreamChoice = sourcream[sourcreamRandom];

            if(sourcreamRandom==0){
                price=0;
            } else if(sourcreamRandom==1){
                price=(sourcream.length - 2)*(.50);
            } else {
                price=.50;
            }
            total += price;
//        System.out.print(sourcreamChoice + " price: "+price);
//        System.out.print(" total: "+total);

            ////////////////////////////////////////////
            String[] burrito = {riceChoice, meatChoice, beansChoice, salsaChoice, veggiesChoice, cheeseChoice, guacChoice, quesoChoice, sourcreamChoice};

            System.out.println();
            System.out.print("Burrito "+numBurritos+": ");
            for(String key: burrito){
                System.out.print(key+", ");
            }
            System.out.printf("\t$%.2f",total);

        }

    }

    public static int randNum(int x){
        Random rand = new Random();
        return rand.nextInt(x);
    }

}
