package Tutorial23_Enums_UserRoles;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String roleInput;
        String dayInput;
        boolean isExit = false;
        boolean isAvailable;

        // ✅ Store availability for each day here
        Map<Day, Boolean> dayAvailabilityMap = new HashMap<>();

        while (!isExit) {
            System.out.println("\nAre you ADMIN or USER or type EXIT to quit: ");
            roleInput = s.nextLine().toUpperCase();

            if (roleInput.equals("EXIT")) {
                System.out.println("Exiting program. Goodbye!");
                isExit = true;
            } else {
                try {
                    UserRole role = UserRole.valueOf(roleInput);

                    if (role == UserRole.ADMIN) {
                        System.out.print("Enter day (e.g., MONDAY) or type EXIT to quit: ");
                        dayInput = s.nextLine().toUpperCase();

                        if (dayInput.equals("EXIT")) {
                            isExit = true;
                            break;
                        }

                        try {
                            Day selectedDay = Day.valueOf(dayInput); // validate day
                            System.out.print("Type 'Available' or 'Not Available': ");
                            String availability = s.nextLine();

                            if (availability.equalsIgnoreCase("Available")) {
                                isAvailable = true;
                            } else if (availability.equalsIgnoreCase("Not Available")) {
                                isAvailable = false;
                            } else {
                                System.out.println("Invalid availability input.");
                                continue;
                            }

                            // ✅ Save to map
                            dayAvailabilityMap.put(selectedDay, isAvailable);
                            System.out.println("✅ " + selectedDay + " is set to " + (isAvailable ? "Available" : "Not Available"));

                        } catch (IllegalArgumentException e) {
                            System.out.println("❌ Invalid day input.");
                        }

                    } else if (role == UserRole.USER) {
                        System.out.print("Enter day you want to check availability: ");
                        dayInput = s.nextLine().toUpperCase();

                        try {
                            Day selectedDay = Day.valueOf(dayInput); // validate day

                            if (dayAvailabilityMap.containsKey(selectedDay)) {
                                boolean available = dayAvailabilityMap.get(selectedDay);
                                System.out.println("✅ " + selectedDay + " is " + (available ? "Available" : "Not Available"));
                            } else {
                                System.out.println("⚠️ No availability info yet for " + selectedDay);
                            }

                        } catch (IllegalArgumentException e) {
                            System.out.println("❌ Invalid day input.");
                        }
                    }

                } catch (IllegalArgumentException e) {
                    System.out.println("❌ Invalid role. Please enter ADMIN or USER.");
                }
            }
        }

        s.close();
    }
}
