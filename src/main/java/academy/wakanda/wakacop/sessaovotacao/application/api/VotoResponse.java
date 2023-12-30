package academy.wakanda.wakacop.sessaovotacao.application.api;

import academy.wakanda.wakacop.sessaovotacao.domain.VotoPauta;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@ToString
public class VotoResponse {
    private UUID id;
    private UUID idSessao;
    private LocalDateTime momentoVoto;
    private String cpfAssociado;

    public VotoResponse(VotoPauta voto) {
        this.id = voto.getId();
        this.idSessao = voto.idSessao();
        this.momentoVoto = voto.getMomentoVoto();
        this.cpfAssociado = voto.getCpfAssociado();
    }

}
