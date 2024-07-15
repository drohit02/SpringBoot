package com.mapping.SocialMedia.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@NotBlank(message = "user name is required")
	private String userName;
	
	@NotNull(message = "mobile number is required")
	private int mobileNumber;

	@OneToOne(mappedBy = "user")
	private Profile profile;

	@OneToMany(mappedBy = "user")
	private List<Post> posts;

	@ManyToMany
	@JoinTable(
			name = "user_group", 
			joinColumns = @JoinColumn(name = "user_id"), 
			inverseJoinColumns = @JoinColumn(name = "group_id")
			)
	private Set<SocialGroup> socialGroups = new HashSet<>();

}
