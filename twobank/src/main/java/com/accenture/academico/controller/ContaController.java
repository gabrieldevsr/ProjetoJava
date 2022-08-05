package com.accenture.academico.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accenture.academico.model.Conta;
import com.accenture.academico.service.ContaService;

//creating RestController
@RequestMapping("/contas")
@RestController
public class ContaController {
	//autowired the Conta class
	@Autowired
	ContaService contaService;
	
	//creating a get mapping that retrieves all the account detail from the database 
	@GetMapping()
	private List<Conta> getAllContas() 
	{
		return contaService.getAllContas();
	}
	
	//creating a get mapping that retrieves the detail of a specific account
	@GetMapping("/{id}")
	private Conta getConta(@PathVariable("id") Long id) 
	{
		return contaService.getContaById(id);
	}
	
	//creating a delete mapping that deletes a specific account
	@DeleteMapping("/{id}")
	private void deleteConta(@PathVariable("id") Long id) 
	{
		contaService.delete(id);
	}
	
	//creating post mapping that post the account detail in the database
	@PostMapping()
	private int saveConta(@RequestBody Conta conta) 
	{
		Conta.saveOrUpdate(conta);
		return contaService.getId();
	}
}






