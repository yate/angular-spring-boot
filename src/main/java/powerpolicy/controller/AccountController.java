package powerpolicy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import powerpolicy.domain.Account;
import powerpolicy.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService service;
	
	@RequestMapping("/accounts")
	public List<Account> test() {
		return service.getAllAccounts();
	}
}
