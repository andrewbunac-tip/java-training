package activities.activity03;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        List<LogBook> logs = new ArrayList<>();
        boolean exit = false;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Please Enter Key : C - [CREATE LOG], S- [SHOW LOGS], E-[EXIT]:");
            String inputValue = input.nextLine();

            switch (inputValue) {
                case "C":

                    System.out.print("Enter your Name:");
                    String name = input.nextLine();
                    System.out.print("Reason of Visit:");
                    String reason = input.nextLine();
                    LocalDateTime now = LocalDateTime.now();
                    String time = dtf.format(now);

                    LogBook log = new LogBook();
                    // USING SETTERS
                    log.setName(name);
                    log.setReasonOfVisit(reason);
                    log.setTimeOfVisit(time);


                    // Constructor
//                    LogBook log1 = new LogBook(name, time , reason);

                    //SHOW LOGS
                    log.showLog();

                    //
                    logs.add(log);
                    break;
                case "S":
                    for(int i = 0; i < logs.size(); i ++) {
                        LogBook logRecord;
                        logRecord= logs.get(i);
                        logRecord.showLog();
                    }

                    break;
                case "E":
                    exit = true;
                    break;

            }



        } while(!exit);

    }

}
