package de.fiwanecki.cleanarchitecture.data.mappers;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseMapper<E, T> {
    public abstract T mapFrom(E from);

    public T map(E from) {
        return mapFrom(from);
    }

    public List<T> mapList(List<E> from) {
        return from.stream().map(this::mapFrom).collect(Collectors.toList());
    }
}
