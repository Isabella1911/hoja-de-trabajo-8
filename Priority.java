interface Priority<E> {
    boolean add(E element);
    E remove();
    boolean isEmpty();
    int size();
}
