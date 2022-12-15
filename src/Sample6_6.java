import pa5_2.Car;

public class Sample6_6 {
    public static void main(String[] args)
    {
        Car6_6 car1 = new Car6_6("一號車");

        Thread th1 = new Thread(car1);
        th1.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("正在進行 main() 的處裡工作");
        }
    }
}

class Car6_6 implements Runnable
{
    private String name;

    public Car6_6(String n)
    {
        name = n;
    }
    public void run()
    {
        for(int i=0;i<5;i++){
            System.out.println("正在進行" + name + "的處裡工作");
        }
    }
}
