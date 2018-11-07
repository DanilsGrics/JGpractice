package lv.danilsgrics.thirdLab;

public class User {
    private String nickname;
    private String password;
    private int loginAttemptsLeft = 3;
    private boolean blocked;

    User(String Nickname, String Password) {
        setNickname(Nickname);
        setPassword(Password);
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    public boolean getBlockedState() {
        return blocked;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginAttemptsLeft(int loginAttemptsLeft) {
        this.loginAttemptsLeft = loginAttemptsLeft;
    }

    public void setBlockedState(boolean blocked) {
        this.blocked = true;
    }

    public boolean verifyPassword(String password) {
        if (!password.equals(getPassword()) && getBlockedState() != true) {
            setLoginAttemptsLeft(getLoginAttemptsLeft() - 1);
            System.out.println(getNickname() + ", password is incorrect! " + getLoginAttemptsLeft() + " enter attempts left!");
        }

        if (password.equals(getPassword()) && getBlockedState() != true) {
            setLoginAttemptsLeft(3);
            System.out.println(getNickname() + ", password is correct, all enter attempts are restored!");
            return true;
        }

        if (getLoginAttemptsLeft() == 0) {
            setBlockedState(true);
            System.out.println(getNickname() + ", your account is blocked!");
        }

        return false;
    }

    public void printUser() {
        System.out.println("\nInformation about user " + getNickname() + "\n" +
                "Password: " + getPassword() + "\nLogin Attempts left: " + getLoginAttemptsLeft() +
                "\nIs blocked: " + getBlockedState() + "\n");
    }
}

