package co.edu.uniquindio.poo;

public enum Municipio {
    ARMENIA(0), CALARCA(10.0000), MONTENEGRO(20.0000), QUIMBAYA(30.0000), TEBAIDA(15.0000),
    CIRCACIA(18.0000), FILANDIA(22.0000), GENOVA(70.0000), SALENTO(50.0000), PIJAO(40.0000),
    CORDOBA(30.0000), BUENAVISTA(35.0000);
    final double sobrecosto;

    private Municipio(double sobrecosto) {
        this.sobrecosto = sobrecosto;
    }

    public double getSobrecosto() {
        return sobrecosto;
    }
    
}

