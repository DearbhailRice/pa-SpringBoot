package uk.ac.belfastmet.tasks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.tasks.domain.Task;


 /**
  * 
  * @author ric19171870
  *
  */
@Repository
public interface TasksRepository extends CrudRepository<Task,Long> {

}

