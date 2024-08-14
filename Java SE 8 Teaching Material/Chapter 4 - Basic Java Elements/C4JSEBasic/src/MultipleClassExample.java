//THIS IS FOR SECTION 4.5.1 (CLASSES REQUIRED: StudentClassPathExample)
package itdept;
import student.StudentClassPathExample;
public class MultipleClassExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        StudentClassPathExample demo1 = new StudentClassPathExample(arr);
        demo1.getGrade();
    }
}
