package articles.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name="users")
public class User extends BaseModel{
	
	 @Column(nullable=false)
	    private String name;

	    @Column(nullable=false, unique=true)
	    private String email;

	    @Column(nullable=false)
	    private String password;

	    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	    @JoinTable(
	            name="users_roles", joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
	            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
	    private List<Role> roles = new ArrayList<>();

		public User(String name, String email, String password, List<Role> roles) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.roles = roles;
		}

		public User() {
			super();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<Role> getRoles() {
			return roles;
		}

		public void setRoles(List<Role> roles) {
			this.roles = roles;
		}
	    
	    

}
