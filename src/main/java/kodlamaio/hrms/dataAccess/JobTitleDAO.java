package kodlamaio.hrms.dataAccess;

import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDAO extends JpaRepository<JobTitle,Integer> {
}
