package com.qdm.cg.common.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.cg.common.modal.User;
@Repository
public interface UserRepositry extends JpaRepository<User, Integer>{



}
