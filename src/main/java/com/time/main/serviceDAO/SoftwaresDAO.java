package com.time.main.serviceDAO;

import java.util.List;

import com.time.main.entity.Softwares;


public interface SoftwaresDAO {


	public abstract List<Softwares> getAll();
	public Softwares save(Softwares soft);
	public Softwares update(Softwares soft);
//	List<Softwares> getName(String name);
}
