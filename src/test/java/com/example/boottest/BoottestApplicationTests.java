package com.example.boottest;

import com.example.boottest.dao.BrandDao;
import com.example.boottest.entity.BrandQuery;
import com.example.boottest.service.GetAllBrand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoottestApplicationTests {
	@Resource
	private BrandDao brandDao;
	@Resource
	private GetAllBrand getAllBrand;

	@Test
	public void contextLoads() {
		BrandQuery brandQuery=new BrandQuery();
		brandDao.selectBrandListByQuery(brandQuery).forEach(System.out::println);
		System.out.println("service");
		getAllBrand.getAll().forEach(System.out::println);
	}
}