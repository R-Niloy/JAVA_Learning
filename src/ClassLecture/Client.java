package ClassLecture;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        University u =  new University();
        u.addId(2);
        u.addId(4);
        System.out.println("Before editing");
        u.print();
        ArrayList<Integer> arr=u.getIDs();
        System.out.println("After");
        arr.set(0, 9);
        u.print();
    }
}
