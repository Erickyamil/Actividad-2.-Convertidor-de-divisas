public class DivisaSalida extends Divisa implements CalculoDeSalida {
    private int numeroDeDivisaSalida;

    DivisaSalida(double valor, int numeroDeDivisaSalida){
        super(valor);        //entrada de dinero (ya en pesos).
        this.numeroDeDivisaSalida = numeroDeDivisaSalida; 
    }

    private double[] arrayDivisas = {0, 0.050, 0.046, 1, 7.56, 4.90}; //Valores de las divisas equivalentes a 1 peso.

    public void setNumeroDeDivisa(int numeroDeDivisa){
        this.numeroDeDivisaSalida = numeroDeDivisa; //Indica el tipo de divisa de salida.
    }

    public int getNumeroDeDivisa() {
        return numeroDeDivisaSalida; 
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor; 
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double calcularSalida() {
        if (numeroDeDivisaSalida == 2){
            return valor;
        } else {
            return valor * arrayDivisas[numeroDeDivisaSalida];
        }
    }

    public String obtenerNombreDivisa(int tipo) { //Nombre de la divisa de salida.
        switch (tipo) {
            case 1: return "dólares";
            case 2: return "euros";
            case 3: return "pesos mexicanos";
            case 4: return "yenes";
            case 5: return "rublos";
            default: return "divisa desconocida";
        }
    }
}
