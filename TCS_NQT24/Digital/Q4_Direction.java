package TCS_NQT24.Digital;
import  java.util.*;
public class Q4_Direction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
        }
        if(x==0 && y==0){
            System.out.println("Returned successfully");
        }else {
            System.out.println("Not returned successfully");
        }

    }
}


/*
Find out whether the jet plane returns to the same position from where it took off.

Problem Statement
=================
Most modern aircrafts are equipped with an autopilot system – one of the most useful features in fighter jets.
In the beta testing of autopilot mode, one of the inputs is a string of literals containing the directions,
which is fed into the flight computer before the take-off.The jet plane is put on an auto-landing mode that enables the plane to land automatically once all the directions in the string are complete.
Given the directions in the string “str”, the task here is to find out whether the jet plane returns to the same position from where it took off.

Each direction in the string changes at an interval of 1 minute(1< =i<= N), where N is the number of directions in the input string.
The directions are North (N), South(S), West(W) and East(E).
Output:

“Returned successfully”, if the plane returns to the starting position.
“Not returned successfully”, if the plane does not return to the starting position.
Example 1: Input: NESW Output: Returned successfully

Example 2: Input: NNWESW. Output: Not returned successfully
 */