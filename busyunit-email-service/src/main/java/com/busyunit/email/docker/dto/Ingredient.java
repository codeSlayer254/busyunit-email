/**
 * {@code BookRequest} represents a request during book creation.
 * <p/>
 *
 * @author Ram Ayall
 * @since 17/03/19
 */
package com.busyunit.email.docker.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

    private String id;
    private String ingradientName;
}
