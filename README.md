**WARNING: ONLY OPEN EACH PROJECT FILE INDIVIDUALLY ON THE START OF PROJECT DIRECTORY !!!!**






**NOTE !!**
- For *file navigation*, the folder name is categorized in the format ***(mm/dd/yyyy)***
![](https://github.com/MaiDinhVinh/CS-Java/blob/main/Java.png)

**Oracle Foundation Certification**






my mom didn't have enough time to find for me a best time to take the test
so i have to write a Java script to generate the best date for me lol :)
```java
import java.util.Random;
public class dmm{
    /**
     * minecraft best seed is used to generate my final date<p>
     * for Oracle Foundation Test :V<p>
     * {@code seed: 712262452098460}<p>
     * {@code coordinate: X: 1000, Z: -1000}<p>
     * {@code compatible version: >= 1.18}<p>
     * Have to put it into the expression form since the seed number are too large
     * :))))<p>
     * Explaination for the nextInt part<p>
     * Because the nextInt method always generate an random number based on the seed, i have to limit it, so I limit it to {@code 4}, therefore, we have:
     * <blockquote><pre>
     *     r.nextInt() >= 0 && r.nextInt() < 4
     * </pre></blockquote><p>
     * Next, to increase the limit to {@code x >= 8 and x < 12}, I have to increment the generated number by {@code 8} => increment both side of the equation by 8 => Therefore, I have:<p>
     * <blockquote><pre>
     *     r.nextInt() >= 8 && r.nextInt() < 12
     * </pre></blockquote><p>
     * The reason why I put the number of incrementation to be {@code <= 2010} is because the date that both I and my tutor agreed was Oct, 20th :))))<p>
     * The output for the program was:<p>
     * {@code The final decision is: 11:27, Oct 20th, 2024}
     * */
    public static void main(String[] args) {
        Random r = new Random(71226245+2098460+1000+(-1000));
        int hour = 0;
        for(int i = 0; i < 2010; i++){
            hour = (r.nextInt(4)+8);
        }
        int minute = 0;
        for(int i = 0; i < 2010; i++){
            minute = r.nextInt(60);
        }
        System.out.format("The final decision is: %d:%d, Oct 20th, 2024", hour, minute);
    }
}
```