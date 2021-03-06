package light.pay.api.wallets.request;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@Builder
public class TransferRequest {
    @SerializedName("source_wallet_id")
    private String sourceID;

    @SerializedName("target_wallet_id")
    private String targetID;

    @With
    private Long amount;
}
