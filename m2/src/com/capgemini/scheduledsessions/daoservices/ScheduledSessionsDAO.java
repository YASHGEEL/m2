package com.capgemini.scheduledsessions.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.scheduledsessions.beans.ScheduledSessions;

/*Here Pre-defined JpaRepository ((super class) crud repository ) is used 
as it contains all generic CRUD operations on a repository.*/

public interface ScheduledSessionsDAO extends JpaRepository<ScheduledSessions, Integer> {
}