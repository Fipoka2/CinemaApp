package DAO;

import entity.GenreEntity;

public class GenreDAO extends BaseDAO<GenreEntity> {

    public GenreDAO() {
        super();
        setEntityClass(GenreEntity.class);
    }

}
