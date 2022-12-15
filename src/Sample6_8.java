public class Sample6_8 {
    public static void main(String[] args)
    {
        Company6_8 cmp = new Company6_8();

        Driver6_8 drv1 = new Driver6_8(cmp);
        drv1.name = "D1";
        drv1.start();

        Driver6_8 drv2 = new Driver6_8(cmp);
        drv2.name = "D2";
        drv2.start();
    }
}

class Company6_8
{
    private int sum=0;
    public synchronized void add(String nm, int a)
    {
        int tmp = sum;
        System.out.println("目前的合計金額是"+tmp+"元");
        System.out.println(nm+"賺到"+a+"元");
        tmp = tmp+a;
        System.out.println("合計金額是"+tmp+"元");
        sum = tmp;
    }
}

class Driver6_8 extends Thread
{
    private Company6_8 comp;
    public String name;
    public Driver6_8(Company6_8 c)
    {
        comp=c;
    }
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            comp.add(name,50);
        }
    }


}


