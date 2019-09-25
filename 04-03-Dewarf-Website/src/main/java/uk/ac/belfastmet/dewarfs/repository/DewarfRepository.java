/**
 * 
 */
package uk.ac.belfastmet.dewarfs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.dewarfs.domain.Dewarf;
/**
 * @author ric19171870
 *
 */
@Repository
public interface DewarfRepository extends CrudRepository<Dewarf, Long>{

}
