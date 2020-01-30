package com.boot.service;

import java.util.List;

import com.boot.dao.BootsDao;
import com.boot.dao.BootsDaoImpl;
import com.boot.model.Boots;

public class BootServiceImpl implements BootService {
	BootsDao dao = null;
	{
		dao = new BootsDaoImpl();
	}
	@Override
	public Boots createBoot(Boots boot) {
		
		return dao.createBoots(boot);
	}
	@Override
	public List<Boots> fetchBoots(int id) {
		return dao.fetchBoots(id);
	}
	@Override
	public List<Boots> allBoots() {
		return dao.allBoots();
	}
	@Override
	public Boots findById(int id) {
		
		return dao.findById(id);
	}
	@Override
	public Boots updateBoot(Boots b) {
		
		return dao.updateBoot(b);
	}
	@Override
	public void deleteBoot(int id) {
		dao.deleteBoot(id);
		
	}

}
