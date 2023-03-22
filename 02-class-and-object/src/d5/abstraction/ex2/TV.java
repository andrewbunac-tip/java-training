package d5.abstraction.ex2;

public class TV extends Remote{

    public TV() {
        this.deviceName = "TV - Samsung";
    }

    @Override
    public void pushButton1() {
        // Turn on and Turn Off
        System.out.println("Turn on and Turn Off");
    }

    @Override
    public void pushButton2() {
        // Change channel +
        System.out.println("Change Channel <");

    }

    @Override
    public void pushButton3() {
        // Change channel -
        System.out.println("Change Channel >");
    }

    @Override
    public void pushButton4() {
        System.out.println("Volume Up");
    }


    @Override
    public void pushButton5() {
        System.out.println("Volume Down");
    }
}
