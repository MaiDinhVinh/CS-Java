package section2;

public sealed class Snake5 permits Snake5.Cobra4 {
    final class Cobra4 extends Snake5 {}
}
