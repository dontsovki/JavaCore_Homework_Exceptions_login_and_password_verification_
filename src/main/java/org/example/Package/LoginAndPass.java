package org.example.Package;

public class LoginAndPass {
    private String login;
    private String password;
    private String confirmPassword;


    public LoginAndPass(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean IsTrueString(String s) {
        if (s == null || s.isEmpty() || s.length() > 20) {
            return false;
        }
        String s1 = s.replaceAll("[^a-zA-Z0-9_]", "");
        if (s1.equals(s)) {
            return true;
        } else return false;
    }
    //Второй способ проверки строки
    static final String VALID_CHAR = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";

    public static boolean IsTrueString2(String s) {
        if (s == null || s.isEmpty() || s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHAR.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


    public static void IsLogPassTrue
            (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!IsTrueString(login)) {
            throw new WrongLoginException("Логин не верный!");
        }
        if (!IsTrueString(password)) {
            throw new WrongPasswordException("Пароль не верный!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Подтверждение пароля не совпадает!");
        }
        if (IsTrueString(login) && IsTrueString(password) && password.equals(confirmPassword)) {
            System.out.println(true);
        }
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
