public class Main {
    public static void main(String[] args) {
        Dog dog1=new Dog("pluto",11,"male","pink",55.67);
        dog1.displayInfo();

        dog1.setWeight(67.45);
        dog1.setAge(10);

        dog1.displayInfo();

        dog1.setAge(17);
        dog1.displayInfo();

        Pocket pocket1=new Pocket();
        pocket1.setMoney(3000);
        System.out.println(pocket1.getMoney(2000));
        System.out.println(pocket1.getMoney(1000));




    }
}
