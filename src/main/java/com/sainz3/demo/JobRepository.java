package com.sainz3.demo;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository <Job, Long> {
}
