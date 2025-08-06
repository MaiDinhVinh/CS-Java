package section2;

public sealed class Snake1 permits Cobra {}
final class Cobra extends Snake1 {}
