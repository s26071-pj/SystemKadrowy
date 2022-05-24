import WorkersType.Apprentice;
import WorkersType.PhysicalWorker;
import WorkersType.WhiteCollarWorker;
import WorkersType.Manager;
import WorkersType.MemberOfBoard;
import WorkersType.Employe;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        PhysicalWorker physicalWorker = new PhysicalWorker();
        WhiteCollarWorker whiteCollarWorker = new WhiteCollarWorker();
        Manager manager = new Manager();
        MemberOfBoard memberOfBoard = new MemberOfBoard();
        Apprentice apprentice = new Apprentice();

        physicalWorker.setName("Tomasz");
        physicalWorker.setSurname("Hajto");
        physicalWorker.setBirth_date(LocalDate.parse("1990-01-01"));
        physicalWorker.setRate(20);
        physicalWorker.setWork_hours(160);
        physicalWorker.setOvertime_hours(50);
        physicalWorker.setManager_name("Adam");
        physicalWorker.setSkills(
                "\nKwalifikacje na wózki widłowe, \n" +
                "Spawarki MMA,\n" +
                "Spawarki MiG/MAG, \n" +
                "Spawarki TIG"
        );
        physicalWorker.setMonthly_consuption((int) (20*160+1.5*20*50));


        whiteCollarWorker.setName("Janusz");
        whiteCollarWorker.setSurname("Posciela");
        whiteCollarWorker.setBirth_date(LocalDate.parse("1987-03-13"));
        whiteCollarWorker.setMonth_rate(1500);
        whiteCollarWorker.setBonus(12);
        whiteCollarWorker.setManager_name("Artur");
        whiteCollarWorker.setPhone_number("923125165");
        whiteCollarWorker.setRoom_number(14);
        whiteCollarWorker.setMonthly_consuption((int) (1500+0.12*1500));

        manager.setName("Kacper");
        manager.setSurname("Holowczyc");
        manager.setBirth_date(LocalDate.parse("2000-01-01"));
        manager.setMonth_rate(2000);
        manager.setBonus(15);
        manager.setManager_bonus(300);
        manager.setPhone_number("873556333");
        manager.setMobile_number("999888777");
        manager.setRoom_number(25);
        manager.setDepartment_name("Chłodnia");
        manager.setMonthly_consuption((int) (2000+0.15*2000+300));

        memberOfBoard.setName("Juan");
        memberOfBoard.setSurname("Zawadko");
        memberOfBoard.setBirth_date(LocalDate.parse("1997-12-31"));
        memberOfBoard.setMonth_rate(1000);
        memberOfBoard.setAssistent_name("Tomasz");
        memberOfBoard.setMeeting_number(9);
        memberOfBoard.setMonthly_consuption(1000+9*25);

        apprentice.setName("Michal");
        apprentice.setSurname("Jajo");
        apprentice.setBirth_date(LocalDate.parse("2001-02-19"));
        apprentice.setGuardian_name("Adam");
        apprentice.setScholarship(true);
        apprentice.setScholarship_value(apprentice.getScholarship_value()); //nie wiem dalaczego ale to u mnie działa :0

        physicalWorker.printoutEmploye();
        whiteCollarWorker.printoutEmploye();
        manager.printoutEmploye();
        memberOfBoard.printoutEmploye();
        apprentice.printoutEmploye();
    }
}
