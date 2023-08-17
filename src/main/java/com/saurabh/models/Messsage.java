package com.saurabh.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Messsage {
    String name;
    String content;
}
