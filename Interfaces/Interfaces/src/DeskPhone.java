public class DeskPhone implements Itelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        System.out.println("No action taken. does not have power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing" + phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == this.myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        }
        else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
