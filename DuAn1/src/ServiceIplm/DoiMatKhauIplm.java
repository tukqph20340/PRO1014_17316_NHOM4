/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import DomainModels.NhanVien;
import ServiceITF.IDoiMatKhauService;
import Repository.DoiMatKhauRepository;

/**
 *
 * @author DELL
 */
public class DoiMatKhauIplm implements IDoiMatKhauService {

    private DoiMatKhauRepository repo = new DoiMatKhauRepository();

    public DoiMatKhauIplm() {
    }

    @Override
    public Boolean doiMK(NhanVien x, String tk, String mk) {
        return repo.doiMK(x, tk, mk);
    }

}
