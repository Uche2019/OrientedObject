package java2022;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();





        products.add("Bison Sweater");
        prices.add(55.99);
        products.add("Bison Tee");
        prices.add(14.99);
        products.add("Bison Hoodie");
        prices.add(23.99);
        products.add("Bison Bumpersticker");
        prices.add(4.99);

        String answer = "";
        ArrayList<String> purchases = new ArrayList<String>();

        do {
            System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) change purchase 3) show purchases 4) finish transaction");
            answer = sc.nextLine();


            if (answer.equals("1")) {
                System.out.println("What do you want to buy?");
                answer = sc.nextLine();
                purchases.add(answer);
            }

            if (answer.equals("2")) {
                System.out.println("What do you want to change?");
                answer = sc.nextLine();
                System.out.println("What should we replace?");
                String replace = sc.nextLine();
                int index = purchases.indexOf(answer);
                purchases.set(index, replace);
            }


            if (answer.equals("3")) {
                System.out.println("Displaying Purchases :");

                for (int i = 0; i < purchases.size(); i++) {
                    System.out.println(purchases.get(i));
                }

            }
        } while (!answer.equals("4"));


          double totalcost = 0.0;
          for(int i = 0; i < purchases.size(); i++) {
              int j = 0;
              do {

                  if (purchases.get(i) == products.get(j)) {
                      totalcost += prices.get(i);
                  }

                  j++;
              } while (j < products.size());
          }




    }
}
