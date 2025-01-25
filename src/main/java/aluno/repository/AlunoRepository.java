package aluno.repository;

import org.springframework.data.repository.CrudRepository;
import aluno.model.Aluno;

public interface AlunoRepository  extends CrudRepository<Aluno, Integer>{

}
