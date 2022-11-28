/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceITF;

import DomainModels.NhaCungCapModel;
import java.util.List;

/**
 *
 * @author vitam
 */
public interface NhaCungCapITF {
    public List<NhaCungCapModel> getAllFormNhaCC();
     public String AddFormNhaCC(NhaCungCapModel nc);
     public List<NhaCungCapModel> getAll();
      public String XoaFormNhaCC(NhaCungCapModel nc);
       public String UpdateFormNhaCC(NhaCungCapModel nc);
}
