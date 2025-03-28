
public class Main {
    public static void main(String[] args) {
        container ct = new container();
        ct.add(2);
        ct.add(3);
        System.out.println(ct.getCapacity());
        ct.add(3);
        ct.add(6);
        ct.add(3);
        System.out.println(ct.getCapacity());
        System.out.println(ct.get_element(3));
        System.out.println(ct.get_element(4));
        System.out.println(ct.toString());
        ct.add(3);
        ct.add(3);
        ct.add(3);
        ct.add(3);
        ct.add(3);
        ct.add(3);
        ct.add(3);
        System.out.println(ct.toString());



    }
}

