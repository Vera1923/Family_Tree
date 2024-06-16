package family_tree.model.writer;

import java.io.IOException;

public interface Writable<T> {
    void save(T familyTree) throws IOException;
    T load() throws IOException, ClassNotFoundException;
}
