package DAO;

import entity.MovieGenreEntity;

public class MovieGenreDAO extends BaseDAO<MovieGenreEntity> {

    public MovieGenreDAO() {
        super();
        setEntityClass(MovieGenreEntity.class);
    }
}
