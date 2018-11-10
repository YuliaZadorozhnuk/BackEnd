package bsuir.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "source", schema = "logistic", catalog = "")
public class SourceEntity {
    private long id;
    private String source;
//    private Collection<EntryRequisitionEntity> entryRequisitionsById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "source", nullable = false, length = 100)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SourceEntity that = (SourceEntity) o;
        return id == that.id &&
                Objects.equals(source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, source);
    }

//    @OneToMany(mappedBy = "sourceByIdSource")
//    public Collection<EntryRequisitionEntity> getEntryRequisitionsById() {
//        return entryRequisitionsById;
//    }
//
//    public void setEntryRequisitionsById(Collection<EntryRequisitionEntity> entryRequisitionsById) {
//        this.entryRequisitionsById = entryRequisitionsById;
//    }
}
