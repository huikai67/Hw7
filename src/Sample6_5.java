public class Sample6_5 {
    public static void main(String[] args)
    {
        Car6_5 car1 = new Car6_5("1號車");
        car1.start();

        try
        {
            car1.join();
        }
        catch (InterruptedException e)
        {
        }


        System.out.println("結束 main() 的處理工作");

    }
}


class Car6_5 extends Thread {
    private String name;

    public Car6_5(String n) {
        name = n;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行" + name + "的處裡工作");
        }
    }
}
