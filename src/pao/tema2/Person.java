package pao.tema2;

public class Person {

    private String name;
    private String surname;
    private int age;
    private long identity_number;
    private String type;

    public Person() {}
    public Person(String name, String surname, int age, long identity_number, String type){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identity_number = identity_number;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdentity_number() {
        return identity_number;
    }

    public void setIdentity_number(long identity_number) {
        this.identity_number = identity_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String ouptupPerson(){
       return(" [nume persoana]: " + this.getName() + " [prenume persoana]: " + this.getSurname() + " [varsta]: " + this.getAge() + " [cnp]: " + this.getIdentity_number() + " [tip]: " + this.getType());
    }
}
