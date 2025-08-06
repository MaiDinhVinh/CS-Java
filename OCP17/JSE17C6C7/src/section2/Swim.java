package section2;

public sealed interface Swim permits Duck, Swan, Floats {}
final class Duck implements Swim {}
final class Swan implements Swim {}
non-sealed interface Floats extends Swim {}