package oculos;

public class GrauCilindrico extends Oculos {
    private Double esquerdo;
    private Double direito;

    private final double[] grau = new double[]{0, -0.25, -0.50, -0.75, -1.25, -1.50, -1.75, -2.00, -2.25,
            -2.50, -2.75, -3.00, -3.25, -3.50, -3.75, -4.00, -4.25, -4.50, -4.75, -5.00, -5.25
            , -5.50, -5.75, -6.00};

    public GrauCilindrico(Double esquerdo, Double direito) {
        setEsquerdo(esquerdo);
        setDireito(direito);
    }

    public Double getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Double esquerdo) {

        for (double i = grau[23]; i < grau[0]; i += 0.25) {
            if (esquerdo == i) {
                this.esquerdo = esquerdo;
                break;
            } else {
                this.esquerdo = 0.0;
            }

        }
    }

    public Double getDireito() {
        return direito;
    }

    public void setDireito(Double direito) {
        for (double i = grau[23]; i < grau[0]; i += 0.25) {
            if (esquerdo == i) {
                this.direito = direito;
                break;
            } else {
                this.direito = 0.0;
            }

        }
    }


    @Override
    public boolean lentePrime(Double a, Double b) {
        boolean aux = false;
        for (double i = grau[7]; i <= grau[0]; i += 0.25) {
            if (a == i) {
                aux = true;

            }
            if (b == i) {
                aux = true;
            }

        }
        return aux;
    }

    @Override
    public boolean lenteVision(Double a, Double b) {
        boolean aux = false;
        for (double i = grau[19]; i <= grau[0]; i += 0.25) {
            if (a == i) {
                aux = true;

            }
            if (b == i) {
                aux = true;
            }

        }
        return aux;
    }

    @Override
    public String lenteDisponivel() {
        String aux = "Lente indisponivel!";
        if (lentePrime(getDireito(), getEsquerdo())) {
            aux = "Lente prime";
        } else if (lenteVision(getDireito(), getEsquerdo())) {
            aux = "Lente vision";
        }
        return aux;
    }

}
