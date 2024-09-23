//THIS IS FOR SECTION 4.5.1 (OTHER CLASSES REQUIRED: MultipleClassPathExample)
package student;
public class StudentClassPathExample {
    private int[] grade;

    public StudentClassPathExample(int[] grade){
        this.grade = grade;
    }

    public void getGrade(){
        for(int i: this.grade){
            System.out.println(i);
        }
    }
}
