package com.github.git_leon.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchGroupTest {
    @Test
    public void test1() {
        String text = "The Quick Brown Fox";
        String patternString = "\\w+";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        MatchGroup matchGroup = new MatchGroup(matcher);

        // when
        System.out.println(matchGroup);
        for(Match match : matchGroup) {
            System.out.println(match.toString());
        }
    }
}
