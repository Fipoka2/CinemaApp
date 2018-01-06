package service;

import DAO.GenreDAO;
import entity.GenreEntity;

public class GenreService extends BaseService<GenreEntity, GenreDAO> {

    public GenreService(GenreDAO dao) {
        super(dao);
    }
}
