package robo.remote.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotionDto {

    private Direction direction;

    public enum Direction {
        FORWARD, LEFT, RIGHT, BACK
    }
}
