package service;

import java.util.List;

import DAO.BaseDAO;

public class BaseService<E, D extends BaseDAO<E>> {

    private D dao;

    public BaseService(D dao) {
        this.dao = dao;
    }

    public boolean delete(E entity) {
        return dao.delete(entity);
    }

    public boolean update(E entity) {
        return dao.update(entity);
    }

    public boolean add(E entity) {
        return dao.create(entity);
    }

    public E getById(int id) {
        return  dao.getById(id);
    }

    public List<E> getAll() {
        return dao.getAll();
    }

}
