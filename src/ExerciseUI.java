//Joshua Isaacson, Fall 2017

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import de.vandermeer.asciitable.*;
import javafx.scene.text.TextAlignment;

//All the commands in the 'HELP DESK' table will be implemented here.
//They use the business logic implemented in the Exercise class.

public class ExerciseUI {

    static List<Exercise> exerciseList = new ArrayList<Exercise>();

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
                   "|  -e objectName sets reps weight date                    |  new exercise object  |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -n objectName notes                                    |  add notes to object  |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -d objectName                                          |  delete object        |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -c                                                     |  clear all            |\n" +
                   "+---------------------------------------------------------+-----------------------+\n" +
                   "|  -s                                                     |  builds spreadsheet   |\n" +
                   "+---------------------------------------------------------+-----------------------+\n");
    }

    static Exercise instance = null;

    //Method getInstance() creates an instance of Exercise when called.
    //Follows the Singleton design pattern
    public static Exercise getInstance() {
        //TODO
        if (instance == null) {
            instance = new Exercise();
        }
        return instance;
    }

    //Method newExercise() takes in user inputs about an exercise (objName, exerciseName, sets, reps,
    //weight, date) and adds it to the ArrayList, exerciseList.
    //Parameter: -e
    public static void newExercise(String exercise, int sets, int reps, int weight, String date) {
        //TODO
        //adds properties to the Exercise object
        getInstance().setExercise(exercise);
        getInstance().changeSets(sets);
        getInstance().changeReps(reps);
        getInstance().setWeight(weight);
        getInstance().setDate(date);

        //add the Exercise object to exerciseList
        exerciseList.add(instance);
    }

    //Method addNote() takes in user input as a String and adds it to the Exercise object
    //with the setNotes() method.
    //Parameter: -n
    public static void addNote(Exercise object, String input) {
        if (exerciseList.contains(object)){
            object.setNotes(input);
        }
        else {
            System.out.println("That note doesn't have notes yet.");
        }
    }


    //Method deleteExercise() takes in user input for an object name and removes it from the
    //ArrayList, exerciseList.
    //Parameter: -d
    public static void deleteExercise(Exercise objectName) {
        exerciseList.remove(objectName);
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
        to build the spreadsheet, you need the number of Exercise obj = rows
        (1) takes
         */
        AsciiTable table = new AsciiTable();
        //String exercise, int sets, int reps, int weight, String date
        table.addRule();
        table.addRow("Exercise", "Sets", "Reps", "Weight", "Date", "Notes");
        table.addRule();
        //table.addRow();
        //table.addRule();

        String render = table.render();
        System.out.println(render);
    }

    public static void main(String[] args) {
        spreadsheet();

    }
}
