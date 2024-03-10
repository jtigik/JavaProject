
/*Let’s create an elegant Java class that demonstrates the use of enums and
incorporates OOPs concepts. We’ll create an enum called DayOfWeek to represent
the days of the week, and then use it in a class to showcase encapsulation and
abstraction.*/

package br.com.jtsilva.tipos;

public enum DayOfWeek {
    MONDAY("Start of the week"),
    TUESDAY("Second day"),
    WEDNESDAY("Middle of the week"),
    THURSDAY("Almost there"),
    FRIDAY("Weekend approaching"),
    SATURDAY("Weekend!"),
    SUNDAY("Last day of the week");

    private final String description;

    // Constructor for enum constants
    DayOfWeek(String description) {
        this.description = description;
    }

    // Getter method for description
    public String getDescription() {
        return description;
    }
}
