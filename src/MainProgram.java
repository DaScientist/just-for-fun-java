import college.*;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Address myAdd = new Address(
                "A-203, Zainee Residency",
                "Near Sardar estate water tank",
                "Vadodara",
                "Gujarat",
                "India",
                "Earth",
                "Milky Way"
        );
        Student mustan = new Student(
                myAdd,
                "Mustanseer Sakerwala",
                "20-03-1999",
                4,
                "170410107097"
        );

        Employee kss = new Professor(
                myAdd,
                "Keyur Suthar Sir",
                "14-02-1968",
                70000,
                "DS"
        );
        Employee kanukaka = new Pune(
                myAdd,
                "Kanu Kaka",
                "26-01-1945",
                25000
        );


        System.out.println(kss.getSalary());
        System.out.println(kanukaka.getSalary());
    }
}
