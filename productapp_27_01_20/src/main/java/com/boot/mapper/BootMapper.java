package com.boot.mapper;

import org.mapstruct.Mapper;

import com.boot.model.Boots;
import com.boot.model.BootsDto;

@Mapper
public interface BootMapper {
public BootsDto bootsToBootsDto(Boots boots);
public Boots bootsDtoToBoots(BootsDto dto);
}
