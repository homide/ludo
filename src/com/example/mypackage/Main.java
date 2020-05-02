package com.example.mypackage;

import java.util.Random;
import java.util.Scanner;

interface goti{

}

public class Main {

    //This will give us a random number
    public int dice(String go){
        int[] dice_numbers = {1,2,3,4,5,6};
        if(go.equals("go")){
            int num_returned = new Random().nextInt(dice_numbers.length);
            return dice_numbers[num_returned];
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        String cmd = sc.nextLine();
        if(cmd.equals("start")) {
            for (int i = 0; i <10 ; i++){
                String cmd2 = sc.nextLine();
                System.out.println(main.dice(cmd2));
            }
        }
    }
}
