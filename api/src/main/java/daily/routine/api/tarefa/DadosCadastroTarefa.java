package daily.routine.api.tarefa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroTarefa(

        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "\\d{2}\\:\\d{2}")
        String horario,
        @NotBlank
        String descricao) {
}
