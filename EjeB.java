/**
 * 
 */
public class EjeB{
 
    //Atributos
    private String nombre;
    private int edad;
 
    //Constructor
    /** constructor método especial de una clase que se llama de manera automatica,
     *  siempre que se declara un objeto de esa clase.
     * Su fin es inicializar el objeto, con esto asegurar que lo objetos tenga valores válidos.
     * El constructor tiene las siguientes características:
     * Tiene el mismo nombre que la clase a la que pertenece.
     * Debe declararse público (salvo casos excepcionales) para que 
     * pueda ser invocado desde cualquier parte donde se desee crear un objeto de su clase.*/

    public EjeB() {
        this.nombre="jlkjkljk";
        this.edad=0;
    }
    public EjeB(String Nombre, int Edad) {
        this.nombre = Nombre;
        this.edad= Edad;
    }

    //Metodos
    public String mayorEdad()
    {
        //Mayor de edad
        if (this.edad >=18) {
            return "Es mayor de Edad";
        } else {
            return "Es menor de Edad";
        }
    }
    public String mayusculas()
    {
    System.out.println("longitud de la cadena");
        
        String a=this.nombre.toUpperCase();
    return a;
    }
    public double elevadoAlCuadrado()
    {
        //Hallar el doble de la edad.
        double potencia=Math.pow(this.edad,2);
        return potencia;
    }

    public double raiz()
    {
        //Raiz de la edad
        double cuadrado=Math.sqrt(this.edad);
        return cuadrado;
    }
    
    public static void main(String[] args) {
        EjeB Analisis1 = new EjeB("Ana María",36);
        System.out.println(Analisis1.mayorEdad());
        System.out.println(Analisis1.mayusculas());
        System.out.println(Analisis1.elevadoAlCuadrado());
        System.out.println(Analisis1.raiz());
        
    }
    


 
}