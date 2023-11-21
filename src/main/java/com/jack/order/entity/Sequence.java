package com.jack.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "sequence")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sequence {
    @Id
    private int id;
    private int sequence;
}
