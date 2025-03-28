
public class Main {
    public static void main(String[] args) {
        container ct = new container(2);
        System.out.println(ct.toString());
        ct.add(1);
        ct.add(2);
        ct.add(3);
        ct.add(4);
        System.out.println(ct.toString());
        ct.add(5);
        ct.add(6);
        ct.add(7);
        System.out.println(ct.toString());

    }
}

