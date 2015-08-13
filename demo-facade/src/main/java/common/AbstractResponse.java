package common;

import java.io.Serializable;

/**
 * Created by zhouning on 2015/7/31.
 */
public class AbstractResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String respCode;
    private String respMsg;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
}
