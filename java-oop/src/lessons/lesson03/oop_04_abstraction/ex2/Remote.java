package lessons.lesson03.oop_04_abstraction.ex2;

public abstract class Remote {
    protected  String deviceName;

    public void tellDeviceName() {
        System.out.println("Device is" + deviceName);
    }

    public abstract void pushButton1();
    public abstract void pushButton2();
    public abstract void pushButton3();
    public abstract void pushButton4();
    public abstract void pushButton5();

}
