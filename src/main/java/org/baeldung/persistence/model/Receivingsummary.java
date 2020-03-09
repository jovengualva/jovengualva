package org.baeldung.persistence.model;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.aerogear.security.otp.api.Base32;

@Entity
@Table(name = "receivingsummary")
public class Receivingsummary {

    @Id
    @Basic(optional = false)
    @Column(name = "ReceivingNo", nullable = false, length = 45)
    private String receivingNo;

   

    private String remarks;

    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    
   

    public Receivingsummary() {
        super(); 
        this.createdDate = new Date();
        
    }

    public String getReceivingNo() {
        return receivingNo;
    }

    public void setReceivingNo(final String receivingNo) {
        this.receivingNo = receivingNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(final String remarks) {
        this.remarks = remarks;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    
     public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

  

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((receivingNo == null) ? 0 : receivingNo.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Receivingsummary user = (Receivingsummary) obj;
        if (!receivingNo.equals(user.receivingNo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Receivingsummary [receivingNo=").append(receivingNo).append(", remarks=").append(remarks).append("]");
        return builder.toString();
    }

}