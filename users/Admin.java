package library.users;

public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "Admin";
    }

    public void manageResources() {
        System.out.println("Managing library resources...");
    }
}
