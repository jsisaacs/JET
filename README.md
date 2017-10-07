# JET v1.0

JET is a command-line tool that helps you track your weightlifting progress.

## Getting Started

Run the following to download:

```
git clone https://github.iu.edu/jsisaacs/JET.git
```

### Running

To run JET, move into the directory and do this:

```
java -jar target/JET-1.0-SNAPSHOT.jar
```

### How-To

To get help about commands while in the system:
```
JET:> help
```
&nbsp;

To create a new exercise:
```
JET:> new-exercise 0 "exerciseName" 5 10 315 "10/7/2017" "This is a note."
```
&nbsp;

To delete a specific exercise:
```
JET:> delete-exercise 0
```
&nbsp;

To clear the whole exercise ArrayList:
```
JET:> clear-exercise 
```
&nbsp;

To render the exercise spreadsheet:
```
JET:> spreadsheet
```

## Built With

* [ASCII Table](https://github.com/vdmeer/asciitable) - Used to format ASCII tables
* [Spring Shell 2](https://github.com/spring-projects/spring-shell) - Spring based interactive shell
* [Maven](https://maven.apache.org) - Dependency management

