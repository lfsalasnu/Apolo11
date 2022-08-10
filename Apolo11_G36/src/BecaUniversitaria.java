public class BecaUniversitaria {
    //
    // Atributos
    private int pTiempo;
    private double pInteres;
    private double pMonto;
    
    // Constructores
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pInteres=pInteres;
        this.pTiempo=pTiempo;
        this.pMonto=pMonto;
    }

    public BecaUniversitaria(){
        this.pTiempo=0;
        this.pMonto=0;
        this.pInteres=0;
    }
    
    // Métodos
    //
    public double calcularInteresSimple(){
        double int_simple=(this.pMonto*this.pInteres*this.pTiempo)/100;
        return Math.round(int_simple);
    }
    public double calcularInteresCompuesto( ){
        double int_comp;
        int_comp=this.pMonto*(Math.pow((1+(this.pInteres/100)),this.pTiempo)-1);
        return Math.round(int_comp);
    }
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.pInteres=pInteres;
        this.pTiempo=pTiempo;
        this.pMonto=pMonto;
        var int_comp=calcularInteresCompuesto();
        var int_simple=calcularInteresSimple();
        double diferencia=Math.round(int_comp-int_simple);
        String salida="La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        return salida;
    }
    public String compararInversion ( ){
        var int_comp=calcularInteresCompuesto();
        var int_simple=calcularInteresSimple();
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
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria(48,10000,2);
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion());
    }
    
}
