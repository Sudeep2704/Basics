
class Person {

private String Name;
public void SetName(String Name) {
this.Name = Name;
}
public String getName() {
    return Name;
}
}


public class privateBasic {
    public static void main(String[] args) {
        Person p = new Person();
        p.SetName("Altman");
        System.out.println(p.getName());
    }
}
