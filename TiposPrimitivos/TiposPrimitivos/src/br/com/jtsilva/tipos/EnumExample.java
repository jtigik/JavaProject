package br.com.jtsilva.tipos;

public class EnumExample {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.THURSDAY;

        System.out.println("Today is " + today);
        System.out.println("Description: " + today.getDescription());

        // Example of abstraction: We don't need to know the internal representation of
        // the enum constant
        switch (today) {
            case MONDAY:
                System.out.println("Time to start the week!");
                break;
            case FRIDAY:
                System.out.println("TGIF!");
                break;
            default:
                System.out.println("Just another day.");
        }
    }
}
