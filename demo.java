import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import java.util.*;
class demo
{
    static void time()
    {
        // System.out.println("watch out");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The time is " + dtf.format(now));
    }
    static void whishme() 
    {
        LocalDateTime now = LocalDateTime.now();
        int hour=now.getHour();
        if (hour>=0 && hour<12) 
        {
            System.out.println("Good morning");
        }
        else if(hour>=12 && hour<18)
        {
            System.out.println("Good Afternoon");
        }
        else 
        {
            System.out.println("Good evening");
        }
    }
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        try (Scanner sc = new Scanner(System.in)) 
        {
            whishme();
            System.out.println("welcome sir ");
            System.out.println("how may i help you(type 'help' for commands)");
            while (true) 
            {
                System.out.print("\n > ");
                sc.skip("(\r\n|[\n\r\u0085])?");
                String com = sc.next();
                System.out.print(">> ");
                sc.skip("(\r\n|[\n\r\u0085])?");
                if(com.equals("name")) 
                {
                    System.out.println("rudwig");
                }
                else if(com.equals("work"))
                {
                    System.out.println("penetration");
                }
                else if(com.equals("quit"))
                {
                    System.out.println("fuck offf");
                    break;
                }
                else if(com.equals("time"))
                {
                    time();
                }
                else
                {
                    System.out.println("please give appropriate queries");
                }
                
            }
        }
    }
}