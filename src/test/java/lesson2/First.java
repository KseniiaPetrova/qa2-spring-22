package lesson2;

import org.junit.jupiter.api.Test;

public class First {
    @Test
    public void first() {
        System.out.println(sum(3, 16));

        System.out.println(sum(22, 15));
    }

    private int sum(int a, int b) {
        System.out.println("First digit is: " + a + " and second is: " + b);
        int c = a + b;
        return c;
    }

    @Test
    public void usingObjects() {
      Student mikhail = new Student();
      mikhail.setFirstName("Mikhail");
      mikhail.setLastName("The greatest");
      mikhail.setAge(18);
      mikhail.setPersonalCode("123412-11111");

      Student timur = new Student();
      timur.setFirstName("Timur");
      timur.setLastName("Timurov");
      timur.setAge(24);
      timur.setPersonalCode("301212-111111");

      System.out.println(mikhail.getFirstName() + " " + mikhail.getLastName());
      System.out.println(timur.getFirstName() + " " + timur.getLastName());
    }
}
