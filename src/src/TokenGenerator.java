import java.time.Instant;
import java.util.UUID;

public class TokenGenerator {
    private String token;

    TokenGenerator(){
        this.token = generateToken();
    }
    public String generateToken(){
        StringBuilder token = new StringBuilder();
        long currentTimeInMilisecond = Instant.now().toEpochMilli();
        return token.append(currentTimeInMilisecond).append("-")
                .append(UUID.randomUUID().toString()).toString();
    }

    public String getToken(){
        return this.token;
    }
}
