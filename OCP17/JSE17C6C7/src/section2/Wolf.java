package section2;

public sealed class Wolf permits Timber {}
non-sealed class Timber extends Wolf {}
class MyWolf extends Timber {}