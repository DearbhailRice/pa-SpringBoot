package uk.ac.belfastmet.tasks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.tasks.domain.Task;

 @Repository
 /**
  * 
  * @author ric19171870
  *
  */
public interface TasksRepository extends CrudRepository<Task,Long> {

}

