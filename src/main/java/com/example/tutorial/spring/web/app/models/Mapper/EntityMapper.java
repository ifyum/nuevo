package com.example.tutorial.spring.web.app.models.Mapper;


/**
 * Contract for a generic dto to entity mapper.
 *
 * @param <D> - DTO type parameter.
 * @param <E> - Entity type parameter.
 */
public interface EntityMapper<E, D> {
    E toEntity(D dto);

    D toDto(E entity);
}
