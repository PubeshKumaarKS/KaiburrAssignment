//Pubesh
package com.kaiburr.kaiburr.Repository;

import com.kaiburr.kaiburr.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository <Student,String> {
}
