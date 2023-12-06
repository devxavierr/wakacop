package academy.wakanda.wakacop.pauta.application.api;

import lombok.Getter;
import lombok.ToString;
import org.springframework.web.service.annotation.GetExchange;

import java.util.UUID;
@Getter
@ToString
public class PautaCadastradaResponse {
    private UUID id;
}
