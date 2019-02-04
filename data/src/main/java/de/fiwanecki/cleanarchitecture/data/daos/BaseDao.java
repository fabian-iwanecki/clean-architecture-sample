package de.fiwanecki.cleanarchitecture.data.daos;

public interface BaseDao<T> {
    T select(Object id);

    T merge(T t);

    void delete(T t);
}
