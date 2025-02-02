package br.com.gestao.gestaotarefas.repository;

import br.com.gestao.gestaotarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}