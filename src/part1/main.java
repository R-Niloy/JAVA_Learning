package part1;

import ClassLecture.University;

public class main {
    public static void main(String[] args) {
        Car toyota = new Car();

        Car porsche = new Car();
        toyota.setModel("Corolla");
        System.out.println("The toyota model is : " + toyota.getModel());

    }
}

