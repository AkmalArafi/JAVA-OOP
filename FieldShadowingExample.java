public class FieldShadowingExample{
    String name = "Akmal Arrafi";
    int age = 21;
    public void display (){
        String name = "Arrafiq";
        int age = 20;
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("nane: " + this.name);
        System.out.println("age: " + this.age);
    }
    public static void main(String args[]){
        new FieldShadowingExample().display();
    }
}