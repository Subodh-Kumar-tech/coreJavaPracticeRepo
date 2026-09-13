package String_Basic.Concatenation;

public class Program2 {

    public static void main(String[] args) {
        String[] names = {"Mohan", "John", "Mac", "Rohan"};
        for (int i = 0; i < names.length; i++) {

            System.out.println("Length of " + names[i] + " is : " + names[i].length());
        }

        System.out.println("=================================");

        for (int j = 0; j < names.length; j++) {

            System.out.println(names[j] + " starts with : " + names[j].charAt(0));
        }

        System.out.println("===================================");

        for (int k = 0; k < names.length; k++) {

            System.out.println(names[k] + " starts with : " + names[k].charAt(names[k].length() - 1));
        }

        System.out.println("===================================");

        for (int z = 0; z < names.length; z++) {

            System.out.println(names[z].toUpperCase());
        }

    }

}
