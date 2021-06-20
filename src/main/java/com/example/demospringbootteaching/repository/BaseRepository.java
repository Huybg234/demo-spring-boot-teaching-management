package com.example.demospringbootteaching.repository;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Data
@Repository
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseRepository {

  @Autowired
  SessionFactory sessionFactory;

  public Session getSession() {
    return sessionFactory.openSession();
  }

}
