package co.edu.uniquindio.poo;

public enum Material {
    ARENA(10.0000), GRAMASINTETICA(35.0000), GRAMANATURAL(20.0000), ASFALTO(40.0000);
    
    double valorMetroCuadrado;

    private Material(double valorMetroCuadrado){
        this.valorMetroCuadrado=valorMetroCuadrado;

    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }
    
}