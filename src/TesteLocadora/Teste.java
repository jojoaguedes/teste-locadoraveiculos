package TesteLocadora;
import org.junit.Assert;
import org.junit.Test;

public class Teste {
    @Test
    public void dadoCarroComumPor3DiasQuandoExecutadoReservaEntaoDeveRetornarValorAPagar() {
        //dado

        Integer dias = 3;
        Double valorEsperado = 126.0;

        //quando
        Reserva reserva = new ReservaComum();
        Double valor = reserva.Reserva(dias);


        // entao
        Assert.assertEquals(valor, valorEsperado);
    }

    @Test
    public void dadoCarroComumPor6DiasQuandoExecutadoReservaEntaoDeveRetornarValorAPagar() {
        //dado

        Integer dias = 6;
        Double valorEsperado = 264.0;

        //quando
        Reserva reserva = new ReservaComum();
        Double valor = reserva.Reserva(dias);


        // entao
        Assert.assertEquals(valor, valorEsperado);
    }
    @Test
    public void dadoCarroComumPor12DiasQuandoExecutadoReservaEntaoDeveRetornarValorAPagar() {
        //dado

        Integer dias = 12;
        Double valorEsperado = 576.0;

        //quando
        Reserva reserva = new ReservaComum();
        Double valor = reserva.Reserva(dias);


        // entao
        Assert.assertEquals(valor, valorEsperado);
    }

    @Test
    public void dadoCarroSUVPor3DiasQuandoExecutadoReservaEntaoDeveRetornarValorAPagar() {
        //dado

        Integer dias = 3;
        Double valorEsperado = 315.0;

        //quando
        Reserva reserva = new ReservaSUV();
        Double valor = reserva.Reserva(dias);


        // entao
        Assert.assertEquals(valor, valorEsperado);
    }

    @Test
    public void dadoCarroCSUVPor6DiasQuandoExecutadoReservaEntaoDeveRetornarValorAPagar() {
        //dado

        Integer dias = 6;
        Double valorEsperado = 660.0;

        //quando
        Reserva reserva = new ReservaSUV();
        Double valor = reserva.Reserva(dias);


        // entao
        Assert.assertEquals(valor, valorEsperado);
    }

}
