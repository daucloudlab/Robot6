package kz.kaznitu.lessons.models.toshiba;


import kz.kaznitu.lessons.interfaces.Leg;

public class ToshibaLeg implements Leg {
    public ToshibaLeg() {
    }

    public void go(){
        System.out.println("Go to Toshiba!");
    }

}