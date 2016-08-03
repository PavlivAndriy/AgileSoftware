package com.softserverinc.edu.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 37.0 on 03.08.2016.
 */

@Entity
public class WorkLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "issueId", referencedColumnName = "id", nullable = false)
    private Issue issueIdById;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", referencedColumnName = "id", nullable = false)
    private User userIdById;

    @Column(name = "time", nullable = false)
    private Date time;

    @Column(name = "amount")
    private int amount;

    public Long getId() {
        return id;
    }

    public Issue getIssueIdById() {
        return issueIdById;
    }

    public void setIssueIdById(Issue issueIdById) {
        this.issueIdById = issueIdById;
    }

    public User getUserIdById() {
        return userIdById;
    }

    public void setUserIdById(User userIdById) {
        this.userIdById = userIdById;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
