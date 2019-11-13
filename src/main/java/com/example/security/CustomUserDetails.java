package com.example.security;

import com.example.entity.User;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Data
@AllArgsConstructor
public class CustomUserDetails implements UserDetails {

    User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String roleName1 = "ROLE_" + user.getRoleName();
        String roleName2 = "ROLE_ADMIN";
        List<GrantedAuthority> authorities = new ArrayList();
        SimpleGrantedAuthority role1 = new SimpleGrantedAuthority(roleName1);
        SimpleGrantedAuthority role2 = new SimpleGrantedAuthority(roleName2);
        authorities.add(role1);
        authorities.add(role2);
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
