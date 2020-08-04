package io.codedifferently;


import java.util.HashMap;
import java.util.Stack;

public class OpenCloseChecker {

    public static boolean openCloseChecker(String input){

        HashMap<Character, Character> openClose = new HashMap<Character, Character>(); // key, value
        Stack<Character> parentheses = new Stack<Character>();
        openClose.put('(', ')'); //matching keys with they values
        openClose.put('[', ']');
        openClose.put('{', '}');
        openClose.put('<', '>');
        openClose.put('"', '"');
        openClose.put('\'','\'');

        char[] characters = input.toCharArray(); //change string input to char array
        for(Character element : characters) { // for each element in char array
            if (openClose.containsKey(element)) { // push key to top of stack
                parentheses.push(element);
            } else if (openClose.containsValue(element)) { // look at the values
                if (!parentheses.empty() && openClose.get(parentheses.peek()) == element) {
                    parentheses.pop(); // remove element from stack
                } else {
                    return false;
                }
            }
        }
        return parentheses.empty();

    }
}