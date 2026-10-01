import java.time.LocalDate;

public class Renewal {
    private LocalDate renewalDate;
    private LocalDate previousDueDate;
    private LocalDate newDueDate;

    public Renewal(LocalDate renewalDate, LocalDate previousDueDate, LocalDate newDueDate) {
        this.renewalDate = renewalDate;
        this.previousDueDate = previousDueDate;
        this.newDueDate = newDueDate;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public LocalDate getPreviousDueDate() {
        return previousDueDate;
    }

    public LocalDate getNewDueDate() {
        return newDueDate;
    }
}
