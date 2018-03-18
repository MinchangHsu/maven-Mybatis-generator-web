package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.demo.common.BaseService;
import com.example.demo.mapper.MinTbCustomerMapper;
import com.example.demo.persistence.MinTbCustomer;

@Component
@Service
public class helloService extends BaseService{

	@Autowired
	private MinTbCustomerMapper minTbCustomerMapper;
	
	public int insertData(){
		MinTbCustomer record = new MinTbCustomer();
		record.setCreateName("使用者帳號");
		record.setCustmeContact("個人資料");
		record.setCustmeContactPhone("0921016252123");
		record.setCustmerAddr("忠孝東路走到軟");
		record.setCustmerFax("02-29278654");
		record.setCustmerName("黑人牙膏");
		record.setCustmerOpertor(20987653);
		record.setCustmeTelphone("0987678654");
		int resule = minTbCustomerMapper.insert(record);
		
		return resule;
		
	}
}
