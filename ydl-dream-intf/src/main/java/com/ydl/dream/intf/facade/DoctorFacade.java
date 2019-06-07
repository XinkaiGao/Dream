package  com.ydl.dream.intf.facade;

import com.ydl.common.dto.BaseDtoResponse;
import com.ydl.dream.intf.po.Doctor;

import java.util.List;

public interface DoctorFacade {

    BaseDtoResponse<List<Doctor>> queryDoctorByIdList(List<Integer> request);

}
