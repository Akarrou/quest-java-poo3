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
        if (!this.flying && this.altitude == 0);
        this.flying = true;
        System.out.printf( "s% deploys its wings and take off !",this.getName());
    }

    @Override
    public int ascend(int meters) {
        if (isFlying()) {
            this.altitude += meters;
            System.out.printf("s% ascended to the height of s%" ,this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (isFlying()) {
            this.altitude += -meters;
            System.out.printf("s% descended to the height of s%" ,this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (isFlying() && this.altitude == 1) {
            System.out.printf("s% landed on the ground",this.getName());
        } else {
            
            System.out.printf(" s%you are in flight continue to decend s%)",this.getName());
        }

    }
}