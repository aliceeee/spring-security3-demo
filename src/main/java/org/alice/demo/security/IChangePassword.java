package org.alice.demo.security;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IChangePassword extends UserDetailsService {
	void changePassword(String username, String password);
}
