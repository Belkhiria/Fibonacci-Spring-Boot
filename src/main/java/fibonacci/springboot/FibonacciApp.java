package fibonacci.springboot;

import fibonacci.calcul.CalculFibonacci;
import fibonacci.rest.Fibonacci;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class FibonacciApp {

    //Instanciation de la classe de calcul de la suite de Fibonacci
    CalculFibonacci calcul = new CalculFibonacci();

    //L'index de la suite de Fibonacci est attribué dans l'URL
    //Pour le calcul de la valeur de l'index 100 : http:\\localhost:8080/100
    //Cette Méthode nous génère un format Json. Exemple pour l'index 100
    //{"indexFibonacci":100,"valeurFibonacci":"354224848179261915075"}
    @RequestMapping(value = "/{number}", method = RequestMethod.GET)
    Fibonacci fib(@PathVariable int number) {
        return new Fibonacci(number, calcul.run(number));
    }

    //La méthode main de notre application Web
    public static void main(String[] args) {
        SpringApplication.run(FibonacciApp.class, args);
    }
}
