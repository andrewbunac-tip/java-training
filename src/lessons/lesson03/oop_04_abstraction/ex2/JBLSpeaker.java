package lessons.lesson03.oop_04_abstraction.ex2;

public class JBLSpeaker extends Remote{

    public JBLSpeaker() {
        this.deviceName = "JBL bluetooth Speaker";
    }

    @Override
    public void pushButton1() {
        System.out.println("Turn on Turn off");
    }

    @Override
    public void pushButton2() {
        System.out.println("Volume up");
    }

    @Override
    public void pushButton3() {
        System.out.println("Volume Down");

    }

    @Override
    public void pushButton4() {
        System.out.println("Bluetooth mode");

    }

    @Override
    public void pushButton5() {
        System.out.println("Aux mode");
    }
}
