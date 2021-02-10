/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package college;

public class Student extends Person{
    final int year;
    final String enrollment;

    public Student(Address address, String name, String dob, int year, String enrollment) {
        super(address, name, dob);
        this.year = year;
        this.enrollment = enrollment;
    }

    public String getYearCode() {
        String code = "";
        switch (year) {
            case 1: code += "F";
            case 2: code += "S";
            case 3: code += "T";
            case 4: code += "L";
        }
        code += "Y";
        return code;
    }
    public String getDept() {
        String deptCode = enrollment.substring(7,9);
        if(deptCode.equals("07")) {
            return "Computer Department";
        }
        return "None";
    }
}
