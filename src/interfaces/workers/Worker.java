package interfaces.workers;

import java.time.LocalDate;

public interface Worker {

    String getName();
    String getSurname();
    LocalDate getBirth_date();
    int getRate();
    int getWork_hours();
    int getOvertime_hours();
    String getManager_name();
    String getSkills();
    int getMonth_rate();
    int getBonus(int i);
    String getPhone_number();
    String getMobile_number();
    int getRoom_number();

}
