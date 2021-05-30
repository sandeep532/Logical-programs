  
import java.util.*;

public class Stopwatch
{

  public static void main (String[]args)
  {

long startTime = System.currentTimeMillis();
for(int i=0;i<500000;i++);
long endTime = System.currentTimeMillis();
long elapsedTime = endTime - startTime;
System.out.println(elapsedTime);
  }
}