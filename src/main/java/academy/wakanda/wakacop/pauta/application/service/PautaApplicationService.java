package academy.wakanda.wakacop.pauta.application.service;

import academy.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.application.api.PautaCadastradaResponse;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    private final PautaRepository pautaRepository;

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[inicia] PautaApplicationService - cadastraPauta");
        log.info("[novaPauta] {}", novaPauta);
        Pauta pauta = pautaRepository.salva(new Pauta(novaPauta));
        log.info("[finaliza] PautaApplicationService - cadastraPauta");
        return new PautaCadastradaResponse(pauta);
    }

    @Override
    public Pauta getPautaPorId(UUID idPauta) {
        log.info("[inicio] PautaCadastradaResponse - getPautaPorId");
        Pauta pautaPorId = pautaRepository.buscaPautaPorId(idPauta);
        log.info("[finaliza] PautaCadastradaResponse - getPautaPorId");
        return pautaPorId;
    }
}
