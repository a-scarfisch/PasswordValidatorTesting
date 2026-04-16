package security;

public class PasswordValidator {
    public boolean validar (String password){
        if (password == null){
            return false;
        }
        return password.length()>= 8;
    }
}

