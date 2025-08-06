package section2;

public sealed class Mammal permits Equine {}
sealed class Equine extends Mammal permits Zebra {}
final class Zebra extends Equine {} //what happen if Mammal ... ?