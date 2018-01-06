package DAO;

import entity.TicketTypeEntity;

public class TicketTypeDAO extends BaseDAO<TicketTypeEntity> {

    public TicketTypeDAO() {
        super();
        setEntityClass(TicketTypeEntity.class);
    }
}
