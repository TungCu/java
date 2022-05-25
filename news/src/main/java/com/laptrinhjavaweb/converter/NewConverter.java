package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

@Component
public class NewConverter {

	public NewEntity toEntity(NewDTO newDTO) {
		NewEntity newEntity = new NewEntity();
		newEntity.setTitle(newDTO.getTitle());
		newEntity.setContent(newDTO.getContent());
		newEntity.setShortDescription(newDTO.getShortDescription());
		newEntity.setThumbnail(newDTO.getThumbnail());
		return newEntity;
	}

	public NewDTO toDTO(NewEntity newEntity) {
		NewDTO newDTO = new NewDTO();
		if (newEntity.getId() != null) {
			newDTO.setId(newEntity.getId());
		}
		newDTO.setTitle(newEntity.getTitle());
		newDTO.setContent(newEntity.getContent());
		newDTO.setShortDescription(newEntity.getShortDescription());
		newDTO.setThumbnail(newEntity.getThumbnail());
		newDTO.setCreatedDate(newEntity.getCreatedDate());
		newDTO.setCreatedDate(newEntity.getCreatedDate());
		newDTO.setModifiedBy(newEntity.getModifiedBy());
		newDTO.setModifiedDate(newEntity.getModifiedDate());
		newDTO.setCategoryCode(newEntity.getCategory().getCode());
		return newDTO;
	}

	public NewEntity toEntity(NewDTO newDTO, NewEntity oldEntity) {
		oldEntity.setTitle(newDTO.getTitle());
		oldEntity.setContent(newDTO.getContent());
		oldEntity.setShortDescription(newDTO.getShortDescription());
		oldEntity.setThumbnail(newDTO.getThumbnail());
		return oldEntity;
	}

}
