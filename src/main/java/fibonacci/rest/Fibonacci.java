package fibonacci.rest;

// Classe entité
public class Fibonacci {

    private final int indexFibonacci;
    private final String valeurFibonacci;

    public Fibonacci(int indexDibonacci, String valeurFibonacci) {
        this.indexFibonacci = indexDibonacci;
        this.valeurFibonacci = valeurFibonacci;
    }

    //Getter de l'index de la suite de Fibonacci
    public int getIndexFibonacci() {
        return indexFibonacci;
    }

    //Getter de la valeur de la suite de Fibonacci
    public String getValeurFibonacci() {
        return valeurFibonacci;
    }

}
