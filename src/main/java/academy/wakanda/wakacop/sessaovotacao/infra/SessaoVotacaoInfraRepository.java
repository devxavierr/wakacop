package academy.wakanda.wakacop.sessaovotacao.infra;

import academy.wakanda.wakacop.sessaovotacao.application.service.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {
    private final SessaVotacaoSpringDataJPARepository sessaVotacaoSpringDataJPARepository;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao) {
        log.info("[inicia] SessaoVotacaoInfraRepository - salva");
        sessaVotacaoSpringDataJPARepository.save(sessaoVotacao);
        log.info("[finaliza] SessaoVotacaoInfraRepository - salva");
        return sessaoVotacao;
    }

    @Override
    public SessaoVotacao buscaPorId(UUID idSessao) {
        log.info("[inicia] SessaoVotacaoInfraRepository - buscaPorId");
        SessaoVotacao sessao = sessaVotacaoSpringDataJPARepository.findById(idSessao)
                .orElseThrow(()-> new RuntimeException("Sessão não encontrada!"));
        log.info("[finaliza] SessaoVotacaoInfraRepository - buscaPorId");
        return sessao;
    }
}
