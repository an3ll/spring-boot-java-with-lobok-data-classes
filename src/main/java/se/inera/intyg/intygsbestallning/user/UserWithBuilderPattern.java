package se.inera.intyg.intygsbestallning.user;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@EqualsAndHashCode
public class UserWithBuilderPattern {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String firstName = "Tolvan";

    @Builder.Default
    private String lastName = "Tolvansson";

    @Builder.Default
    private Address address = new Address();
}
