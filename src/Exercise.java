//Joshua Isaacson

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    //variables
    String exerciseName;
    //weightUsed is in pounds
    int weightUsed = 0;
    int sets;
    int repetitions;
    String day;
    String notes;

    //constructor for an Exercise object
    public Exercise(String exercise) {
        this.exerciseName = exercise;
        weightUsed = 0;
    }

    //getExercise() returns the exerciseName for the Exercise
    public String getExercise() {
        return exerciseName;
    }

    //getWeight() returns current weightUsed for the Exercise
    public int getWeight() {
        return weightUsed;
    }

    //setWeight() changes value of weightUsed
    public void setWeight(int newWeight) {
        this.weightUsed = newWeight;
    }

    //changeSets() takes an Exercise object and sets
    //the number of sets
    public void changeSets(int sets) {
        this.sets = sets;
    }

    //chanceReps() takes an Exercise object and sets
    //the number of reps
    public void changeReps(int reps) {
        this.repetitions = reps;
    }

    //getSets() returns current number of sets
    public int getSets() {
        return sets;
    }

    //getReps() returns current number of reps
    public int getReps() {
        return repetitions;
    }

    //setDay() in string form, e.g., "Sept 12, 2017"
    public void setDay(String day) {
        this.day = day;
    }

    //getDay() returns day
    public String getDay() {
        return day;
    }

    //setNotes() lets you add a String of brief text about how the specific Exercise went
    public void setNotes(String notes) {
        this.notes = notes;
    }

    //getNotes() returns notes
    public String getNotes() {
        return notes;
    }

    //viewMyList() returns a String output of all the current Exercise objects
    //also outputs setsXreps, date, and weights if available
    public void viewMyList(List list) {

    }



}
