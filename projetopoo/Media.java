
public class Media{

    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 10;
        double nota3 = 9.5;
        
        int peso1= 1;
        int peso2= 2;
        int peso3= 3;

       double resultado = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 )/(peso1+peso2+peso3);

       System.out.println("A media é: " + resultado);
    }

}