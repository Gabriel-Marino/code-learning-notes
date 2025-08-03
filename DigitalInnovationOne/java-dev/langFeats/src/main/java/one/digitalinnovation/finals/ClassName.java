package langFeats.src.main.java.one.digitalinnovation.finals;

public class ClassName
{
    int num;
    String text;

    public ClassName(final int num, final String text)
    {
        this.num = num;
        this.text = text;
    }

    protected void MethodFinal(final String[] args)
    {
        System.out.print("It's Final");
    }

    protected void MethodNotFinal(String[] args)
    {
        System.out.print("It's not Final");
    }

    public void main(String[] args)
    {
        System.out.printf("It's the final countdown!");
    }
}