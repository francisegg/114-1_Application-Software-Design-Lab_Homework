public class Sample4_5
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new RacingCar();
        
        car1.setCar(1234, 20.5);
        
        car1.show();
    }
}

class Car
{
    protected int num;
    protected double gas;
    
    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("汽車誕生了");
    }
    
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("駕駛編號" + num + "，汽油量設定" + gas);
    }
    
    public void show()
    {
        System.out.println("車牌編號" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar extends Car
{
    private int course;
    
    public RacingCar()
    {
        course = 0;
        System.out.println("賽車誕生了");
    }
    
    public void setCourse(int c)
    {
        course = c;
        System.out.println("跑道運線編號為" + course);
    }
    
    public void show()
    {
        System.out.println("賽車的編號" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車運線編號" + course);
    }
}
