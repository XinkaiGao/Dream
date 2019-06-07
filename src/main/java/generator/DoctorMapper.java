package generator;

import com.ydl.dream.intf.po.Doctor;
import com.ydl.dream.intf.po.DoctorExample;
import com.ydl.dream.intf.po.DoctorWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    long countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoctorWithBLOBs record);

    int insertSelective(DoctorWithBLOBs record);

    List<DoctorWithBLOBs> selectByExampleWithBLOBs(DoctorExample example);

    List<Doctor> selectByExample(DoctorExample example);

    DoctorWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoctorWithBLOBs record, @Param("example") DoctorExample example);

    int updateByExampleWithBLOBs(@Param("record") DoctorWithBLOBs record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(DoctorWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DoctorWithBLOBs record);

    int updateByPrimaryKey(Doctor record);
}