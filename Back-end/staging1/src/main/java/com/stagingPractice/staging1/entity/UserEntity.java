package com.stagingPractice.staging1.entity;

	
	
	import java.time.LocalDate;
	import java.time.LocalDateTime;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	/**
	 * User class defines user
	 */
	@Entity
	@Table(name="users")
	public class UserEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="user_id",columnDefinition="serial")
	    private Integer userid;
		@Column(name="username", length=30)
	    private String username;
		@Column(name="password", length=50)
	    private String password;
		@Column(name="email", length=255)
	    private String email;
		@Column(name="first_name", length=50)
	    private String firstName;
		@Column(name="last_name", length=50)
	    private String lastName;
		@Column(name="role_type", length=5)
	    private String roleType = "user";
		@Column(name="registration_date")
	    private LocalDate registrationDate;
		@Column(name="last_login", columnDefinition="TIMESTAMPTZ(2)")
	    private LocalDateTime lastLogin;


}
