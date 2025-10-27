
class vehicle {
    protected int speed;
}

class Bike extends vehicle {
    void setSpeed(int s) {
        speed = s;
    }
    int getSpeed() {
        return speed;
    }
}

public class Protectdemo {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setSpeed(25);
        System.out.println(b.getSpeed());
        vehicle v = new vehicle();
        System.out.println(v.speed);
    }
}
