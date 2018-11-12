package lv.danilsgrics.sixthLab;

public class IsPalindrome {

    public Boolean isPalindrome(String suggestedWord) {

        suggestedWord =
                suggestedWord
                        .toLowerCase()
                        .replace(" ", "");

        int halfOfString;

        if (suggestedWord.length() % 2 == 0) {

            halfOfString = suggestedWord.length() / 2;

            for (int i = 0; i < halfOfString; i++) {

                if (suggestedWord.charAt(i) == suggestedWord.charAt(suggestedWord.length() - 1 - i)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        if (suggestedWord.length() % 2 == 1) {

            halfOfString = (suggestedWord.length() - 1) / 2;

            for (int i = 0; i < halfOfString; i++) {

                if (suggestedWord.charAt(i) == suggestedWord.charAt(suggestedWord.length() - 1 - i)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
