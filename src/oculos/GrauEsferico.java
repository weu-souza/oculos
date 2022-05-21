package oculos;

import java.util.Arrays;

public class GrauEsferico extends Oculos {
    private Double esquerdo;
    private Double direito;
    private final double[] grau = new double[]{0, -0.25, -0.50, -0.75, -1.00, -1.25, -1.50, -1.75, -2.00, -2.25, -2.50, -2.75, -3.00, -3.25, -3.50, -3.75, -4.00, -4.25, -4.50, -4.75, -5.00, -5.25, -5.50, -5.75, -6.00, -6.25, -6.50, -6.75, -7.00, -7.25, -7.50, -7.75, -8.00, -8.25, -8.50, -8.75, -9.00, -9.25, -9.50, -9.75, -10.00, -10.25, -10.50, -10.75, -11.00, -11.25, -11.50, -11.75, -12.00, -12.25, -12.50, -12.75, -13.00, -13.25, -13.50, -13.75, -14.00, -14.25, -14.50, -14.75, -15.00};

    public GrauEsferico(Double esquerdo, Double direito) {
        setEsquerdo(esquerdo);
        setDireito(direito);
    }

    public Double getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Double esquerdo) {
        for (double i = grau[60]; i <= grau[0]; i += 0.25) {
            if (esquerdo == i) {
                this.esquerdo = esquerdo;
                break;
            } else {
                this.esquerdo = 1.0;
            }
        }
    }

    public Double getDireito() {
        return direito;
    }

    public void setDireito(Double direito) {
        for (double i = grau[60]; i <= grau[0]; i += 0.25) {
            if (direito == i) {
                this.direito = direito;
                break;
            } else {
                this.direito = 1.0;
            }

        }

    }

    @Override
    public boolean lentePrime(Double a, Double b) {
        boolean aux = false;
        for (double i = grau[48]; i < grau[12]; i += 0.25) {
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
        for (double i = grau[60]; i < grau[0]; i += 0.25) {
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
