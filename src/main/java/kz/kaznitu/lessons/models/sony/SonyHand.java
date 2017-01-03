package kz.kaznitu.lessons.models.sony;


import kz.kaznitu.lessons.interfaces.Hand;

public class SonyHand implements Hand {

    public SonyHand() {
    }

    public void catchSomething(){
        System.out.println("Catched from Sony!!");
    }

}