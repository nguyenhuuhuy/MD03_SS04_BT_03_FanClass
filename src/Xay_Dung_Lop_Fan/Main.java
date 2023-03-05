package Xay_Dung_Lop_Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSqeed(fan.FLAST);
        fan.setRadius(10);
        fan.setColor("Yellow");
        fan.setIsOn(true);
        System.out.println("fan ===> " + fan.toString());

        Fan fan2 = new Fan();
        fan2.setSqeed(fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setIsOn(false);

        System.out.println("Fan 2 ====> " + fan2.toString());
    }
}
