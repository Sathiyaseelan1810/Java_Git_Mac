package Java_Package;

import java.util.ArrayList;

public class Program3_List {

    public static void main(String[] args) {

       //Declare Array:

        int[] arr = {10,11,12,13,14};
        int[] art = {10,11,12,13,14};

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
