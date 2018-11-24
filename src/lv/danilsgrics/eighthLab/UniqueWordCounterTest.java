package lv.danilsgrics.eighthLab;

public class UniqueWordCounterTest {

    public static void main(String[] args) {

        UniqueWordCounter wordCounter = new UniqueWordCounter();

        wordCounter.addWord("001", "apple");
        wordCounter.addWord("002", "apple");
        wordCounter.addWord("003", "mango");
        wordCounter.addWord("004", "mango");
        wordCounter.addWord("005", "lemon");
        wordCounter.printToConsole();
        wordCounter.getMostPopularEntry();
        wordCounter.addWord("002", "lemon");
        wordCounter.printToConsole();
        wordCounter.getMostPopularEntry();
    }
}
