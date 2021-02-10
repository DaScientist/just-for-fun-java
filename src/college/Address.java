/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 *
 */

package college;


public class Address {
    private final String line_1;
    private final String line_2;
    private final String city;
    private final String state;
    private final String country;
    private final String planet;
    private final String galaxy;

    public Address(String line_1, String line_2, String city, String state, String country, String planet, String galaxy) {
        this.line_1 = line_1;
        this.line_2 = line_2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.planet = planet;
        this.galaxy = galaxy;
    }

    public String getLine_1() {
        return line_1;
    }
    public String getLine_2() {
        return line_2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPlanet() {
        return planet;
    }

    public String getGalaxy() {
        return galaxy;
    }
}
