import java.util.HashMap;

public class IdandPasswords {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IdandPasswords() {
        logininfo.put("Bro", "pizza");
        logininfo.put("Dude", "macaroni");
        logininfo.put("John", "doe");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}