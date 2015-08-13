package bean;

import common.AbstractRequest;

/**
 * Created by zhouning on 2015/7/31.
 */
public class FundQueryReq extends AbstractRequest {
    private String customerId;
    private String fundAccount;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFundAccount() {
        return fundAccount;
    }

    public void setFundAccount(String fundAccount) {
        this.fundAccount = fundAccount;
    }
}
