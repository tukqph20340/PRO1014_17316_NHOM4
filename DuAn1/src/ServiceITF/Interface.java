/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceITF;

import DomainModels.Nhacungcap_model;
import java.util.List;

/**
 *
 * @author vitam
 */
public interface Interface {

    public List<Nhacungcap_model> getAllFormNhaCC();
    public List<Nhacungcap_model> fina();

    public String AddFormNhaCC(Nhacungcap_model nc);

    public String UpdateFormNhaCC(Nhacungcap_model nc);

    public String DeleteFormNhaCC(Nhacungcap_model nc);

}
