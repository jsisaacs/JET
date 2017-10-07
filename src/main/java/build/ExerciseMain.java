// /Joshua Isaacson, Fall 2017

package build;;


//Dependencies
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;

/*
This is the main entry point for the app.
Creates the application context and starts the REPL.
*/
@SpringBootApplication
public class ExerciseMain {

    public static void main(String[] args) throws Exception {
         SpringApplication.run(ExerciseMain.class, args);
    }

    @Bean
    public PromptProvider myPromptProvider() {
        return () -> new AttributedString("JET:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
    }

}