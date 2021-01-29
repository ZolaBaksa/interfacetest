package com.cos.product.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

	public List<Product> findAll(){
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "국자", 5000, 1, Timestamp.valueOf("2021-01-29 00:00:00.0")));
		products.add(new Product(2, "의자", 500000, 2, Timestamp.valueOf("2021-01-29 01:00:00.0")));
		products.add(new Product(3, "남성양말", 1000, 3, Timestamp.valueOf("2021-01-29 02:00:00.0")));
		return products;
	}
	
	public Product findById(int id){
		return new Product(1, "국자", 5000, 1, Timestamp.valueOf("2021-01-29 00:00:00.0"));
	}
	
	public void save(SaveReqDto dto) {
		System.out.println("DB에 insert하기");
	}
	
	public void delete(int id) {
		System.out.println("DB에 삭제하기");
	}
	
	public void update(int id, UpdateReqDto dto) {
		// DAO연결해서 실행하다가 익섹션 터짐
		//throw new IllegalArgumentException("아규먼트를 잘못 넣음");
		System.out.println("DB에 수정하기");
	}
}