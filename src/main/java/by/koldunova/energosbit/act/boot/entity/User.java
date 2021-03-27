package by.koldunova.energosbit.act.boot.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails {
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return null;
    }
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }
	
	
}
