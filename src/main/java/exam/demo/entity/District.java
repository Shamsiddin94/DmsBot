package exam.demo.entity;

import com.sun.istack.Nullable;
import exam.demo.entity.identity.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class District extends AbsEntity {
    private String name;

    @Column(nullable = true)
    private String description;

    @ManyToOne
    private Region region;
}
