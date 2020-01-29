package com.boot.mapper;

import com.boot.model.Boots;
import com.boot.model.BootsDto;

public class BootMapperImpl implements BootMapper {

	@Override
	public BootsDto bootsToBootsDto(Boots boots) {
		if(boots==null)
		{
			return null;
		}
		else
		{
			BootsDto dto = new BootsDto();
			dto.setBrand(boots.getBrand());
			dto.setName(boots.getName());
			dto.setEmail(boots.getEmail());
			dto.setSize(boots.getSize());
			dto.setUid(boots.getUid());
			return dto;
		}
	}

	@Override
	public Boots bootsDtoToBoots(BootsDto dto) {
		if(dto==null)
		{
			return null;
		}
		else
		{
			Boots boots = new Boots();
			boots.setBrand(dto.getBrand());
			boots.setName(dto.getName());
			boots.setEmail(dto.getEmail());
			boots.setSize(dto.getSize());
			boots.setUid(dto.getUid());
			return boots;
		}
	}

}
