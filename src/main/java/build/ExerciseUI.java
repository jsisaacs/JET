//Joshua Isaacson, Fall 2017

package build;

//Dependencies
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import de.vandermeer.asciitable.*;
import de.vandermeer.asciithemes.a7.A7_Grids;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;


//This class takes the business logic from Exercise.java and creates the UI that the user
//interacts with.
@ShellComponent
public class ExerciseUI {

    private List<Exercise> exerciseList = new ArrayList<>();

    //Method newExercise() takes in user inputs about an exercise (order in list,
    //exerciseName, sets, reps, weight, date, notes) and adds it to the ArrayList, exerciseList.
    @ShellMethod("Create a new exercise.")
    private void newExercise(int exerciseNumber, String exercise, int sets, int reps, int weight, String date, String notes) {
        if (exerciseList.size() <= exerciseNumber) {
            //creates an instance of Exercise when called
            exerciseList.add(new Exercise());

            //adds properties to the Exercise object
            exerciseList.get(exerciseNumber).setExercise(exercise);
            exerciseList.get(exerciseNumber).changeSets(sets);
            exerciseList.get(exerciseNumber).changeReps(reps);
            exerciseList.get(exerciseNumber).setWeight(weight);
            exerciseList.get(exerciseNumber).setDate(date);
            exerciseList.get(exerciseNumber).setNotes(notes);
        }
        else {
            System.out.println("Index error");
        }
    }

    /*
    //Method addNote() takes in user input as a String and adds it to the Exercise object
    //with the setNotes() method.
    @ShellMethod("Adds a note to an exercise.")
    private void addNote(int exerciseNumber, String input) {
        if (exerciseList.contains(exerciseList.get(exerciseNumber))){
            exerciseList.get(exerciseNumber).setNotes(input);
        }
        else {
            System.out.println("That note doesn't have notes yet.");
        }
    }
    */

    //Method deleteExercise() takes in user input for an object number and removes it from the
    //ArrayList, exerciseList.
    @ShellMethod("Deletes an existing exercise.")
    public void deleteExercise(int exerciseNumber) {
        exerciseList.remove(exerciseList.get(exerciseNumber));
    }

    //Method clearExercise() removes all elements from the ArrayList, exerciseList.
    @ShellMethod("Removes all exercises.")
    public void clearExercise() {
        exerciseList.clear();
    }

    //Method spreadsheet() builds the spreadsheet from the elements of exerciseList.
    @ShellMethod("Creates a spreadsheet filled with existing exercises.")
    private void spreadsheet() {
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
}
