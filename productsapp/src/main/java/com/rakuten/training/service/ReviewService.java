package com.rakuten.training.service;

import java.util.List;

import com.rakuten.training.domain.Review;

public interface ReviewService
{
	Review findById(int id);
	List<Review> findByProduct_Id(int pid);
	Review addReviewToProduct(Review r, int product_id);
}