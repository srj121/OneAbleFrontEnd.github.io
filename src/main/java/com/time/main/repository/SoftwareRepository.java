package com.time.main.repository;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicUpdate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.client.result.UpdateResult;
import com.time.main.entity.Softwares;

@Repository

public class SoftwareRepository {

	@Autowired
	MongoTemplate mongotemp;
	Softwares software = new Softwares();

	public List<Softwares> find() {
		return mongotemp.findAll(Softwares.class);
	}
//	public Softwares findName(Softwares soft) {
//		return mongotemp.insert(soft, "softwareName");
//	}
//	
//	public String update(String soft, String name) {
//		
//		Query query = new Query(Criteria.where("softwareName").is(name));
//		Update update = new BasicUpdate(soft);
//		UpdateResult ur = mongotemp.updateFirst(query, update, "software");
//		return "Updated document = "+ur.getMatchedCount();
//		}
//	

	public Softwares save(Softwares soft) {

		return mongotemp.save(soft);
	}

	public Softwares update(Softwares soft) {

		return mongotemp.save(soft);
	}

//	public List<Softwares> findByName(String Name){
//		 
//	}
//	public  List<Softwares> getsoftwarebyname(String softwareName) {
//		
//	Query query = new Query(Criteria.where("softwareName").regex("^"+softwareName));
//		
//		return mongotemp.find(query, Softwares.class);
//
//	}
	

		}
		

