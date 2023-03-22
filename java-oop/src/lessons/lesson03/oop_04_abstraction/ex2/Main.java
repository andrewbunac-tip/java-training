package lessons.lesson03.oop_04_abstraction.ex2;

public class Main {

    public static void main(String[] args) {

        System.out.println("remote TV");
        Remote remoteTV = new TV();
        remoteTV.pushButton1();
        remoteTV.pushButton2();
        remoteTV.pushButton3();
        remoteTV.pushButton4();
        remoteTV.pushButton5();
        remoteTV.tellDeviceName();

        System.out.println("remote JBL Speaker");
        Remote remoteJbl = new JBLSpeaker();
        remoteJbl.pushButton1();
        remoteJbl.pushButton2();
        remoteJbl.pushButton3();
        remoteJbl.pushButton4();
        remoteJbl.pushButton5();
        remoteJbl.tellDeviceName();



    }

}
