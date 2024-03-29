package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.launchcode.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LaunchCode
 */
@Transactional
@Repository
public interface CheeseDao extends CrudRepository<Cheese, Integer> {

    List<Cheese> findByOwner(User user);

}
