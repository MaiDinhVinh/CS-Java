//which interface below is a Functional Interface ?

public interface Soar {
    abstract String toString();
}

interface Dive {
    String toString();
    public boolean equals(Object o);
    public abstract int hashCode();
    public void dive();
}

interface Hibernate {
    String toString();
    public boolean equals(Hibernate o);
    public abstract int hashCode();
    public void rest();
}