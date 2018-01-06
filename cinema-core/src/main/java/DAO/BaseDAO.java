package DAO;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.jboss.logging.Logger;

import java.util.List;

import database.SessionManager;

public abstract class BaseDAO<E> {

    private Class< E > entityClass;

    private Session currentSession;

    private final Logger LOGGER = Logger.getLogger(BaseDAO.class);

    public BaseDAO() {
        currentSession = SessionManager.getInstance().getSession();
    }

    void setEntityClass(final Class<E> classToSet){
        entityClass = classToSet;
    }

    public boolean update(E entity) {
        try {
            currentSession.beginTransaction();
            currentSession.update(entity);
            currentSession.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            LOGGER.error(ex.getStackTrace());
            return false;
        }
    }

    public boolean delete(E entity) {
        try {
            currentSession.beginTransaction();
            currentSession.delete(entity);
            currentSession.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            LOGGER.error(ex.getStackTrace());
            return false;
        }
    }

    public boolean create(E entity) {
        try {
            currentSession.beginTransaction();
            currentSession.save(entity);
            currentSession.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            LOGGER.error(ex.getStackTrace());
            return false;
        }
    }

    public E getById(int id) {
        try {
            currentSession.beginTransaction();
            E entity  = currentSession.get(entityClass, id);
            currentSession.getTransaction().commit();
            return entity;
        } catch (Exception ex) {
            LOGGER.error(ex.getStackTrace());
            return null;
        }
    }

    public List<E> getAll() {
        try {
            currentSession.beginTransaction();
            Query q = currentSession.createQuery( "FROM " + entityClass.getName());
            List<E> entityList  = q.list();
            currentSession.getTransaction().commit();
            return entityList;
        } catch (Exception ex) {
            LOGGER.error(ex.getStackTrace());
            return null;
        }
    }




}
