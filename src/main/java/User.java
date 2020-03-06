import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String login;
    private String pass;
    private String email;
    private String sexuality;

    public User(String login, String pass, String email, String sexuality) {
        this.login = login;
        this.pass = pass;
        this.email = email;
        this.sexuality = sexuality;
    }
}
