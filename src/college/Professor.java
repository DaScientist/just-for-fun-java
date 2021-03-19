/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package college;

public class Professor extends Employee {
    public final String Subject;
    public Professor(Address address, String name, String dob, String subject) {
        super(address, name, dob, 50000);
        Subject = subject;
    }
    public Professor(Address address, String name, String dob, int salary, String subject) {
        super(address, name, dob, salary);
        Subject = subject;
        Person a = new Person();

    }

    @Override
    public int getSalary() {
        return 60;
    }
}
