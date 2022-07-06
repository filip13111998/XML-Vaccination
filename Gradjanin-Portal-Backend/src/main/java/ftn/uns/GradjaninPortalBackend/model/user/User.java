package ftn.uns.GradjaninPortalBackend.model.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import ftn.uns.GradjaninPortalBackend.model.Role;
import ftn.uns.GradjaninPortalBackend.adapters.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "jmbg",
        "firstName",
        "lastName",
        "email",
        "mobilni",
        "fiksni",
        "username",
        "password",
        "brInt",
        "brPot",
        "enabled",
        "role",
        "lastPasswordResetDate"
})
@XmlRootElement(name = "User")
//namespace="http://www.ftn.uns.ac.rs/users"
public class User implements UserDetails {

    private static final long serialVersionUID = 1L;
    
    @XmlElement(required = true)
    private Long id;

    @XmlElement(required = true)
    protected String jmbg;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String mobilni;
    @XmlElement(required = true)
    protected String fiksni;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected int brInt;
    @XmlElement(required = true)
    protected int brPot;

//    @XmlAttribute(name = "id_interesovanje")
//    protected String idInteresovanje;

    @XmlElement(required = true)
    private boolean enabled;

    @XmlElement(required = true)
    private List<Role> role;
    
    @XmlJavaTypeAdapter( TimestampAdapter.class)
    @XmlElement(required = true)
    private Timestamp lastPasswordResetDate;

    


    public String roleToString() {
        String joined = role.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return joined;
    }

    /**
     * Gets the value of the jmbg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJmbg() {
        return jmbg;
    }

    /**
     * Sets the value of the jmbg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJmbg(String value) {
        this.jmbg = value;
    }

    /**
     * Gets the value of the fname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the fname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the mail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMail() {
        return email;
    }

    /**
     * Sets the value of the mail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the mobilni property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMobilni() {
        return mobilni;
    }

    /**
     * Sets the value of the mobilni property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMobilni(String value) {
        this.mobilni = value;
    }

    /**
     * Gets the value of the fiksni property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFiksni() {
        return fiksni;
    }

    /**
     * Sets the value of the fiksni property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFiksni(String value) {
        this.fiksni = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }


    /**
     * Gets the value of the brInt property.
     *
     */
    public int getBrInt() {
        return brInt;
    }

    /**
     * Sets the value of the brInt property.
     *
     */
    public void setBrInt(int value) {
        this.brInt = value;
    }

    /**
     * Gets the value of the brPot property.
     *
     */
    public int getBrPot() {
        return brPot;
    }

    /**
     * Sets the value of the brPot property.
     *
     */
    public void setBrPot(int value) {
        this.brPot = value;
    }

    /**
     * Gets the value of the idInteresovanje property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
//    public String getIdInteresovanje() {
//        return idInteresovanje;
//    }

    /**
     * Sets the value of the idInteresovanje property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
//    public void setIdInteresovanje(String value) {
//        this.idInteresovanje = value;
//    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
        Timestamp now = new Timestamp(new Date().getTime());
        this.setLastPasswordResetDate(now);
        this.password = password;
    }


    public void setRoles(List<Role> role) {
        this.role = role;
    }

    public List<Role> getRoles() {
        return role;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.role;
    }



    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Timestamp getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(Timestamp lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    public String getRolesToString() {
        String addressID = this.getRoles()+"";

        return addressID;
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

}

