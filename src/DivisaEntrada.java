public class DivisaEntrada extends Divisa implements CalculoDeSalida {
    public int numeroDeDivisaEntrada;

    DivisaEntrada(double valor, int numeroDeDivisaEntrada){
        super(valor); //cantidad de dinero en la divisa de entrada.
        this.numeroDeDivisaEntrada = numeroDeDivisaEntrada; //divisa de entrada.
    }

    private double[] arrayDivisas = {0, 20.18, 21.63, 1, 0.13, 0.20}; //Valores de divisas en pesos.

    @Override
    public void setValor(double valor) {
        this.valor = valor; 
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double calcularSalida() { // calculo de divisa de entrada a pesos.
        if (numeroDeDivisaEntrada == 4){
            return valor;
        } else {
            return valor * arrayDivisas[numeroDeDivisaEntrada];
        }
    }

    public String obtenerNombreDivisa(int tipo) { //Nombre de la divisa de entrada.
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
