package daily.routine.api.tarefa;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "tarefas")
@Entity(name = "Tarefa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String horario;
    private Boolean status;
    private String descricao;

    public Tarefa(DadosCadastroTarefa dados) {

        this.nome = dados.nome();
        this.horario = dados.horario();
        this.status = false;
        this.descricao = dados.descricao();

    }
}
