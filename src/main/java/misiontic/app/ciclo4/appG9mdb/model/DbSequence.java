package misiontic.app.ciclo4.appG9mdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document (collection = "db_sequence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DbSequence {
    @Id
    private String id;
    private Integer seq;
}
