import java.util.Arrays;

public class Blumen1 {
    String name;
    int price;
    String color;


    public void getBig(Blumen1[] blumen1s) {
        int tulpan = 0;
        int rose = 0;
        for (Blumen1 blumen1 : blumen1s) {
            if (blumen1.name.equals("Tulpan")) {
                tulpan++;
            }
            if (blumen1.name.equals("Rose")) {
                rose++;
            }
        }
        System.out.println("Tulpans: " + tulpan);
        System.out.println("Roses: " + rose);


        Blumen1[] tulpans = new Blumen1[tulpan];
        int index = 0;
        for (int i = 0; i < blumen1s.length; i++) {
            if (blumen1s[i].name.equals("Tulpan")) {
                tulpans[index] = blumen1s[i];
                System.out.print(tulpans[index].name + " ");
                System.out.print(tulpans[index].color + " ");
                System.out.print(tulpans[index].price + " ");
                System.out.println();
                index++;
            }
        }
        System.out.println();

        int index2 = 0;
        Blumen1[] roses = new Blumen1[rose];
        for (int i = 0; i < blumen1s.length; i++) {
            if (blumen1s[i].name.equals("Rose")) {
                roses[index2] = blumen1s[i];
                System.out.print(roses[index2].name + " ");
                System.out.print(roses[index2].color + " ");
                System.out.print(roses[index2].price + " ");
                System.out.println(" ");
                index2++;
            }
        }
    }

    public void maxPrice(Blumen1[] blumen1s) {
        Blumen1 blumen1 = blumen1s[0];

        for (int i = 0; i < blumen1s.length; i++) {
            if (blumen1.price > blumen1s[i].price) {
                blumen1 = blumen1s[i];
            }
        }
        System.out.println(blumen1);
    }


    public void getMaxPrice(Blumen1[] maxPrise) {
        int counter1 = maxPrise[0].price;
        for (int i = 0; i < maxPrise.length; i++) {
            if (counter1 < maxPrise[i].price) {
                counter1 = maxPrise[i].price;
            }
        }
        System.out.println(counter1);
    }

    public void minPrice(Blumen1[] blumen1s) {
        Blumen1 blumen1 = blumen1s[0];
        for (int i = 0; i < blumen1s.length; i++) {
            if (blumen1.price < blumen1s[i].price) {
                blumen1 = blumen1s[i];
            }
        }
        System.out.println(blumen1);
    }
    public void getMinPrice(Blumen1[] blumen1s){
        int counter2= blumen1s[0].price;
        for (int i = 0; i >blumen1s.length ; i++) {
            if(counter2>blumen1s[i].price){
                counter2=blumen1s[i].price;
            }
        }
        System.out.println(counter2);
    }
}