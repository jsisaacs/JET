//Joshua Isaacson, Fall 2017

import java.util.ArrayList;
import java.util.List;
import de.vandermeer.asciitable.*;
import de.vandermeer.asciithemes.a7.A7_Grids;

//This class takes the business logic from Exercise.java and creates the UI that the user
//interacts with.
public class ExerciseUI {

    private static List<Exercise> exerciseList = new ArrayList<>();

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

    //Method newExercise() takes in user inputs about an exercise (order in list, objName,
    //exerciseName, sets, reps, weight, date) and adds it to the ArrayList, exerciseList.
    //Parameter: -e
    private static void newExercise(int exerciseNumber, String exercise, int sets, int reps, int weight, String date) {
        //creates an instance of Exercise when called
        exerciseList.add(new Exercise());

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
    private static void addNote(int exerciseNumber, String input) {
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
    private static void spreadsheet() {
        AsciiTable table = new AsciiTable();
        table.addRule();
        AT_Row header =  table.addRow(
                "Number",
                "Exercise",
                "Sets",
                "Reps",
                "Weight",
                "Date",
                "",
                "Notes",
                "");
        header.setTextAlignment(
                de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment.CENTER);
        table.addRule();


        if (exerciseList.size() == 0) {
            AT_Row nullOutput = table.addRow(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    "There are no exercises logged yet!");
            nullOutput.setTextAlignment(
                    de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment.CENTER);
            table.addRule();
        }
        else {
            for (int i = 1; i <= exerciseList.size(); i++) {
                AT_Row output = table.addRow(
                        i - 1,
                        exerciseList.get(i - 1).getExercise(),
                        exerciseList.get(i - 1).getSets(),
                        exerciseList.get(i - 1).getReps(),
                        exerciseList.get(i - 1).getWeight(),
                        exerciseList.get(i - 1).getDate(),
                        null,
                        null,
                        exerciseList.get(i - 1).getNotes());
                output.setTextAlignment(
                        de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment.CENTER);
                table.addRule();
            }
        }
        table.getContext().setGrid(
                A7_Grids.minusBarPlusEquals());
        System.out.println(table.render());
    }

    public static void main(String[] args) {
        //intro();
        //help();

        newExercise(0, "Squat", 5, 5, 280, "9/18/17");
        addNote(0, "This is a note for exercise 0");

        newExercise(1, "Bench Press", 4, 8, 215, "9/21/17");
        addNote(1, "Felt heavy, possibly stay at this weight and do more accessory movements.");

        newExercise(2, "Pull-ups", 3, 10, 25, "9/21/17");
        addNote(2, "Super easy, had a nice pump");

        spreadsheet();
    }
}