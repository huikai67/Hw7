public class Sample6_3 {
    public static void main(String[] args)
    {
        Car6_3 car1 = new Car6_3("1號車");
        car1.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("正在進行 main() 的處裡工作");
        }
    }
}

class Car6_3 extends Thread
{
    private String name;

    public Car6_3(String n) {
        name = n;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
                System.out.println("正在進行" + name + "的處裡工作");
            } catch (InterruptedException e) {
            }
        }
    }
}

