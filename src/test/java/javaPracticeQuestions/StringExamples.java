package javaPracticeQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringExamples {
    public static void main(String[] args) {
        String text = "Java 1 and 2a3 and 4e3r2t";
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        //int sum = 0;
        int innerSum = 0;
        while (matcher.find()) {
            System.out.println("Found number : " + matcher.group());
            int num = Integer.parseInt(matcher.group());
            int temp = num;
            while (temp > 0) {
                int rem = temp % 10;
                innerSum += rem;
                temp /= 10;
            }
            //sum += num;
        }
        System.out.println("the sum all the single digit in the number  : " + innerSum);
        //System.out.println("The sum of whole number : " + sum);
    }
}

class EmailRegexExample {
    /*
    * 🔍 Regex Breakdown
[a-zA-Z0-9._%+-]+
Matches the username part (before the @ symbol)
a-zA-Z0-9 → any letter or digit
._%+- → allows dot ., underscore _, percent %, plus +, and hyphen -
+ → one or more of these characters
@
Matches the @ symbol literally
[a-zA-Z0-9.-]+
Matches the domain name (like gmail, yahoo, example)
Allows letters, digits, dots ., and hyphens -
+ → one or more of these characters
\.
Matches a literal dot .
Needs to be escaped as \\. in Java strings
[a-zA-Z]{2,}
Matches the top-level domain (like .com, .org, .in)
Only letters allowed, at least 2 characters long*/
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9%.+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}";
        String email = "test.user@example.com";

        boolean isValid = Pattern.matches(regex, email);
        System.out.println("Is valid: " + isValid); // Output: true
    }
}

class KeywordSearch {
    public static void main(String[] args) {
        String input = "java is a good language and javA is easy to learn and JaVa";
        String keyword = "java";
        Pattern pattern = Pattern.compile(keyword, Pattern.CASE_INSENSITIVE);
        Matcher mather = pattern.matcher(input);
        while (mather.find()) {
            System.out.println("Found keyword : " + mather.group());
        }
    }
}

class DateValidation {
    public static void main(String[] args) {
        String input = "The event will be held on 26/12/2025 or 2025-26-12";
        String regex = "(?:\\d{4}[-/]\\d{2}[-/]\\d{2}|\\d{2}[-/]\\d{2}[-/]\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("The date format is found : " + matcher.group());
        }
    }
}

class HashTagsValidation {
    public static void main(String[] args) {
        String input = "We are trending #weAreTrending isn't it interesting #ApnaSapnaMoneyMoney";
        String regex = "#\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while ((matcher.find())) {
            System.out.println("Found Hashtag : " + matcher.group());
        }
    }
}

class WordOccurrence {
    public static void main(String[] args) {
        String input = "Hello my name is shubham and shUbham is my given name and i like name shubhaM";
        String word = "shubham";
        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("The word " + word + " appears " + count + " times.");
    }
}

class StartingWith {
    public static void main(String[] args) {
        String input = "my name is shubham and i am sure that sun is goings to shine so so bright today, surly";
        String regex = "\\bs\\w*\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        System.out.println("The word which states with s are as follows");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

class RemoveSpecialSymbol {
    public static void main(String[] args) {
        String input = "java !! is very #Fu#n?   ";
        input = input.replaceAll("[^a-zA-z0-9\\s]", "");
        input = input.replaceAll("\\s+", " ").trim();
        System.out.println("Normalised String : " + input);
    }
}

class MultipleReplacement {
    public static void main(String[] args) {
        String text = "java is good and javascript is also good";
        Map<String, String> replacement = new LinkedHashMap<>();
        replacement.put("javascript", "c++");
        replacement.put("java", "python");
        for (Map.Entry<String, String> entry : replacement.entrySet()) {
            text = text.replaceAll(entry.getKey(), entry.getValue());
        }
        System.out.println(text);
    }
}

class EscapeKeyWord {
    public static void main(String[] args) {
        String keyword = "Price+Discount";
        String text = "The Price+Discount is valid today";
        String escapeKeyword = Pattern.quote(keyword);
        String regex = escapeKeyword;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found keyword : " + matcher.group());
        } else {
            System.out.println("The keyword is not matching");
        }
    }
}
