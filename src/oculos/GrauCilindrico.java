package oculos;

public class GrauCilindrico extends Oculos{
    private Double esquerdo;
    private Double direito;
    private final double[] grau = new double[]{0,-0.25,-0.50,-0.75,-1.25,-1.50,-1.75,-2.00,-2.25,
            -2.50,-2.75,-3.00,-3.25,-3.50,-3.75,-4.00,-4.25,-4.50,-4.75,-5.00,-5.25
            ,-5.50,-5.75,-6.00};

    public GrauCilindrico(Double esquerdo, Double direito) {
        setEsquerdo(esquerdo);
        setDireito(direito);
    }

    public Double getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Double esquerdo) {

        for (double i = grau[23]; i < grau[0] ; i+=0.25) {
            if (esquerdo == i){
                this.esquerdo = esquerdo;
                break;
            }
            else {
                this.esquerdo=0.0;
            }

        }
    }

    public Double getDireito() {
        return direito;
    }

    public void setDireito(Double direito) {
        for (double i = grau[23]; i < grau[0] ; i+=0.25) {
            if (esquerdo == i){
                this.direito = direito;
                break;
            }
            else {
                this.direito=0.0;
            }

        }
    }

    @Override
    public String lentePrime(Double a, Double b) {
        return null;
    }

    @Override
    public String lenteVision(Double a, Double b) {
        return null;
    }

    @Override
    public String lenteDisponivel(Double a, Double b) {
        return null;
    }
}
