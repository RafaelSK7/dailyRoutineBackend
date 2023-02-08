package daily.routine.api.tarefa;

public record DadosDetalhamentoTarefa(Long id, String nome, String horario, Boolean status, String descricao) {

    public DadosDetalhamentoTarefa(Tarefa tarefa){
        this(tarefa.getId(), tarefa.getNome(), tarefa.getHorario(), tarefa.getStatus(), tarefa.getDescricao());
    }

}
