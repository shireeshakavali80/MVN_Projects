public class Student {
    private String name = "Anusha";

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Student stu1 = new Student();
        System.out.println("Name returned by getName is"+stu1.getName());
    }
}
