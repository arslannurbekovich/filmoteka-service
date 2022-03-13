package kg.megacom.filmotekaservice.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SmsSendService {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC56418a8a4190e7de030ac1aec4a1bf6e";
    public static final String AUTH_TOKEN = "e4e89bbefd366a19a415b0fb69b4989d";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+996557724400"),
                new com.twilio.type.PhoneNumber("+16626678218"),
                "Уважаемый абонент, вы получили бонус в размере 10000000$!")
                .create();

        System.out.println(message.getSid());
    }
}
