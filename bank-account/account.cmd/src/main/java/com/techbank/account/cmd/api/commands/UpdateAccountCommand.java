package com.techbank.account.cmd.api.commands;

import com.techbank.account.common.dto.AccountType;
import com.techbank.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class UpdateAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
}
