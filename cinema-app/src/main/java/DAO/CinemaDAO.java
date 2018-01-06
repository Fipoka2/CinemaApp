package DAO;

import entity.CinemaEntity;

public class CinemaDAO extends BaseDAO<CinemaEntity> {

    public CinemaDAO() {
        super();
        setEntityClass(CinemaEntity.class);
    }
}
