public class Student extends User implements Notifiable {
    private String studentCode;
    private String academicProgram;

    public Student(String identification, String name, String email,
                   String studentCode, String academicProgram) {
        super(identification, name, email);
        this.studentCode = studentCode;
        this.academicProgram = academicProgram;
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("Notification for student " + getName() + ": " + message);
    }
}
