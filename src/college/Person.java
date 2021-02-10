package college;

import java.util.Date;

public class Person {
    final Address address;
    final String name;
    final String dob;

    public Person(Address address, String name, String dob) {
        this.address = address;
        this.name = name;
        this.dob = dob;
    }

    public int getAge() {
        /**
         * DOB Format: DD-MM-YYYY
         * */
        String[] dateValues = dob.split("-");
        int date = Integer.parseInt(dateValues[0]);
        int month = Integer.parseInt(dateValues[1]);
        int year = Integer.parseInt(dateValues[2]);
        Date today = new Date();
        int todayDate = today.getDate();
        int todayMonth = today.getMonth() + 1;
        int todayYear = today.getYear() + 1900;
        if(month - todayMonth < 0) {
            if(date - todayDate < 0) {
                return todayYear - year;
            }
        }
        return todayYear - year - 1;
    }

}
