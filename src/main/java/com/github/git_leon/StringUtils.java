package com.github.git_leon;

/**
 * Created by leon on 5/25/17.
 */
public final class StringUtils {
    private StringUtils() {
        /** uninstantiable class */
    }

    /**
     * @param str value to capitalize first character of
     * @return identical string with first character capitalized
     */
    public static String capitalizeFirstChar(String str) {
        String firstCharacter = new Character(str.charAt(0)).toString();
        return str.replaceFirst(firstCharacter, firstCharacter.toUpperCase());
    }

    /**
     * @param string value to be padded
     * @param n amount of padding
     * @return string with left padding
     */
    public static String padLeft(String string, int n) {
        return String.format("%1$" + n + "s", string);
    }

    /**
     * @param string value to be padded
     * @param n amount of padding
     * @return string with right padding
     */
    public static String padRight(String string, int n) {
        return padLeft(string, -n);
    }



    /**
     * removes all specified `removable` characters from base String
     * @param original string to have characters removed from
     * @param removableChars characters to remove from string
     * @return identical string with each of the `removableChars` removed
     */
    public static String removeCharacters(String original, String removableChars) {
        return removeSubstrings(original, removableChars.split(""));
    }

    /**
     * @param baseString value to have characters removed from
     * @param removableStrings sub-strings to remove from base string
     * @return identical string with each of the sub-strings removed
     */
    public static String removeSubstrings(String baseString, String... removableStrings) {
        for (String removableString : removableStrings) {
            baseString = baseString.replace(removableString, "");
        }
        return baseString;
    }

    /**
     * @param str value to be repeated
     * @param n number of times to repeat value
     * @return input `str` value concatenated `n` number of times
     */
    public static String repeatString(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    /**
     * @param number value to get alpha-representation of
     * @return alpha representation of specified integer
     */
    public static String getAlphaValue(long number) {
        StringBuilder sb = new StringBuilder();
        while (number-- > 0) {
            sb.append((char) ('a' + (number % 26)));
            number /= 26;
        }
        return sb.reverse().toString();
    }

    /**
     * @param sequences array of CharSequence objects
     * @return a string of each of the CharSequence objects appended
     */
    public static String mergeCharSequenceArray(CharSequence... sequences) {
        StringBuilder sb = new StringBuilder();
        for (CharSequence sequence : sequences) {
            sb.append(sequence.toString());
        }
        return sb.toString();
    }
}
