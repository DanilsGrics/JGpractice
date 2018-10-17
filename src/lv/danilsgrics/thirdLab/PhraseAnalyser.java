package lv.danilsgrics.thirdLab;

public class PhraseAnalyser {
    String analyse(String phrase) {
        if (phrase.startsWith("Make") && phrase.endsWith("great again")) {
            return "It stands no chance..";
        }

        if (phrase.startsWith("Make") || phrase.endsWith("great again")) {
            return "It could be worse";
        }

        return "It is fine, really";
    }
}
