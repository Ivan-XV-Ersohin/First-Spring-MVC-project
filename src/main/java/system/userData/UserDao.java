package system.userData;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private UserModel userModel;

    public UserDao() {
    }

    public UserModel findUser(long id) {
        return Factory.getSessionFactory().openSession().get(UserModel.class, id);
    }

    public void updateDatabase(UserModel userModel) {
        Session session = Factory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            if (session.get(UserModel.class, userModel.getId()).equals(userModel)) {
                session.update(userModel);
            } else {
                session.save(userModel);
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public boolean deliteUser(UserModel userModel) {
        boolean isDeleted = false;
        Session session = Factory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(userModel);
            transaction.commit();
            isDeleted = true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            return isDeleted;
        }
    }
}
