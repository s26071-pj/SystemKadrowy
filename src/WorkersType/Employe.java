package WorkersType;
import interfaces.workers.Worker;

import java.time.LocalDate;

public class Employe implements Worker {
    protected WorkerType workertype;
    protected String name;
    protected String surname;
    protected String guardian_name;
    protected boolean scholarship;
    protected String manager_name;
    protected String skills;
    protected String department_name;
    protected String assistent_name;
    protected LocalDate birth_date;
    protected int rate;
    protected int  month_rate;
    protected int work_hours;
    protected int overtime_hours;
    protected int bonus;
    protected String phone_number;
    protected int room_number;
    protected int manager_bonus;
    protected String mobile_number;
    protected int meeting_number;
    protected int monthly_consuption;
    protected int scholarship_value;

    public String getWorkertype(){return workertype.toString();}
    public String getName(){return name;}
    public String getSurname(){return surname;}
    public LocalDate getBirth_date(){
        return birth_date;
    }
    public int getRate(){
        return rate;
    }
    public int getWork_hours(){
        return work_hours;
    }
    public int getOvertime_hours(){
        return overtime_hours;
    }
    public String getManager_name(){
        return manager_name;
    }
    public String getSkills(){
        return skills;
    }
    public int getMonth_rate(){
        return month_rate;
    }
    public int getMonthly_consuption() {
    return monthly_consuption;
    }
    @Override
    public int getBonus(int i) {
        return 0;
    }
    public int getBonus(){
        return bonus;
    }
    public String getPhone_number(){
        // (+00)000-000-000
        if (phone_number == null || phone_number == "")return "";
        String[] elements= new String[3];
        elements[0] = phone_number.substring(0,3);
        elements[1] = phone_number.substring(3,6);
        elements[2] = phone_number.substring(6,9);

        return String.format("(+48)%s-%s-%s",elements[0],elements[1],elements[2]);

    }
    public int getRoom_number(){
        return room_number;
    }
    public int getManager_bonus() {
        return manager_bonus;
    }
    public String getMobile_number() {
        if (mobile_number == null || mobile_number == "")return "";
        String[] elements= new String[3];
        elements[0] = mobile_number.substring(0,3);
        elements[1] = mobile_number.substring(3,6);
        elements[2] = mobile_number.substring(6,9);

        return String.format("(+48)%s-%s-%s",elements[0],elements[1],elements[2]);
    }
    public String getDepartment_name() {
        return department_name;
    }
    public String getAssistent_name() {
        return assistent_name;
    }
    public int getMeeting_number() {
        return meeting_number;
    }
    public String getGuardian_name() {
        return guardian_name;
    }
    public boolean getScholarship() {
        return scholarship;
    }
    public int getScholarship_value(){
        if(getScholarship()) {
            return 500;
        }else{
            return 0;
        }
    }

    public void setWorkertype(WorkerType workertype){
        this.workertype = workertype;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public void setWork_hours(int work_hours) {
        this.work_hours = work_hours;
    }
    public void setOvertime_hours(int overtime_hours) {
        this.overtime_hours = overtime_hours;
    }
    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public void setMonth_rate(int  month_rate) {
        this.month_rate = month_rate;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void setPhone_number(String  phone_number) {
        this.phone_number = phone_number;
    }
    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }
    public void setManager_bonus(int manager_bonus) {
        this.manager_bonus = manager_bonus;
    }
    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
    public void setAssistent_name(String assistent_name) {
        this.assistent_name = assistent_name;
    }
    public void setMeeting_number(int meeting_number) {
        this.meeting_number = meeting_number;
    }
    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }
    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }
    public void setMonthly_consuption(int monthly_consuption){this.monthly_consuption = monthly_consuption;}
    public void setScholarship_value(int scholarship_value){this.scholarship_value = scholarship_value;}

    public void printoutEmploye(){
        String template = """
                ---------------------------------------------------
                Typ pracownika: %s
                Imie: %s
                Nazwisko: %s
                Data urodzenia: %s
                Stawka godzinowa: %s
                Pensja miesieczna: %s
                Procent premi: %s
                Kwota dodatku kierowniczego: %s
                Numer telefonu: %s
                Numer telefonu komórkowego: %s
                Numer pokoju: %s
                Nazwa dzialu pod opieka: %s
                Liczba przepracowanych godzin: %s
                Liczba nadgodzin: %s
                Kto jest kierownikiem: %s
                Kto jest asystentem: %s
                Kto jest opiekunem: %s
                Ilosc obecnosci na spotkaniach rady: %s
                Umiejetnosci: %s
                Czy jest przyznane seminarium: %s
                Wysokosc stypendium: %s
                Kwota miesiecznego poboru: %s
                ---------------------------------------------------
                """;
        String result = String.format(
                template,
                getWorkertype(),
                getName(),
                getSurname(),
                getBirth_date(),
                getRate(),
                getMonth_rate(),
                getBonus(),
                getManager_bonus(),
                getPhone_number(),
                getMobile_number(),
                getRoom_number(),
                getDepartment_name(),
                getWork_hours(),
                getOvertime_hours(),
                getManager_name(),
                getAssistent_name(),
                getGuardian_name(),
                getMeeting_number(),
                getSkills(),
                getScholarship(),
                getScholarship_value(),
                getMonthly_consuption()
        );
        System.out.println(result);
    }
}
