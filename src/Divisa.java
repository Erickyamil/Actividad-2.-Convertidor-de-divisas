public abstract class Divisa {
    protected double valor;

    Divisa(Double valor) {
        this.valor = valor;
    }

    public abstract void setValor(double valor); //setter
    public abstract double getValor(); //getter
    
}
