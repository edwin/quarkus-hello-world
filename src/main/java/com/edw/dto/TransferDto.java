package com.edw.dto;

import java.math.BigDecimal;

/**
 * <pre>
 *     com.edw.dto.TransferDto
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 01 Jul 2021 13:10
 */
public class TransferDto {

    private String accountFrom;
    private String accountTo;
    private BigDecimal amount;

    public TransferDto() {
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
