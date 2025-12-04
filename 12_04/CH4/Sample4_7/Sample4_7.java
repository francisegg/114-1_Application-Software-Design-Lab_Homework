public class Sample4_7
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();
        car1.setcar(1234, 20.5);
        System.out.println(car1);
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
    
    public void setcar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("駕駛編號" + num + "，汽油量設定" + gas);
    }
    
    public String toString()
    {
        String str = "車牌編號" + num + "、汽油量" + gas;
        return str;
    }
}
