package generics;

public interface IEntityRepository <T extends  IEntitiy> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
