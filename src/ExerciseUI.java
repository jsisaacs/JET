//Joshua Isaacson, Fall 2017

import java.util.ArrayList;
import java.util.List;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import de.vandermeer.asciitable.*;


//This class takes the business logic from Exercise.java and creates the UI that the user
//interacts with.

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

    //Method newInstance() creates an instance of Exercise when called.
    public static void newInstance() {
        exerciseList.add(new Exercise());
    }

    //Method newExercise() takes in user inputs about an exercise (order in list, objName,
    //exerciseName, sets, reps, weight, date) and adds it to the ArrayList, exerciseList.
    //Parameter: -e
    public static void newExercise(int exerciseNumber, String exercise, int sets, int reps, int weight, String date) {
        //adds properties to the Exercise object
        exerciseList.get(exerciseNumber).setExercise(exercise);
        exerciseList.get(exerciseNumber).changeSets(sets);
        exerciseList.get(exerciseNumber).changeReps(reps);
        exerciseList.get(exerciseNumber).setWeight(weight);
        exerciseList.get(exerciseNumber).setDate(date);
    }

    //Method addNote() takes in user input as a String and adds it to the Exercise object
    //with the setNotes() method.
    //Parameter: -n
    public static void addNote(int exerciseNumber, String input) {
        if (exerciseList.contains(exerciseList.get(exerciseNumber))){
            exerciseList.get(exerciseNumber).setNotes(input);
        }
        else {
            System.out.println("That note doesn't have notes yet.");
        }
    }


    //Method deleteExercise() takes in user input for an object number and removes it from the
    //ArrayList, exerciseList.
    //Parameter: -d
    public static void deleteExercise(int exerciseNumber) {
        exerciseList.remove(exerciseList.get(exerciseNumber));
    }

    //Method clearExercise() removes all elements from the ArrayList, exerciseList.
    //Parameter: -c
    public static void clearExercise() {
        /*
        (1) clear the entire ArrayList, exerciseList
         */
        exerciseList.clear();
    }

    //Method spreadsheet() builds the spreadsheet from the elements of exerciseList.
    //Parameter: -s
    public static void spreadsheet() {
        //TODO
        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow("Exercise Number", "Exercise", "Sets", "Reps", "Weight", "Date", "Notes");
        at.addRule();

        while (true) {
            if (exerciseList.size() == 0) {
                at.addRow("There are no exercises logged yet!");
                at.addRule();
            }
            else {
                for (int i = 0; i <= exerciseList.size(); i++) {
                    at.addRow(exerciseList.get(i).getExercise(),
                            exerciseList.get(i).getSets(),
                            exerciseList.get(i).getReps(),
                            exerciseList.get(i).getWeight(),
                            exerciseList.get(i).getDate(),
                            exerciseList.get(i).getNotes());
                    at.addRule();
                }
            }
            break;
        }
        System.out.println(at.render());
    }

    public static void main(String[] args) {
        //newInstance();
        newInstance();
        //newInstance();
        //newInstance();
        newExercise(0, "Squat", 5, 5, 280, "9/18/2017");

        //newExercise(1, "Squat", 5, 5, 280, "9/18/2017");
        //newExercise(2, "Squat", 5, 5, 280, "9/18/2017");
        //newExercise(3, "Squat", 5, 5, 280, "9/18/2017");
        System.out.println(exerciseList.size());


        for(int i = 0; i < exerciseList.size(); i++) {
            System.out.println(exerciseList.get(i));
        }


        //System.out.println(exerciseList.size());

        //newExercise(0, "squat", 5, 5, 280, "9/20/2017");
        //System.out.println("Exercise " + exerciseList.get(0));
        //System.out.println("Exercise Name: " + exerciseList.get(0).getExercise());

        addNote(0, "This is a note for exercise 0");
        System.out.println("Exercise Note: " + exerciseList.get(0).getNotes());

        //spreadsheet();


    }
}
