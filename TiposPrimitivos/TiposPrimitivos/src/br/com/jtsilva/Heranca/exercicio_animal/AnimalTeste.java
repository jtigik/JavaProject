package br.com.jtsilva.heranca.exercicio_animal;

public class AnimalTeste {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Miau", 3);
        Animal animal = new Animal("Animal", 23);

        cachorro.emitirSom(); // Deve imprimir "O cachorro late"
        gato.emitirSom(); // Deve imprimir "O gato mia"
        animal.emitirSom();// Animal genérico.
    }
}
