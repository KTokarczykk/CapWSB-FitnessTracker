package pl.wsb.fitnesstracker.healthmetrics.api;

import jakarta.persistence.*;

@Entity
@Table(name = "Health_Metrics")
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String date;

    @Column
    private double weight;

    @Column
    private int height;

    @Column
    private String heartRate;

    public HealthMetrics(Long userId, String date, double weight, int height, String heartRate) {
        this.userId = userId;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
    }
}
