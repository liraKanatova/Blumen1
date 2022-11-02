public class Main {
    public static void main(String[] args) {

        Blumen1 blumen1 = new Blumen1();
        blumen1.name = "Rose";
        blumen1.price = 1000;
        blumen1.color = "red";

        Blumen1 blumen2 = new Blumen1();
        blumen2.name = "Rose";
        blumen2.price = 1400;
        blumen2.color = "white";

        Blumen1 blumen3 = new Blumen1();
        blumen3.name = "Rose";
        blumen3.price = 1500;
        blumen3.color = "white";

        Blumen1 blumen4 = new Blumen1();
        blumen4.name = "Tulpan";
        blumen4.price = 1100;
        blumen4.color = "red";

        Blumen1 blumen5 = new Blumen1();
        blumen5.name = "Tulpan";
        blumen5.price = 1200;
        blumen5.color = "white";

        Blumen1 blumen6 = new Blumen1();
        blumen6.name = "Tulpan";
        blumen6.price = 1300;
        blumen6.color = "red";
        Blumen1[] blumen1s = {blumen1, blumen2, blumen3, blumen4, blumen5, blumen6};
        Blumen1[] maxPrise = {blumen1, blumen2, blumen3, blumen4, blumen5, blumen6};
        Blumen1[] mixPrise = {blumen1, blumen2, blumen3, blumen4, blumen5, blumen6};
            blumen1.getBig(blumen1s);
            blumen1.getMaxPrice(maxPrise);
            blumen1.getMinPrice(mixPrise);
        }
    }
