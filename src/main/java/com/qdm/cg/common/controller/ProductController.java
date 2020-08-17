package com.qdm.cg.common.controller;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdm.cg.common.exception.UserNotFoundException;
import com.qdm.cg.common.modal.Product;
import com.qdm.cg.common.modal.User;
import com.qdm.cg.common.repositry.ProductRepositry;
import com.qdm.cg.common.repositry.UserRepositry;

@RestController
@RequestMapping("/careGiver/managedCare")
public class ProductController {
	@Autowired
	private ProductRepositry productRepositry;
	@Autowired
	private UserRepositry userRepositry;

	@GetMapping("/product")
	public List<Product> getAllProduct() {
		return productRepositry.findAll();
	}

	@GetMapping("/product/get/{id}")
	public ResponseEntity<Product> getRecommendation(@PathVariable Integer id)
			throws UserNotFoundException {
		Product product = productRepositry.findById(id)
				.orElseThrow(() -> new UserNotFoundException("Product not found for this id :: " + id));
		return ResponseEntity.ok().body(product);
	}

	// GeT all User deatils
	@GetMapping("/user")
	public List<User> getAllUser() {
		return userRepositry.findAll();
	}
	
	@GetMapping("/userActivityStatus/get/{activityId}")
	public User getActivityStatus(@PathVariable Integer activityId) {
		Optional<User> user = userRepositry.findById(activityId);
		if (!user.isPresent()) {
			throw new UserNotFoundException("activityId-" + activityId);
		}
		return user.get();
	}

	// GetListMaritalStatus
	@GetMapping("/maritalStatus/get/{userId} ")
	public List<User> getMaritalStatus(@PathVariable String status) {
		List<User> userMaritalList = new LinkedList<User>();
		for (Iterator<User> iterator = userMaritalList.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			String statusid = user.getUserName();
			if (statusid != null) {
				user.getUserId();
				System.out.println(user.getUserId());
			} else {
				userMaritalList.add(user);
			}

		}
		return userRepositry.findAll();

	}

	// GetList Emotional Status
	@GetMapping("/emotionalStatus/get{userId}")
	public User getEmotionalStatus(Integer userId) {
		return userRepositry.getOne(userId);

	}

	// GetCGRecommend Equip
	@GetMapping("/recommendEquipment/{productId}")
	public List<Product> getRecommendEquipment(Integer productId) {
		return productRepositry.save(productId);
	}

}
