package cn.itcast.bos.service.base;

import cn.itcast.bos.domain.base.Area;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AreaService {
    public void saveBatch(List<Area> areas);

    public Page<Area> findPageData(Specification<Area> specification, Pageable pageable);
}
