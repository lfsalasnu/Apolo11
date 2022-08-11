public class BecaUniversitaria {
    //
    // Atributos
    private double pMonto;
    private double pInteres;
    private int pTiempo;
    // ...
    //
    // Constructores
    public BecaUniversitaria(){
        this.pInteres=0;
        this.pMonto=0;
        this.pTiempo=0;
    }

    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.pInteres=pInteres;
        this.pMonto=pMonto;
        this.pTiempo=pTiempo;

    }
    // Métodos
    //
    public double calcularInteresSimple( ){
        double int_simple=this.pMonto*this.pInteres*this.pTiempo/100;
        return (Math.round(int_simple));
    }
    public double calcularInteresCompuesto( ){
        double int_comp=this.pMonto*(Math.pow((1+(this.pInteres/100)),this.pTiempo)-1);
        return (Math.round(int_comp));
    }
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.pInteres=pInteres;
        this.pMonto=pMonto;
        this.pTiempo=pTiempo;
        double int_simple=calcularInteresSimple();
        double int_comp=calcularInteresCompuesto();
        double diferencia=Math.round(int_comp-int_simple);
        String salida="La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        return salida;
    }
    public String compararInversion ( ){
        double int_simple=calcularInteresSimple();
        double int_comp=calcularInteresCompuesto();
        double diferencia=Math.round(int_comp-int_simple);
        String salida;
        if (diferencia==0){
            salida="No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        else{
            salida="La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }
        
        return salida;
    }
    public static void main(String[] args) {
        // Llamados para verificar con los casos de prueba el funcionamiento de la clase
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
    }
}
