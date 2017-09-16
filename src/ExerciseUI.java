//Joshua Isaacson, Fall 2017

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import de.vandermeer.asciitable.*;
import javafx.scene.text.TextAlignment;

//All the commands in the 'HELP DESK' table will be implemented here.
//They use the business logic implemented in the Exercise class.

public class ExerciseUI {

    //Method intro() returns an introduction screen.
    public static void intro() {
        System.out.println(
                "                                   ,----, \n" +
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
                "+--------------------------------------------------------+\n" +
                "| JET is a command line tool for tracking your exercise. |\n" +
                "+--------------------------------------------------------+\n" +
                "                                           ");
    }

    //Method help() returns all available methods.
    //Parameter: -h
    public static void help() {
        System.out.println(
                   "+---------------------------------------------------------------------------------+\n" +
                   "|                                   HELP DESK                                     |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|                       [ Command ]                       |    [ Explanation ]    |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -h                                                     |  help                 |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -n objectName exercise sets reps weight date notes     |  new exercise object  |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -d objectName                                          |  delete object        |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -c                                                     |  clear all            |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -s                                                     |  builds spreadsheet   |\n" +
                   "+---------------------------------------------------------+-----------------------+\n");
    }

    //Method newExercise() takes in user inputs about an exercise (objName, exerciseName, sets, reps,
    //weight, date, notes) and adds it to the ArrayList, exerciseList.
    //Parameter: -n
    public static void newExercise(Exercise exercise,List input) {
        //TODO
        /*
        (1) create an Exercise object, takes a String exerciseName
        (2) changeSets()
        (3) changeReps()
        (4) setWeight()
        (5) setDate()
        (6) setNotes()
        (7) add the object to the ArrayList, exerciseList
                input.add(exercise);
         */
    }

    //Method deleteExercise() takes in user input for an object name and removes it from the
    //ArrayList, exerciseList.
    //Parameter: -d
    public static void deleteExercise(String object, List input) {
        //TODO
        /*
        (1) find name of Exercise object in the ArrayList, exerciseList
        (2) remove object from ArrayList, exerciseList
         */
        }

    //Method clearExercise() removes all elements from the ArrayList, exerciseList.
    //Parameter: -c
    public static void clearExercise(List input) {
        /*
        (1) clear the entire ArrayList, exerciseList
         */
        input.clear();
    }

    //Method spreadsheet() builds the spreadsheet from the elements of exerciseList.
    //Parameter: -s
    public static void spreadsheet() {
        //TODO
        /*
        (1)
         */
    }

    public static void main(String[] args) {
        //create Exercise objects
        Exercise ex1 = new Exercise("Squat");
        Exercise ex2 = new Exercise("Bench Press");

        //instantiate a new ArrayList to hold Exercise objects
        List<Exercise> exerciseList = new ArrayList<Exercise>();

        //adds objects to exerciseList
        exerciseList.add(ex1);
        exerciseList.add(ex2);

        //delete a specific object in the list based on its name

n
        //prints out the objects
        for (Exercise exercise : exerciseList) {
            System.out.println("Object = " + exercise);
        }

        help();

    }
}
