import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(
            "1001",
            "Juan",
            "juan@example.com",
            "ST001",
            "Software Engineering"
        );

        Book book = new Book("Clean Code", "9780132350884");
        Copy copy = new Copy("CP001", book);

        Loan loan = new Loan(
            student,
            copy,
            LocalDate.of(2026, 10, 10)
        );

        System.out.println("=== VALID RENEWAL ===");

        try {
            loan.renew(LocalDate.of(2026, 10, 20));
            System.out.println("Renewal successful.");
            System.out.println("New return date: " + loan.getExpectedReturnDate());
        } catch (IllegalArgumentException e) {
            System.out.println("Renewal failed: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== INVALID RENEWAL ===");

        try {
            loan.renew(LocalDate.of(2026, 10, 15));
            System.out.println("Renewal successful.");
        } catch (IllegalArgumentException e) {
            System.out.println("Renewal rejected: " + e.getMessage());
        }
    }
}
