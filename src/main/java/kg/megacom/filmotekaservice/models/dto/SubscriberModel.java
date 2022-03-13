package kg.megacom.filmotekaservice.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class SubscriberModel {

    private String lastActionResult;

    private HashMap<String, Object> dynamicContext;

    public HashMap<String, Object> getDynamicContext() {
        return dynamicContext;
    }
}
