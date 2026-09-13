package Assignment.ClassObject ;

class Animal{
    //age, sex, name, species, and breed.
    String species;
    String breed;
    int age;

}
class User{
        String name;
        int age;
        String gender;

}
class Product{
        int productId;
        String productName;
        Double productPrice;

}

public class Program1 {
    public static void main(String[] args) {

        System.out.println("=================================");

        Animal A1 = new Animal();
        A1.species = "Dog";
        A1.breed = "German";
        A1.age = 15;

        System.out.println(A1.age);

        System.out.println("=================================");

        User U1 = new User();
        U1.name="Aryan";
        U1.age=24;
        U1.gender="Male";

        System.out.println("=================================");

        Product P1= new Product();
        P1.productId=101;
        P1.productName="Guitar";
        P1.productPrice=2456.4;




        
    }
}
