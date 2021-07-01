package com.edw.service;

import com.edw.dto.TransferDto;
import com.edw.model.Transfer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * <pre>
 *     com.edw.service.TransferService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 01 Jul 2021 13:00
 */
@Transactional
@ApplicationScoped
public class TransferService {
    @Inject
    EntityManager em;

    public List<Transfer> findAll() {
        return em.createQuery("select t from Transfer t", Transfer.class).getResultList();
    }

    public Long create(TransferDto transferDto) {
        Transfer transfer = new Transfer();
        transfer.setAccountFrom(transferDto.getAccountFrom());
        transfer.setAccountTo(transferDto.getAccountTo());
        transfer.setAmount(transferDto.getAmount());
        transfer.setTransferDate(new Date());
        em.persist(transfer);

        return transfer.getId();
    }

}
