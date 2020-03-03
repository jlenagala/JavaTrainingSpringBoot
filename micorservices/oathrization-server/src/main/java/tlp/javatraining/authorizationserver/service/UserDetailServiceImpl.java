package tlp.javatraining.authorizationserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import tlp.javatraining.authorizationserver.model.User;
import tlp.javatraining.authorizationserver.repository.UserDetailRepository;

import java.util.Optional;

public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    UserDetailRepository userDetailRepository;
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> optionalUser=userDetailRepository.findByUsername(name);
        return null;
    }
}
