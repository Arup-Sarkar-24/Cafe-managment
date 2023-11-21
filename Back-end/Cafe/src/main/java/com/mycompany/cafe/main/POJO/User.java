package com.mycompany.cafe.main.POJO;

import java.io.Serializable;

import javax.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@NamedQuery(name="User.findByEmailId",query="select u from User u where u.email=:email")

@NamedQuery(name="User.getAllUser",query = "select new com.mycompany.cafe.main.wrapper.UserWrapper(u.id,u.name,u.email,u.contactNumber,u.status) from User u where u.role='user'")

@NamedQuery(name="User.updateStatus", query = "update User u set u.status=:status where u.id=:id")

@NamedQuery(name="User.getAllAdmin",query = "select u.email from User u where u.role='admin'")

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "user")
public class User implements Serializable{
	private static final long serilVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name = "name",length = 500)
	private String name;
	@Column
	private String contactNumber;
	@Column
	private String email;
	@Column
	private String password; 
	@Column
	private String status;
	@Column
	private String role;
	
}
