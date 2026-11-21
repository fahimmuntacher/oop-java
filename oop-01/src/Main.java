public class Main{
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        t1.gender = "Male";
        t1.name = "Mustafizur Rahman";
        t1.phone = 161215555;
        System.out.println("Name: "+ t1.name);
        System.out.println("Phone: " + t1.phone);
        System.out.println("Gender: " +t1.gender);

        Teacher t2 = new Teacher();
        t2.gender = "Female";
        t2.name = "Rabeya Khatun";
        t2.phone = 1877556655;
        System.out.println("Name: "+ t2.name);
        System.out.println("Phone: " + t2.phone);
        System.out.println("Gender: " +t2.gender);
    }
}