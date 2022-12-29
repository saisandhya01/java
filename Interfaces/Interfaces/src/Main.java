public class Main {
    public static void main(String[] args) {
        Itelephone timsPhone;
        timsPhone = new DeskPhone(3245);
        timsPhone.powerOn();
        timsPhone.callPhone(1236);
        timsPhone.answer();

        System.out.println("=========");

        timsPhone = new MobilePhone(2546);
        timsPhone.powerOn();
        timsPhone.callPhone(2456);
        timsPhone.answer();
    }
}