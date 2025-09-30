import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class abc {
    public static void main (String []args ){

Scanner scanner = new Scanner(System.in);
//creating  a 1d array of questions 
//creating a 2d array of options 
//creating a 1d array of solutions

String [] questions = {"1.What is the biggest planet in the solar system :",
"2.which is the fastest animal ever :",
"3.which is the pastest bird ever :",
"4.which is the fastest insect ever :",
"5.which is the fastest human ever :"};

String [] [] options = {{"1.Earth","2.Jupiter","3.Pluto","4.Venus"},{"1.Lion" , "2.Tiger" ,"3.Cheetah","4.Sloth"},
{"1.sparrow","2.Peacock","3.Ostrich","4.Perigrine Falcon"},{"1.Dragonfly","2.Earthworm","3.Housefly","4.Beetle"},
{"1.Donald Trump","2.Usain Bolt","3.Miguel O' Hara","4.Milkha Singh"}};

int [] answers = {2,3,4,1,2} ;  

int score = 0 ; 
int opt ; 
for (int i = 0; i<questions.length;i++){
    System.out.println("\n"+ questions[i]);

    for (String option:options[i]){
        System.out.println(option);
    }

System.out.println("Please enter your choice : ");
opt = scanner.nextInt();  

if(opt == answers[i]){
    System.out.print("Correct ANSWER !!!" + "\n"); 
    score ++ ; 
     
}
else{
    System.out.print("Wrong ANSWER !!!" + "\n");
}
}

System.out.println("After all questions..your score is.."+ score+" Out of "+ questions.length+" Questions");



    }
}
