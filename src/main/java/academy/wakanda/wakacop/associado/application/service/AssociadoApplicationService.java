package academy.wakanda.wakacop.associado.application.service;

import academy.wakanda.wakacop.associado.infra.client.ConsultaCPFResponse;
import academy.wakanda.wakacop.associado.infra.client.SerproClientFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class AssociadoApplicationService implements AssociadoService{
    private final SerproClientFeign serproClientFeign;
    @Override
    public void validaAssociadoAptoVoto(String cpfAssociado) {
        log.info("[inicia] AssociadoApplicationService - validaAssociadoAptoVoto");
        ConsultaCPFResponse consultaCPFResponse = serproClientFeign.consultaCPF(cpfAssociado);
        valida(consultaCPFResponse);

        log.info("[finaliza] AssociadoApplicationService - validaAssociadoAptoVoto");
    }

    private void valida(ConsultaCPFResponse consultaCPFResponse) {
        if(consultaCPFResponse.isInvalid()){
            throw new RuntimeException("CPF associado Inválido");
        }
    }
}
