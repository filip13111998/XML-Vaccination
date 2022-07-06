package ftn.uns.GradjaninPortalBackend.dto;

public class ValidationAccountTokenDTO {
    private String token;

    private Boolean activate;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getActivate() {
		return activate;
	}

	public void setActivate(Boolean activate) {
		this.activate = activate;
	}
    
    
}
