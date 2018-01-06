package DAO;

import entity.MovieEntity;

public class MovieDAO extends BaseDAO<MovieEntity> {

    public MovieDAO() {
        super();
        setEntityClass(MovieEntity.class);
    }
}
