package com.accenture.academico.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.accenture.academico.model.Conta;
import com.accenture.academico.repository.ContaRepository;


@Service
public class ContaService {
	@Autowired
	ContaRepository contaRepository;
    private JpaRepository<Conta, Long> contasRepository;
	
	public List<Conta> getAllConta() 
	{
		List<Conta> contas = new ArrayList<Conta>();
		contasRepository.findAll().forEach(conta -> contas.add(conta));
		return contas;
	}
	
	public Optional<Conta> findContaById(Long id){
		return contaRepository.findById(id);
	}

	public void saveOrUpdate(Conta conta) 
	{
		contaRepository.save(conta);
	}
	
	public boolean delete(Long id){
		if (contaRepository.findById(id).isPresent()){
			contaRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
    public List<Conta> getAllContas() {
        return null;
    }
    public int getId() {
        return 0;
    }
	public Conta getContaById(Long id) {
		return null;
	}
}
