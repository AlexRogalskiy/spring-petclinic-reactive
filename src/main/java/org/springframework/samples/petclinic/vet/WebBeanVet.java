package org.springframework.samples.petclinic.vet;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;


public class WebBeanVet implements Serializable {
    
    /** Serial. */
    private static final long serialVersionUID = 5116674190977860592L;
    
    private UUID id;
   
    private String firstName;
    
    private String lastName;
    
    private Set<WebBeanVetSpecialty> specialties = new HashSet<>();
    
    public WebBeanVet() {}
    
    public WebBeanVet(Vet dto) {
        this.id          = dto.getId();
        this.firstName   = dto.getFirstName();
        this.lastName    = dto.getLastName();
        this.specialties = dto.getSpecialties().stream()
                              .map(WebBeanVetSpecialty::new).collect(Collectors.toSet());
        
    }
    
    
    /**
     * Getter accessor for attribute 'firstName'.
     *
     * @return
     *       current value of 'firstName'
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Setter accessor for attribute 'firstName'.
     * @param firstName
     * 		new value for 'firstName '
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Getter accessor for attribute 'lastName'.
     *
     * @return
     *       current value of 'lastName'
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Setter accessor for attribute 'lastName'.
     * @param lastName
     * 		new value for 'lastName '
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Getter accessor for attribute 'specialties'.
     *
     * @return
     *       current value of 'specialties'
     */
    public Set<WebBeanVetSpecialty> getSpecialties() {
        return specialties;
    }
    /**
     * Setter accessor for attribute 'specialties'.
     * @param specialties
     * 		new value for 'specialties '
     */
    public void setSpecialties(Set<WebBeanVetSpecialty> specialties) {
        this.specialties = specialties;
    }

    /**
     * Getter accessor for attribute 'id'.
     *
     * @return
     *       current value of 'id'
     */
    public UUID getId() {
        return id;
    }

    /**
     * Setter accessor for attribute 'id'.
     * @param id
     * 		new value for 'id '
     */
    public void setId(UUID id) {
        this.id = id;
    }
    
    
}