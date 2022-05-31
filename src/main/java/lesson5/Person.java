package lesson5;

public class Person {
    private String family;
    private String name;
    private String patronymic;
    private String post;
    private String mail;
    private String phoneNumber;
    private int salary;
    public int age;


    public Person(String family, String name, String patronymic, String post, String mail, String phoneNumber, int salary, int age) {
        this.family = family;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo (){
        System.out.printf("Information about person:%n Family: %s%n Name: %s%n Patronymic: %s%n Post: %s%n Mail: %s%n Phone number: %s%n Salary: %d%n Age: %d%n", family,name,patronymic,post,mail,phoneNumber,salary,age );
    }

}
