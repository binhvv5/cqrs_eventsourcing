package com.techbank.account.query.api.queries;

import com.techbank.account.common.dto.AccountType;
import com.techbank.cqrs.core.queries.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindAccountByTypeQuery extends BaseQuery {
    private AccountType accountType;
}
