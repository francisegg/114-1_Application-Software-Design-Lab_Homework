public class Sample4_10
{
    public static void main(String[] args)
    {
        Vehicle[] vc = new Vehicle[2];
        
        vc[0] = new Car(1234, 20.5);
        vc[0].setSpeed(60);
        
        vc[1] = new Plane(232);
        vc[1].setSpeed(500);
        
        for(int i = 0; i < vc.length; i++)
        {
            vc[i].show();
        }
    }
}

abstract class Vehicle
{
    protected int speed;
    
    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("速度設定為" + speed + "了");
    }
    
    abstract void show();
}

class Car extends Vehicle
{
    private int num;
    private double gas;
    
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("汽車誕生編號為" + num + "，汽油量" + gas + "的車子");
    }
    
    public void show()
    {
        System.out.println("車牌編號" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

class Plane extends Vehicle
{
    private int flight;
    
    public Plane(int f)
    {
        flight = f;
        System.out.println("飛機誕生了");
    }
    
    public void show()
    {
        System.out.println("飛行高度為" + flight);
        System.out.println("速度是" + speed);
    }
}
