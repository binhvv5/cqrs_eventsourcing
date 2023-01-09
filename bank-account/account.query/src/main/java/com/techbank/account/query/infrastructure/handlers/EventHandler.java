package com.techbank.account.query.infrastructure.handlers;

import com.techbank.account.common.events.*;

public interface EventHandler {
    void on(AccountOpenedEvent event);
    void on(FundsDepositedEvent event);
    void on(FundsWithdrawnEvent event);
    void on(AccountClosedEvent event);
    void on(AccountUpdatedEvent event);
}
