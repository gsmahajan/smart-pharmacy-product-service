package com.aiocdawacs.smart.admin.smartpharmacyproductservice.config;

import java.time.temporal.ChronoUnit;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SmartPharmacyConfig {

}

@Converter(autoApply = true)
class LocalDateTimeConverter implements AttributeConverter<java.time.LocalDateTime, java.sql.Timestamp> {

	@Override
	public java.sql.Timestamp convertToDatabaseColumn(java.time.LocalDateTime attribute) {
		return attribute == null ? null : java.sql.Timestamp.valueOf(attribute);
	}

	@Override
	public java.time.LocalDateTime convertToEntityAttribute(java.sql.Timestamp dbData) {
		return dbData == null ? null : dbData.toLocalDateTime().truncatedTo(ChronoUnit.SECONDS);
	}
}