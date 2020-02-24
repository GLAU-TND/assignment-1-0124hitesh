package adt;

public interface Cont<E> {
    void add(E item);

    E remove();

    E getData(int index);
}