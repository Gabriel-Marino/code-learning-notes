package langFeats.src.main.java.one.digitalinnovation.classes.users;

public class SuperUser
{
    private String username;
    private String password;
    String name;

    public SuperUser(final String username, final String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getName() {return name;}
    public String getUser() {return username;}
    protected String getPass() {return password;}
}