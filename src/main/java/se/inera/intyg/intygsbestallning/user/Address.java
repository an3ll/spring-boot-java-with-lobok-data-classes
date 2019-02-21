package se.inera.intyg.intygsbestallning.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Builder.Default
    private String streetName = "TolvGatan";

    @Builder.Default
    private Integer streetNumber = 12;

    @Builder.Default
    private String city = "Tolvköping";

    @Builder.Default
    private Country country = Country.TWELVELAND;

}
