
public class Sample5_5 {
    public static void main(String[] args) //throws CarException
    {
        Car5_5 car1 = new Car5_5();

        try
        {
            car1.setCar(1234,-20);
        }
        catch (CarException e)
        {
            System.out.println("拋出了"+e+"了");
        }
        car1.show();
/*
        car1.setCar(1234,-20);
        car1.show();
        */
    }
}


class CarException extends Exception
{
}

class Car5_5
{
    private int num;
    private double gas;

    public Car5_5(){
        num=0;
        gas=0;
        System.out.println("已生產了汽車");
    }
    public void setCar(int n,double g) throws CarException
    {

        if(g<0)
        {
            CarException e = new CarException();
            throw e;
        }
        else
        {
            num=n;
            gas=g;
            System.out.println("將車號設為"+num+"汽油量是"+gas);
        }
    }
    public void show(){
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
}
