public class Person {
    String name;
    String surname;
    String city;
    String phoneNumber;

    public String personInfo(String name, String surname, String city, String phoneNumber) {
        return "Зателефонувати громадянину " + name + " " +
                surname + " із міста " + city + " можна за номером " + phoneNumber + ".";
    }
    public static void main(String[] args) {
    Person person = new Person();
        System.out.println(person.personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(person.personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(person.personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }
}