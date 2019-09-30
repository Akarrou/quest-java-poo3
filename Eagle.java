public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println("takeOff " + this.getName());
    }

    @Override
    public int ascend(int meters) {
        System.out.println("ascend " + this.getName());

        return meters;
    }

    @Override
    public int descend(int meters) {
        System.out.println("descend " + this.getName());
        return meters;
    }

    public void land() {
        System.out.println("land " + this.getName());
    }

    @Override
    public void glide() {
        System.out.println("glide " + this.getName());
    }
}
