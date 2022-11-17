/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import java.util.List;
import DomainModels.DienThoai;
import ServiceITF.DienThoaiService;
import Repository.DienThoaiRepository;

/**
 *
 * @author Kien
 */
public class DienThoaiServiceImpl implements DienThoaiService {

    private DienThoaiRepository repository = new DienThoaiRepository();

    @Override
    public List<DienThoai> getAll() {
        return repository.getAll();
    }

    @Override
    public List<DienThoai> insertDienThoai(List<DienThoai> list, DienThoai dt) {
        int check = repository.insert(dt);
        list = repository.getAll();
        return list;
    }

    @Override
    public List<DienThoai> updateDienThoai(List<DienThoai> list, DienThoai dt) {
        int check = repository.update(dt);
        list = repository.getAll();
        return list;
    }

    @Override
    public List<DienThoai> deleteDienThoai(List<DienThoai> list, String madt) {
        int check = repository.delete(madt);
        list = getAll();
        return list;
    }

}
