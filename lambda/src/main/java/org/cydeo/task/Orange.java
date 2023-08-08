package org.cydeo.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//@AllArgsConstructor
@Data
@Builder
public class Orange {

    private int weight;
    private Color color;
}
