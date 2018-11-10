package bsuir.dao;

import bsuir.model.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<UserEntity,Long> {
    @Query("SELECT u FROM UserEntity u WHERE u.login = :login and u.password = :password")
    UserEntity findByLoginAndPassword(@Param("login") String login, @Param("password") String password);

    @Query("SELECT u FROM UserEntity u WHERE u.login = :login ")
    UserEntity findByLogin(@Param("login") String login);

    @Query("select u from UserEntity u where u.role=2 order by u.id")
    List<UserEntity> getAllForwarders();
}
