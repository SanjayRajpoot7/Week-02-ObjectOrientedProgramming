public class Person {


    String name;
    String city;
    int age;


    public Person(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }


    public Person(Person otherPerson){
        this.name  = otherPerson.name;
        this.city = otherPerson.city;
        this.age = otherPerson.age;
    }


    public void display(){
        System.out.println("Person name is: "+name+" \tcity: "+city+" \tand age is: "+age);
    }


    public static void main(String[] args) {
        Person person = new Person("Sanjay","Bhopal",23);
        Person person2 = new Person(person);


        person.display();
        person2.display();
    }
}
