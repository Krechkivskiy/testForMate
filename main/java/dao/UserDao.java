package dao;

import db.DataBaceConnetcion;
import model.UserModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;

public class UserDao {
   private EntityManagerFactory connection;

    public UserDao() {
        connection = DataBaceConnetcion.getConnection();
    }

    public void addUser(UserModel user) {
        EntityManager entityManager = connection.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    public UserModel checkIsPresent(String login) {
        Query select_u_from_userModel_u = connection.createEntityManager().createQuery("select u from UserModel u");
        List resultList = select_u_from_userModel_u.getResultList();
        Iterator iterator = resultList.iterator();
        while (iterator.hasNext()) {
            UserModel currentUser = (UserModel) iterator.next();
            if (currentUser.getLogin().equals(login)) {
                return currentUser;
            }
        }
        return null;
    }
}
