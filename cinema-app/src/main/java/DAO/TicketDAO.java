package DAO;

import entity.TicketEntity;

public class TicketDAO extends BaseDAO<TicketEntity> {

    public TicketDAO() {
        super();
        setEntityClass(TicketEntity.class);
    }
}
