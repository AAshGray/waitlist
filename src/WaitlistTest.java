import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Set;


public class WaitlistTest {
  
  // TODO: Implement tests for removeStudents

  // Hints:
  // - removeStudents is an instance method, so your arrange will need to create an instance of Waitlist
  // - When comparing arrays you should use Arrays.equals instead of the equals instance method or ==
  //     java.util.Arrays is imported for you at the top of this file.

  @Test
  void toRemove_testExample(){
    String[] studentIds = {"x", "r", "q", "m", "v"};
    Set<String> remove = Set.of("r", "m");

    
    Waitlist students = new Waitlist(studentIds, 7);
    students.removeStudents(remove);

    String[] expectedStudentIds = {"x", "q", "v", null, null};

    Waitlist expected = new Waitlist(expectedStudentIds, 7);
    System.out.println(students);
    System.out.println(expected);
    assertTrue(Arrays.equals(students.getWaitlist(), expected.getWaitlist()));
  }

}