package lv.danilsgrics.thirdLab;

public class User {
    private String nickname;
    private String password;
    private int loginAttemptsLeft = 3;
    private boolean blocked = false;

    User (String nickname, String password, int loginAttemptsLeft, boolean blocked) {

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

    public void setBlocked(boolean blocked) {
        this.blocked = true;
    }

   // public boolean verifyPasswordAttemptsLeft(String password) {
  //      if (password != this.password) {
  //          setLoginAttemptsLeft(--);

  //      }
  //  }
}

