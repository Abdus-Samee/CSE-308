package Problem1;

import java.io.BufferedReader;
import java.io.FileReader;

public class CalculateSum {
    public static void getSumWSDelim(String file){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String in = reader.readLine();
            String[] nums = in.split(" ");

            int sum = 0;
            for(int i = 0; i < nums.length; i++) sum += Integer.parseInt(nums[i]);

            System.out.println("Required sum is: " + sum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void getSum(String file, String delim){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String in = reader.readLine();
            String[] nums = in.split(delim);

            int sum = 0;
            for(int i = 0; i < nums.length; i++) sum += Integer.parseInt(nums[i]);

            System.out.println("Required sum is: " + sum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
