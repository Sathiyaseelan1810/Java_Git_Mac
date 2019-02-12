package Java_Package;

import java.util.ArrayList;
import java.util.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Program3_List {

    static Logger logger = LogManager.getLogger(Program3_List.class);

    public static void main(String[] args) {

       //Declare Array:

        int[] arr = {10,11,12,13,14};
        int[] art = {10,11,12,13,14};
        logger.error("this is error");
        logger.info("This is info");

        String[] arrs = {"First","Second","Third","Fourth","fifth"};

        int j = 0;
        for(int ar:arr)
        {
            System.out.println("The array of " + arrs[j]+ " element is" + "=" +ar);
         j=j+1;
        }

        for (int p=0;p<art.length;p++)

        {
            if (arr[p]==art[p])
            {
                System.out.println(arr[p]+"="+art[p]);
            }
            else
            {
                System.out.println(arr[p]+"!="+art[p]);
            }

        }



    }


}
