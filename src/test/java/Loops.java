import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    @Test
    public void loopsLesson () {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Dmitry");
        studentNames.add("Svetlana");
        studentNames.add("Ksenia");
        studentNames.add("Anna");
        studentNames.add("Deniss");
        studentNames.add("Timur");
        studentNames.add("Anton");
        studentNames.add("Darja");
        studentNames.add("Daniil");

        System.out.println(studentNames.get(1));
        System.out.println(studentNames.size());
        System.out.println(studentNames.isEmpty());

        //--------FOR------
        for (int i = 0; i < studentNames.size(); i++) { // i = i + 1 -> i++
            //    System.out.println(studentNames.get(i));
        }


        // --------FOREACH-----

        for (String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println(name);
            }
        }
        // --------IF-ELSE-------
        for (String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println(name + " This name starts with D");
            } else {
                System.out.println(name + " This name doesn't starts with D");
            }
        }

        //if(i / 2 == 4) {
           // System.out.println(i);
        }
    }

