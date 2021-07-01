package com.edw.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <pre>
 *     com.edw.model.Transfer
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 01 Jul 2021 12:55
 */
@Entity
@Table(name = "T_TRANSFER")
public class Transfer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String accountFrom;
    private String accountTo;
    private Date transferDate;
    private BigDecimal amount;

    public Transfer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
