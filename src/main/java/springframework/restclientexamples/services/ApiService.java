package springframework.restclientexamples.services;

import springframework.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
