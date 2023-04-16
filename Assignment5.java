import java.util.GregorianCalendar;

public class Assignment5 {
    public static void main(String[] args) {

        Person person = new Person("Ashraf", "439 N Sprigg", "0192335446", "ashraf&@gmail.com");
        System.out.println(person.toString());

        System.out.println();
        Student student = new Student("Jyback", "320 N Brooklyn", "5738987996", "jyback@hotmail.com", Student.FRESHMAN);
        System.out.println(student.toString());

        System.out.println();
        Employee employee = new Employee("Harry", "Manchester Road", "7879098995", "harry@yahoo.com", 910, 60000);
        System.out.println(employee.toString());

        System.out.println();
        Faculty faculty = new Faculty("Jackie", "340 N Center", "63688899999", "jackie@gmail.com", 101, 40000, "4pm to 6pm", "Professor");
        System.out.println(faculty.toString());

        System.out.println();
        Staff staff = new Staff("Abdul", "100 Weldeon Street", "2035345533", "abdul@microsoft.com", 12, 70000, "Product Manager");
        System.out.println(staff.toString());
    }
}
class Person{
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(){
        this("Unknown","Unknown","Unknown","Unknown");
    }
    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Name: "+name+"\nAddress: "+address+"\nPhone Number: "+phone+"\nEmail address: "+email;
    }
}
class Student extends Person{
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;

    public Student(String name, String address, String phone, String email, int status){
        super(name, address, phone, email);
        this.status = status;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public String getStatus(){
        switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "Unknown";
        }
    }
    public String toString(){
        return super.toString()+"\nStatus: "+getStatus();
    }
}

class Employee extends Person{
    private int office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phone, String email, int office, double salary){
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }
    public int getOffice(){
        return office;
    }
    public void setOffice(int office){
        this.office = office;
    }
    public String getSalary(){
        return String.format("%.2f", salary);
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
    }
    public void setDateHired(){
        dateHired = new MyDate();
    }
    public String toString() {
        return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}

class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, int office, double salary, String officeHours, String rank){
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String getOfficeHours(){
        return officeHours;
    }
    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }
    public String getRank(){
        return rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }

    public String toString(){
        return super.toString() + "\nOffice Hours: "+officeHours+ "\nRank: "+rank;
    }
}

class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phone, String email, int office, double salary, String title){
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String toString(){
        return super.toString()+ "\nTitle: "+ title;
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public String getMonth(){
        String m = String.valueOf(month + 1);
        return (month < 10 ? ("0" + m) : m);
    }
    public String getDay(){
        String d = String.valueOf(day);
        return (day < 10 ? ("0" + d) : d);
    }
    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}