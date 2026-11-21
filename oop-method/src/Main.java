public class Main{
    public static  void main(String[] args){
        Teacher t1 = new Teacher();
//        t1.name = "Fahim";
//        t1.gender = "Male";
//        t1.phone  = 162211555;
        t1.insertDetails("Mehedi Sir", "Male", 1666555555);
        t1.displayInfo();
    }
}