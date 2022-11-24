public class StringMethods {
    public static void main(String[] args) {
        String myName = "Timothy Unkert";
        // print out the length of my string
        System.out.println(myName.length());
        String myWebsite = "https://unkertmedia.com";
        // convert the string to uppercase
        System.out.println(myWebsite.toUpperCase());
        // notice uppercase does not persist
        System.out.println(myWebsite);
        // we can capitalize - although this is a little verbose
        System.out.println(myWebsite.substring(0, 1).toUpperCase() + myWebsite.substring(1));
        // print the character at index 5
        System.out.println(myWebsite.charAt(5));
        // concatenate one string onto another
        System.out.println(myWebsite.concat(" is a great website!"));
        // another way to concatenate ...
        System.out.println(myWebsite + " is an awesome website!");
        // there are other string methods, explore ...
    }
}
