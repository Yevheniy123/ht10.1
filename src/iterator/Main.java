package iterator;

public class Main {
    public static void main(String[] args)  {
        CollectionClass collection1 = new CollectionClass();
        CollectionClass collection2 = new CollectionClass();


        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add(4);
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add(4);


        collection2.add(5);
        collection2.add(4);
        collection2.add(3);
        collection2.add(2);
        collection1.show();

        System.out.println();
        System.out.println("............................");
        System.out.println();

        collection1.add(7,"3");
        collection2.add(7,"4");
        collection1.add(6);
        collection1.add(7);


        System.out.println(collection1.size());
        System.out.println(collection1.contain("1"));
        System.out.println(collection1.equals(collection1));
        collection1.show();

        System.out.println("\n............................");
        collection2.show();
    }
    }




