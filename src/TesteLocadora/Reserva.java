package TesteLocadora;

public abstract class Reserva {

    public abstract Double getValorDiaria();

    public Double Reserva(Integer qtdDias) {

        Double taxa;

        if (qtdDias <= 5) {
            taxa = 0.05;
        }
        else if (qtdDias >5  && qtdDias <= 10) {
            taxa = 0.10;

        }
        else {
            taxa = 0.20;
        }
        return getValorDiaria() * qtdDias * (1 + taxa);
    }

}
