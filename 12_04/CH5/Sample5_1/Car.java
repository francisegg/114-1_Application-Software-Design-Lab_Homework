class Car
{
    private int num;
    private double gas;
    
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
        System.out.println("汽油量是" + num);
    }
}
