//Joshua Isaacson

import java.util.Scanner;
import de.vandermeer.asciitable.*;
import javafx.scene.text.TextAlignment;


public class ExerciseUI {
    public static void main(String[] args) {
        //creating scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("                                   ,----, \n" +
                "         ,---._                  ,/   .`| \n" +
                "       .-- -.' \\     ,---,.    ,`   .'  : \n" +
                "       |    |   :  ,'  .' |  ;    ;     / \n" +
                "       :    ;   |,---.'   |.'___,/    ,'  \n" +
                "       :        ||   |   .'|    :     |   \n" +
                "       |    :   ::   :  |-,;    |.';  ;   \n" +
                "       :         :   |  ;/|`----'  |  |   \n" +
                "       |    ;   ||   :   .'    '   :  ;   \n" +
                "   ___ l         |   |  |-,    |   |  '   \n" +
                " /    /\\    J   :'   :  ;/|    '   :  |   \n" +
                "/  ../  `..-    ,|   |    \\    ;   |.'    \n" +
                "\\    \\         ; |   :   .'    '---'      \n" +
                " \\    \\      ,'  |   | ,'                 \n" +
                "  \"---....--'    `----'                   \n" +
                "                                           \n" +
                "                                           \n" +
                "                                           ");
        System.out.println("JET is a Command Line Interface (CLI) for tracking your exercise.\n" +
                "\n" +
                "To start:\n" +
                "\n" +
                "1. Create an Exercise object and set its name.\n" +
                "    Ex:\n" +
                "       Exercise ex1 = new Exercise(exerciseName);\n" +
                "\n" +
                "2. Set Methods:\n" +
                "\n" +
                "    setName()\n" +
                "    setWeight()\n" +
                "    changeSets()\n" +
                "    changeReps()\n" +
                "    setDay()\n" +
                "    setNotes()\n" +
                "\n" +
                "3. Get Methods:\n" +
                "\n" +
                "    getExercise()\n" +
                "    getWeight()\n" +
                "    getSets()\n" +
                "    getReps()\n" +
                "    getDay()\n" +
                "    getNotes()\n" +
                "\n" +
                "4. Special Methods:\n" +
                "\n" +
                "    add()\n" +
                "    clear()\n" +
                "    viewMyList()\n");
    }
}
