package passport;

public class CustomerDetails {
    private String name;
    private String address;
    private int age;
    PassPortDetails pp;

    public CustomerDetails(String name, String address, int age,PassPortDetails pp) {
        this.name=name;
        this.address=address;
        this.age=age;
        this.pp=pp;



    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", pp=" + pp +
                '}';
    }
}