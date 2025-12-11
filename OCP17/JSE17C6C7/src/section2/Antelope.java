package section2;

public sealed class Antelope permits Gazelle{}
final class Gazelle extends Antelope{}
//class George extends Gazelle {}
