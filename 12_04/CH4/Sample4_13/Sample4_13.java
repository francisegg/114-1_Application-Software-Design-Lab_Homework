public class Sample4_13
{
    public static void main(String[] args)
    {
        Car car1 = new Car(1234, 20.5);
        car1.vShow();
        car1.mShow();
    }
}

interface iVehicle
{
    void vShow();
}

interface iMaterial
{
    void mShow();
}

class Car implements iVehicle, iMaterial
{
    private int num;
    private double gas;
    
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("汽車誕生編號為" + num + "，汽油量" + gas + "的車子");
    }
    
    public void vShow()
    {
        System.out.println("車牌編號" + num);
        System.out.println("汽油量是" + gas);
    }
    
    public void mShow()
    {
        System.out.println("車子的材料是鐵");
    }
}
