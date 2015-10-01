package powerpolicy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import powerpolicy.domain.Account;
import powerpolicy.mapper.AccountMapper;

@Service
public class AccountService {

	@Autowired
	private AccountMapper mapper;
	
	public List<Account> getAllAccounts() {
		return mapper.getAllAccounts();
	}
}
