package umc.domain.mission.dto;

import lombok.Builder;

public class MissionResDTO {

    // 가게 내 미션 조회
    @Builder
    public record GetMission(
            Long missionId,
            Integer reward_point,
            String conditional,
            String start_dt,
            String end_dt
    ){}
}
