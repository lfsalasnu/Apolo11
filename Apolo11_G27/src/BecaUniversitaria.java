public class BecaUniversitaria {
    //
    // Atributos    
    private int pTiempo;
    private double pMonto;
    private double pInteres;
    
    // Constructores
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.pTiempo=pTiempo;
        this.pInteres=pInteres;
        this.pMonto=pMonto;
    }

    public BecaUniversitaria(){
        this.pTiempo=0;
        this.pInteres=0;
        this.pMonto=0;
    }

    // Métodos
    //
    public double calcularInteresSimple( ){
        double int_simple=this.pTiempo*this.pInteres*this.pMonto/100;
        return  Math.round(int_simple);
    }
    public double calcularInteresCompuesto( ){
        double int_comp=this.pMonto*(Math.pow((1+this.pInteres/100),this.pTiempo)-1);
        return Math.round(int_comp);
    }
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.pTiempo=pTiempo;
        this.pInteres=pInteres;
        this.pMonto=pMonto;
        double int_simple=calcularInteresSimple();
        double int_comp=calcularInteresCompuesto();
        double diferencia=int_comp-int_simple;
        String salida="La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        return salida;
    }
    public String compararInversion ( ){
        double int_simple=calcularInteresSimple();
        double int_comp=calcularInteresCompuesto();
        double diferencia=int_comp-int_simple;
        String salida;
        if (diferencia==0){
            salida="No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        else{
            salida="La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }
        return salida;
    }
    //Sección principal: Instanciación de clase y uso de métodos.
    //Importante: En la plataforma de iMaster se sube esta clase SIN MAIN.
    //Se indica esta sección para probar localmente antes de someter a revisión.
    public static void main(String[] args) {
        // Llamados para verificar con los casos de prueba el funcionamiento de la clase
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
    }
}
