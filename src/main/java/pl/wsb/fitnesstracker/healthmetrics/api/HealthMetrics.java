package pl.wsb.fitnesstracker.healthmetrics.api;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.user.api.User;

@Entity
@Table(name = "Health_Metrics")
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(nullable = false)
    private String date;

    @Column
    private double weight;

    @Column
    private int height;

    @Column
    private String heartRate;

    public HealthMetrics(User user, String date, double weight, int height, String heartRate) {
        this.user = user;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
    }
}
