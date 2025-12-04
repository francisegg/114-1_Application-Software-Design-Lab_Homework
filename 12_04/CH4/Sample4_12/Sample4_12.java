public class Sample4_12
{
    public static void main(String[] args)
    {
        iVehicle[] ivc;
        ivc = new iVehicle[2];
        
        ivc[0] = new Car(1234, 20.5);
        
        ivc[1] = new Plane(232);
        
        for(int i = 0; i < ivc.length; i++)
        {
            ivc[i].show();
        }
    }
}

interface iVehicle
{
    int weight = 1000;
    void show();
}

class Car implements iVehicle
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
    }
}

class Plane implements iVehicle
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
    }
}
