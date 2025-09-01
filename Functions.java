import java.util.Scanner;
/**
 * La clase Functions proporciona métodos para interactuar con el usuario,
 * permitiendo la entrada de texto y númenros. Incluye métodos para obtener
 * texto, número entero y numero entero dentro de un rango específico.
 * Esta clase es útil para manejar la entrada del usuario de manera controlada y
 * segura, asegurando que los datos ingresados sean válidos y dentro de los
 * límites esperados.
 * 
 * @author (Ruben David Santana Rodriguez) 
 * @version (1.0)
 */
public class Functions
{
    public Functions(){
        
    }
    
    /**
     * Obtiene un texto ingresado por el usuario.
     * 
     * @return El texto ingresado por el usuario.
     */
    public String getText(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
    
    /**
     * Obtiene un número enteros ingresado por el usuario.
     * 
     * @return El número entero ingresado por el usuario.
     */
    public int getNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;
        while(!valid){
            try{
                number = Integer.parseInt(scanner.nextLine());
                valid = true;
            }catch(NumberFormatException e){
                System.out.println("Por favor, ingrese un número válido");
            }
        }
        return number;
    }
    
    /**
     * Obtiene un número entero dentro de un rango específico ingresado por el
     * usuario.
     * 
     * @param min El valor mínimo del rango.
     * @param max El valor máximo del rango.
     * @return El numero entero ingresado por el usuario dentro del rango especificado.
     */
    public int getRange(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;
        while(!valid){
            try{
                number = Integer.parseInt(scanner.nextLine());
                if(number >= min && number <= max){
                    valid = true;
                }else{
                    System.out.println("Por favor, ingrese un número dentro del rango "
                    + min + " a " + max + ".");
                }
            }catch(NumberFormatException e){
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        return number;
    }
}