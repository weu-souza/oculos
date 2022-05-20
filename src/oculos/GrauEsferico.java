package oculos;

public class GrauEsferico extends Oculos{
    private Double esquerdo;
    private Double direito;

    public GrauEsferico(Double esquerdo, Double direito) {
        setEsquerdo(esquerdo);
        setDireito(direito);
    }

    public Double getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Double esquerdo) {
        this.esquerdo = esquerdo;
    }

    public Double getDireito() {
        return direito;
    }

    public void setDireito(Double direito) {
        this.direito = direito;
    }

    @Override
    public String lentePrime(Double a, Double b) {
        return null;
    }

    @Override
    public String lenteVision(Double a, Double b) {
        return null;
    }
}
