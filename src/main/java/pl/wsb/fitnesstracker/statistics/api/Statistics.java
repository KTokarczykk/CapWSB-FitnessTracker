package pl.wsb.fitnesstracker.statistics.api;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Statistics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false)
    private int totalTrainings;

    @Column(nullable = false)
    private double totalDistance;

    @Column
    private int totalCaloriesBurned;

    public Statistics(Long userId, int totalTrainings, double totalDistance, int totalCaloriesBurned) {
        this.userId = userId;
        this.totalTrainings = totalTrainings;
        this.totalDistance = totalDistance;
        this.totalCaloriesBurned = totalCaloriesBurned;
    }
}
