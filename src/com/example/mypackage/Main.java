package com.example.mypackage;

import java.util.Random;
import java.util.Scanner;

//class goti{
//    public void
//}

public class Main {


    //This will give us a random number
    public int dice(String cmd) {
        int[] dice_numbers = {1, 2, 3, 4, 5, 6};
        if(cmd.equals("go")){
            int num_returned = new Random().nextInt(dice_numbers.length);
            return dice_numbers[num_returned];
        }
        else{
            return 0;
        }

    }

    public static void main(String[] args) {
        boolean name = true;
        Main main = new Main();
        while(name){
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();
            if(cmd.equals("go")){
                System.out.println(main.dice(cmd));
            }
            else{
                break;
            }
        }
    }
}
