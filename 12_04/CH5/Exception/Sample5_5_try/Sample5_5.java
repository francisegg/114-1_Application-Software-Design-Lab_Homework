package Exception.Sample5_5_try;

class Sample5_5 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        try {
            // 呼叫此方法可能會拋出例外，所以包在 try 裡面
            car1.setCar(1234, -10.0);
        } catch (CarException e) {
            // 當例外發生時，會執行這裡的程式碼
            System.out.println("拋出" + e + "了");
        }

        // 最後顯示車子狀態
        car1.show();
    }
}
class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("已生產了汽車");
    }

    // 在方法宣告後方加上 "throws CarException"，表示此方法可能會拋出例外
    public void setCar(int n, double g) throws CarException {
        if (g < 0) {
            // 如果汽油量小於 0，建立並拋出例外物件
            CarException e = new CarException();
            throw e;
        } else {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + "，汽油量設為" + gas);
        }
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class CarException extends Exception {
}