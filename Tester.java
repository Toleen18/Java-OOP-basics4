public class Tester {
    public static void main(String [] args){

        Phone MyPhone = new Phone("Apple",
                "iPhone 13",
                3500.50,
                2025,
                true,
                false,
                true,
                'M',new String[]{"GPS","Color","Bluetooth","Phone Storage","Application"});
        // object 2
        Phone MyPhone2 = new Phone("Samsung",
                "Galaxy S22",
                2300.50,
                2021,
                false,
                true,
                true,
                'L',new String[]{"GPS","Color","Bluetooth","Phone Storage","Application"});
        System.out.println(MyPhone);
        System.out.println("-----------------------------------------");
        System.out.println(MyPhone2);
    }
}
