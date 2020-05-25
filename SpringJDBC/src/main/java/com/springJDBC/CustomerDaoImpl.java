package com.springJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("custDao")
public class CustomerDaoImpl implements CustomerDao {
 
	@Autowired
	JdbcTemplate jTemplate;
	
	public void addCstomer(Customer c) {
		// TODO Auto-generated method stub

		String query="insert into customer values(?,?,?,?,?)";
		jTemplate.update(query,c.getCid(),c.getCname(),c.getEmail(),c.getPhone(),c.getCity());
	}
}
