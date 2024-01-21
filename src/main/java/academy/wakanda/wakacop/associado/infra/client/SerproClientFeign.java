package academy.wakanda.wakacop.associado.infra.client;

public interface SerproClientFeign {
    ConsultaCPFResponse consultaCPF(String cpfAssociado);
}
