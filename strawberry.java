/*
* Created by Justin C.
* Last Edited: October 4th, 2026
* Using a bunch of string functions along with note taking
*/

class Main {
    public static void main(String[] args) {

        //Defining my fruits :D
        String fruit = "Strawberry";
        String fruit2 = "Apricot";

        //====================================

        char firstLetter = fruit.charAt(0); 
        //Finds the first letter
        int fruitLengthWord = fruit.length(); 
        //Finds the length of the string

        System.out.println("First letter: " + firstLetter);
        System.out.println("Word Length: " + fruitLengthWord);
        System.out.println("");

        //====================================

        int comparison1 = fruit.compareTo(fruit2); 
        // Compares first letter of each
        int comparison2 = fruit2.compareTo(fruit);
        // Compares the letter of the string mentioned first

        int comparison3 = fruit.compareTo("Strawberries");
        // If starts with the same letter, compares the next index of the letter in the word

        //Would return 0 if they are the same word ;p

        System.out.println("Comparing 'Strawberry' to 'Apricot': " + comparison1);
        System.out.println("Comparing 'Apriot' to 'Strawberry': " + comparison2);
        System.out.println("Comparing 'Strawberry' to 'Strawberries': " + comparison3);
        System.out.println("");

        //====================================

        //Comparing strings case sensitivly
        boolean isEqual1 = fruit.equals("Strawberry");
        boolean isEqual2 = fruit.equals("STRAWBERRY");

        System.out.println("Does 'Strawberry' equal 'Strawberry'? : " + isEqual1);
        System.out.println("Does 'Strawberry' equal 'STRAWBERRY'? : " + isEqual2);
        System.out.println("");

        //====================================

        //Comparing strings non-case sensitivly 
        boolean kindaEqual = fruit.equalsIgnoreCase("STRAWBERRY");
        boolean kindaEqual2 = fruit.equalsIgnoreCase(fruit2);

        System.out.println("Is 'Strawberry' the same word as 'STRAWBERRY'? : " + kindaEqual);
        System.out.println("Is 'Starwberry' the same word as 'Apricot'? : " + kindaEqual2);
        System.out.println("");

        //====================================

        int whereInString = fruit.indexOf("S");
        int whereInString2 = fruit.indexOf("s");
        int whereInString3 = fruit.indexOf("r");
        int whereInString4 = fruit.indexOf("berry");

        System.out.println("'S' appears in the " + whereInString + "th index of the word 'Strawberry'");
        System.out.println("'s' isn't in the word 'Strawberry' (case sensitive), so returns: " + whereInString2);
        System.out.println("The first instance of 'r' appears in the " + whereInString3 + "th index of the word 'Strawberry'");
        System.out.println("'berry' appears in the " + whereInString4 + "th index of the word 'Strawberry'");
        System.out.println("");

        //====================================

        int whenInString = fruit.indexOf("r", 2);
        int whenInString2 = fruit.indexOf("r", 7);
        int whenInString3 = fruit.indexOf("r", 9);

        System.out.println("Starting at the 2nd index, 'r' is found at the " + whenInString + "th index");
        System.out.println("Starting at the 7th index, 'r' is found at the " + whenInString2 + "th index");
        System.out.println("'r' is not found in the word 'Strawberry' after the 9th index, returns: " + whenInString3);
        System.out.println("");

        //====================================

        String pluralBerries = fruit.replace("y", "ies");

        System.out.println("To pluralize 'Strawberry', replace the 'y' with 'ies' to get: " + pluralBerries);
        System.out.println("");

        //====================================

        String firstPart = fruit.substring(0, 5);
        String secondPart = fruit.substring(5, 10);
        String secondPart2 = fruit.substring(5, fruit.length());
        String secondPart3 = fruit.substring(5);

        System.out.println("Strawberry is a compound word in English, and broken up into 2 parts:");
        System.out.println("First Part (modifier): " + firstPart);
        System.out.println("Second Part (head): " + secondPart);
        System.out.println("");

        System.out.println("The following exists as an example for the 2nd part as well (read code): ");
        System.out.println(secondPart2);
        System.out.println(secondPart3);
        System.out.println("=== End Following ===");
        System.out.println("");

        //====================================

        String screamingBerry = fruit.toUpperCase();
        String whisperingBerry = fruit.toLowerCase();

        System.out.println("You scream, I scream, We all scream: " + screamingBerry + "!");
        System.out.println("We're in a library, but do you want a " + whisperingBerry + "?");
        System.out.println("");

        //====================================
    }
}
