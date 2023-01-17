public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        System.out.println("Capacity is: " +list.getCapacity());
        System.out.println("List is : "+(list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements: "+list.size());

        list.add(1);
        list.add(22);
        list.add(78);
        list.add(62);
        list.add(99);
        list.add(100);
        list.add(856);
        list.add(200);
        list.add(250);

        System.out.println("Capacity is: " +list.getCapacity());
        System.out.println("List is : "+(list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in: "+list.size());
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));
        list.clear();
        System.out.println("List is : "+(list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Capacity is: " +list.getCapacity());


        MyList<Integer> list2 = new MyList<>(8);
        System.out.println("Capacity is: " +list2.getCapacity());
        System.out.println("List is : "+(list2.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements: "+list2.size());


        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(6);
        list2.add(5);
        list2.add(2);
        list2.add(7);
        list2.add(8);
        list2.add(2);
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(2);

        System.out.println("Capacity is: " +list2.getCapacity());
        System.out.println("List is : "+(list2.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in: "+list2.size());
        System.out.println(list2.get(0));
        list2.remove(0);
        System.out.println(list2.get(0));
        System.out.println(list2.indexOf(2));
        System.out.println(list2.lastIndexOf(2));
        list2.clear();
        System.out.println(list2.lastIndexOf(2));
        System.out.println("List is : "+(list2.isEmpty() ? "Empty" : "Full"));
        System.out.println("Capacity is: " +list2.getCapacity());



    }
}