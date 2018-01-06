package database;

import org.hibernate.Session;

public class SessionManager {

    private static SessionManager instance;

    private Session session;

    private SessionManager() {
        session = null;
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        if (instance.session == null) {
            instance.session = HibernateSessionFactory.getSessionFactory().openSession();
        }
        return instance;
    }

    public Session getSession() {
        return session;
    }

    public void closeSession() {
        session.close();
    }
}
