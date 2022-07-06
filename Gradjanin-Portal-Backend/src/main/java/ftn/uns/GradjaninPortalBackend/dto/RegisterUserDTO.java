package ftn.uns.GradjaninPortalBackend.dto;


public class RegisterUserDTO {
	
	protected String jmbg;

	protected String firstName;
    
	protected String lastName;
    
	protected String email;
    
	protected String mobilni;
    
	protected String fiksni;
    
	protected String username;
    
	protected String password;

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilni() {
		return mobilni;
	}

	public void setMobilni(String mobilni) {
		this.mobilni = mobilni;
	}

	public String getFiksni() {
		return fiksni;
	}

	public void setFiksni(String fiksni) {
		this.fiksni = fiksni;
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

	public RegisterUserDTO() {
	}

	public RegisterUserDTO(String jmbg, String firstName, String lastName, String email, String mobilni, String fiksni,
			String username, String password) {
		this.jmbg = jmbg;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobilni = mobilni;
		this.fiksni = fiksni;
		this.username = username;
		this.password = password;
	}
    
	
}
