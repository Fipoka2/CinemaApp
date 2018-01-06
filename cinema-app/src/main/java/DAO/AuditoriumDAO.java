package DAO;

import entity.AuditoriumEntity;

public class AuditoriumDAO extends BaseDAO<AuditoriumEntity> {

    public AuditoriumDAO() {
        super();
        setEntityClass(AuditoriumEntity.class);
    }
}
