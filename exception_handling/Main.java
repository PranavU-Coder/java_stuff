package exception_handling;

import java.util.Scanner;

class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

class CurrentDate {
    int day;
    int month;
    int year;

    public void createDate() throws InvalidDayException, InvalidMonthException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        day = scanner.nextInt();
        if (day < 1 || day > 31) {
            throw new InvalidDayException("Invalid day: " + day);
        }

        System.out.print("Enter month: ");
        month = scanner.nextInt();
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        }

        System.out.print("Enter year: ");
        year = scanner.nextInt();
    }

    public void displayDate() {
        System.out.println("Current Date: " + day + "/" + month + "/" + year);
    }
}

public class Main {
    public static void main(String[] args) {
        CurrentDate date = new CurrentDate();

        try {
            date.createDate();
            date.displayDate();
        } catch (InvalidDayException | InvalidMonthException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
