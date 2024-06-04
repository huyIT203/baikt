package controller;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.roleservice;

import javax.management.relation.Role;
import java.util.List;
@Controller
@RequestMapping("/roles")
public class roleController {



        @Autowired
        private roleservice roleService;

        @GetMapping
        public String getAllRoles(Model model) {
            List<Role> roles = roleService.getAllRoles();
            model.addAttribute("roles", roles);
            return "roles";
        }

        @GetMapping("/new")
        public String createRoleForm(Model model) {
            model.addAttribute("role", new Role());
            return "role_form";
        }

        @PostMapping
        public String saveRole(@ModelAttribute Role role) {
            roleService.saveRole(role);
            return "redirect:/roles";
        }

        @GetMapping("/edit/{id}")
        public String editRoleForm(@PathVariable Long id, Model model) {
            Role role = roleService.getRoleById(id);
            model.addAttribute("role", role);
            return "role_form";
        }

        @PostMapping("/{id}")
        public String updateRole(@PathVariable Long id, @ModelAttribute Role role) {
            role.setId(id);
            roleService.saveRole(role);
            return "redirect:/roles";
        }

        @GetMapping("/delete/{id}")
        public String deleteRole(@PathVariable Long id) {
            roleService.deleteRole(id);
            return "redirect:/roles";
        }
    }
}
