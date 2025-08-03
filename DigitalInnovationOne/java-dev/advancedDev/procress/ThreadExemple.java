package advancedDev.procress;

/**
 * ThreadExemple
 */
public class ThreadExemple
{
    public static void main(String[] args)
    {
        Functionality name = new Functionality();
        Starter nameStart = new Starter(name, "name");

        name.start();
        nameStart.start();
    }
}

class Functionality extends Thread
{
    @Override
    public void run()
    {
        try
        {
            System.out.printf("%s%n%n", "Doing something...");
            Thread.sleep(420);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.printf("%s%n%n", "Executed!");
    }
}

class Starter extends Thread
{
    private Thread functionalityStarter;
    private String action;

    public Starter(Thread functionality, String action)
    {
        this.functionalityStarter = functionality;
        this.action = action;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(1000);
                if (!functionalityStarter.isAlive()) break;
                System.out.printf("%s... %n", this.action);
            } catch (InterruptedException exeception) {
                exeception.printStackTrace();
            }
        }
    }
}