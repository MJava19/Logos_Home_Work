package inner;

public interface Iterator extends java.util.Iterator {
    @Override
    boolean hasNext();

    @Override
    Object next();
}
