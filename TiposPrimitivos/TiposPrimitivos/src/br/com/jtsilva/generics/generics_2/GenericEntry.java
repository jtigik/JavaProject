package br.com.jtsilva.generics.generics_2;

public class GenericEntry<T, E> {

    private T data;

    private E code;

    public GenericEntry(T data, E code) {
        this.data = data;
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public E getCode() {
        return this.code;
    }
}
