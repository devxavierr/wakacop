package academy.wakanda.wakacop.associado.infra.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ConsultaCPFResponse {
    @JsonProperty("ni")
    private String ni;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("situacao")
    private String situacao;
    @JsonProperty("nascimento")
    private String nascimento;

    public boolean isInvalid() {
        return ! isValid();
    }
    public boolean isValid() {
        return this.getSituacao().equals("0");
    }

    @Getter
    @ToString
    public static class Situacao{
        @JsonProperty("codigo")
        private String codigo;
        @JsonProperty("descricao")
        private String descricao;

    }
}
