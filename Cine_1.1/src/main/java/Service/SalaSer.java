/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author jvlan
 */
@Service
public class SalaSer implements Isala {

    @Autowired
    private Repository IsalaRepository;

    @Override
    public List<SalaSer> getAllSal() {
        return (List<SalaSer>) IsalaRepository.findAll();
    }

    @Override
    public SalaSer getSalById(long id) {
        return IsalaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcert(SalaSer sala) {
        IsalaRepository.save(sala);
    }

    @Override
    public void delete(long id) {
        IsalaRepository.deleteById(id);
    }
}
