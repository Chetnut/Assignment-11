package library.users;

public abstract class User {
    protected String name;
    private String email;
    public static final String DOMAIN = "smartlibrary.org";

    public User() {
        this.name = "Unknown";
        this.email = "unknown@" + DOMAIN;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract String getRole();

    public void login() {
        System.out.println(name + " logged in with " + email);
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }
}