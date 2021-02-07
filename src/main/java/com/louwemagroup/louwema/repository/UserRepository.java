package com.louwemagroup.louwema.repository;


import com.louwemagroup.louwema.dao.UserApp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<UserApp,Long> {
}
