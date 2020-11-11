package hiber.service;

import hiber.config.AppConfig;
import hiber.dao.UserDao;
import hiber.dao.UserDaoImp;
import hiber.model.Car;
import hiber.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

  /* @Transactional
   //@Override
   public void add(Car car) {
      userDao.add(car);
   }

   @Transactional(readOnly = true)
  // @Override
   public List<Car> listCars() {
      return userDao.listCars();
   }*/

   @Transactional
   @Override
   public User getUserByCar(String name, int series) {
      return userDao.getUserByCar(name, series);
   }


}
