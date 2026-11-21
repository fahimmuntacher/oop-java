public class Teacher {
    String name, gender;
    int phone;

    void insertDetails(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }

}
