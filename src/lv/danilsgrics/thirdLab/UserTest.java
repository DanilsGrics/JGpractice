package lv.danilsgrics.thirdLab;

public class UserTest {

    public static void main(String[] args) {

        User testUser = new User("destructor228", "1337");
        testUser.printUser();
        testUser.verifyPassword("1234");
        testUser.verifyPassword("666");
        testUser.verifyPassword("228");
        testUser.verifyPassword("1337");
        testUser.printUser();

        User testUser2 = new User("nagibator666", "qwerty");
        testUser2.printUser();
        testUser2.verifyPassword("1234");
        testUser2.printUser();
        testUser2.verifyPassword("qwerty");
        testUser2.printUser();
    }
}
