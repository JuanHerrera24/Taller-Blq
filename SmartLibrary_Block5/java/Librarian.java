public class Librarian extends User {
    private String employeeCode;

    public Librarian(String identification, String name, String email,
                     String employeeCode) {
        super(identification, name, email);
        this.employeeCode = employeeCode;
    }
}
