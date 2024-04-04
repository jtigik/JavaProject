package br.com.jtsilva.generics.generics_2;

public class GenericEntry<T, E> {

    private T data;

    private E codigo;

    public GenericEntry(T data, E codigo) {
        this.data = data;
        this.codigo = codigo;
    }

    public T getData() {
        return this.data;
    }

    public E getCodigo() {
        return this.codigo;
    }
}
