// package advancedDev.interfacesFunctional;

// import java.util.function.Supplier;

// public class Suppliers
// {
//     public static void main(String[] args)
//     {
//         // Supplier<Human> CreateHuman = Human::new;
//         Supplier<Human> CreateHuman = (name, age) -> new Human(name, age);

//         System.out.println(CreateHuman.get());
//     }
// }

// class Human
// {
//     private String name;
//     private Integer age;

//     public Human(final String name, final Integer age)
//     {
//         this.name = name;
//         this.age = age;
//     }

//     @Override
//     public String toString()
//     {
//         return age > 1 ? String.format("%s is %d year's old.", this.name, this.age) : String.format("%s is %d year old.", this.name, this.age);
//     }
// }