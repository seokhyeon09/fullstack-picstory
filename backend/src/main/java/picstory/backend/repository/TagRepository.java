package picstory.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picstory.backend.domain.Tag;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag, Long> {
    //멤버아이디와 태그가 모두 일치하는 함수생성
    Optional<Tag> findByMember_IdAndLabel(Long memberId, String label);

    //특정 회원이 가진 태그를 모두 조회하는 내용
    List<Tag> findAllByMember_Id(Long memberId);

    //특정 회원이 회원의 태그가 전달받은 라벨안에 있는지?
    List<Tag> findAllByMember_IdAndLabelIn(Long memberId, Collection<String> labels);

    Optional<Tag> findByIdAndMember_Id(Long id, Long memberId);
}
