public class MobilePhone implements Itelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Power button is switched on..");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("now ringing" + phoneNumber);
        }
        else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == this.myNumber && isOn){
            isRinging = true;
            System.out.println("Ring Ring");
        }
        else{
            isRinging = false;
            System.out.println("Cannot call");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
