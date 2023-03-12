
package Service;
import entity.Sala;
import java.util.List;


public interface Isala {
    public List<Sala> getAllSal();
    public Sala getSalById (long id);
    public void saveSal (Sala Sala);
    public void delete (long id);

    public Sala getsalById(Long idConcierto);
}
