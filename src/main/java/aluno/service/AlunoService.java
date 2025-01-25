package aluno.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aluno.model.Aluno;
import aluno.repository.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	AlunoRepository alunoRepository;
	
	public List<Aluno> getAllAluno() 
	{
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunoRepository.findAll().forEach(aluno -> alunos.add(aluno));
		return alunos;
	}
	public Aluno getAlunoById(int id) 
	{
		return alunoRepository.findById(id).get();
	}
	public void saveOrUpdate(Aluno aluno) 
	{
		alunoRepository.save(aluno);
	}
	
	public void delete(int id) 
	{
		alunoRepository.deleteById(id);
	}
}
