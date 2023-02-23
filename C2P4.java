/*
 * Pr 2.4
 */

public class C2P4
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 11; i++)
        {
            int result = i * i * i;
            if (result < 10)
                IBIO.output("   " + result);
            else if (result < 100)
                IBIO.output("  " + result);
            else if (result < 1000)
                IBIO.output(" " + result);
            else
                IBIO.output(result);
        }
    }
}
