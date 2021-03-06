package com.geeksforgeeks.majorproject;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionRequest {
    private String sender;
    private String receiver;

    private Double amount;

    public boolean validate() {
        if (this.amount <= 0 || this.amount == null || this.sender == null || this.receiver == null)
            return false;
        return true;
    }
}
