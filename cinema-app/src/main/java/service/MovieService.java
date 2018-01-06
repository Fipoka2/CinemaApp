package service;

import DAO.MovieDAO;
import entity.MovieEntity;

public class MovieService extends BaseService<MovieEntity, MovieDAO> {

    public MovieService(MovieDAO dao) {
        super(dao);
    }
}
