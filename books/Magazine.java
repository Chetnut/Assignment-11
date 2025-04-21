package books;

public class Magazine extends LibraryResource {
    private int issueNumber;

    public Magazine() {
        super();
        this.issueNumber = 0;
    }

    public Magazine(String id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getSummary() {
        return "Magazine: " + title + " (Issue " + issueNumber + ")";
    }

    public void updateIssue(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void updateIssue(int issueNumber, boolean notifyUsers) {
        this.issueNumber = issueNumber;
        if (notifyUsers) {
            System.out.println("Users notified of new issue " + issueNumber);
        }
    }
} 