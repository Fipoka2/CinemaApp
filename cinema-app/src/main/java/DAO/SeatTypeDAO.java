package DAO;

import entity.SeatTypeEntity;

public class SeatTypeDAO extends BaseDAO<SeatTypeEntity> {

    public SeatTypeDAO() {
        super();
        setEntityClass(SeatTypeEntity.class);
    }
}
