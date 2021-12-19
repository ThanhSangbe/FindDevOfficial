/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sang.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author mrsan
 */
@Entity
@Table(name = "candidate")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Candidate_1.findAll", query = "SELECT c FROM Candidate_1 c"),
//    @NamedQuery(name = "Candidate_1.findById", query = "SELECT c FROM Candidate_1 c WHERE c.id = :id"),
//    @NamedQuery(name = "Candidate_1.findByFullname", query = "SELECT c FROM Candidate_1 c WHERE c.fullname = :fullname"),
//    @NamedQuery(name = "Candidate_1.findByMajor", query = "SELECT c FROM Candidate_1 c WHERE c.major = :major"),
//    @NamedQuery(name = "Candidate_1.findByEmail", query = "SELECT c FROM Candidate_1 c WHERE c.email = :email"),
//    @NamedQuery(name = "Candidate_1.findByPhone", query = "SELECT c FROM Candidate_1 c WHERE c.phone = :phone"),
//    @NamedQuery(name = "Candidate_1.findByCv", query = "SELECT c FROM Candidate_1 c WHERE c.cv = :cv"),
//    @NamedQuery(name = "Candidate_1.findByAddress", query = "SELECT c FROM Candidate_1 c WHERE c.address = :address"),
//    @NamedQuery(name = "Candidate_1.findByLogo", query = "SELECT c FROM Candidate_1 c WHERE c.logo = :logo")})
public class Candidate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;
    @Column(name = "fullname")
    @NotNull(message = "{NotNull.Msg}")
    private String fullname;
    @Column(name = "major")
    
    private String major;
    @Column(name = "email")
    @Email(message = "{Candidate.Email.Msg}")
    @NotNull(message = "{NotNull.Msg}")
    private String email;
    @Column(name = "phone")
    @NotNull(message = "{NotNull.Msg}")
    @Pattern(regexp="\\(\\d{3}\\)\\d{3}-\\d{4}")
    private String phone;
    @Column(name = "cv")
    private String cv;
    @Column(name = "address")
    private String address;
    

    public void setFileLogo(MultipartFile file) {
        this.fileLogo = file;
    }

    public void setFileCV(MultipartFile fileCV) {
        this.fileCV = fileCV;
    }

    public MultipartFile getFileCV() {
        return fileCV;
    }

    public MultipartFile getFileLogo() {
        return fileLogo;
    }
    @Column(name = "logo")
    private String logo;
    @Transient
    private MultipartFile fileLogo;
    @Transient
    private MultipartFile fileCV;
    @JoinColumn(name = "id_job", referencedColumnName = "id")
    @ManyToOne
    private Job idJob;
    @OneToMany(mappedBy = "idCandidate")
    private Collection<DonTuyenDung> dontuyendungCollection;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_acc", referencedColumnName = "id")
    private Accounts idAcc;
    public Candidate() {
    }

    public void setIdAcc(Accounts idAcc) {
        this.idAcc = idAcc;
    }

    public Accounts getIdAcc() {
        return idAcc;
    }

    public Candidate(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Job getIdJob() {
        return idJob;
    }

    public void setIdJob(Job idJob) {
        this.idJob = idJob;
    }

    @XmlTransient
    public Collection<DonTuyenDung> getDontuyendungCollection() {
        return dontuyendungCollection;
    }

    public void setDontuyendungCollection(Collection<DonTuyenDung> dontuyendungCollection) {
        this.dontuyendungCollection = dontuyendungCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidate)) {
            return false;
        }
        Candidate other = (Candidate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sang.pojo.Candidate_1[ id=" + id + " ]";
    }
    
}
