package com.iddink.eidmongo.dao;

import com.iddink.eidmongo.model.group.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupDAO extends MongoRepository<Group, Long> {
}
