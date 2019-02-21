package se.inera.intyg.intygsbestallning.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String firstName = "Tolvan";

    @Builder.Default
    private String lastName = "Tolvansson";

    @Builder.Default
    private Address address = new Address();
}
