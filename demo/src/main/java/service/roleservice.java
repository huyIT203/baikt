package service;

import org.springframework.beans.factory.annotation.Autowired;

import javax.management.relation.Role;
import java.util.List;

public class roleservice {
    @Autowired
    private roleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    public void saveRole(Role role) {
        roleRepository.save(role);
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
