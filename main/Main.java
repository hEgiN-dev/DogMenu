package main;

import controller.Controller;
import model.Dog;
import model.Pet;
import view.MyFrame;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Dog(14, 3);

        MyFrame myFrame = new MyFrame();

        Controller controller = new Controller(dog, myFrame);
        controller.initController();
    }
}

