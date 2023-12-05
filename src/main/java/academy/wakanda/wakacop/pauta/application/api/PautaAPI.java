package academy.wakanda.wakacop.pauta.application.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PautaAPI {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
}
