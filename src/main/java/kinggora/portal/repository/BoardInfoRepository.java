package kinggora.portal.repository;

import kinggora.portal.domain.BoardInfo;
import kinggora.portal.mapper.BoardInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BoardInfoRepository {

    private final BoardInfoMapper mapper;

    public Optional<BoardInfo> findBoardInfoById(Integer id) {
        return mapper.findBoardInfoById(id);
    }
    public List<BoardInfo> findBoardInfo() {
        return mapper.findBoardInfo();
    }
    public Integer saveBoardInfo(BoardInfo boardInfo) {
        mapper.saveBoardInfo(boardInfo);
        return boardInfo.getId();
    }
}
