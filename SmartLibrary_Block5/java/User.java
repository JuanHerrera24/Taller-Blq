public abstract class User {
    private String identification;
    private String name;
    private String email;

    public User(String identification, String name, String email) {
        this.identification = identification;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}
