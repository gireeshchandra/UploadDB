package com.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}