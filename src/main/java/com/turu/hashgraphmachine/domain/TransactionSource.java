package com.turu.hashgraphmachine.domain;

import java.util.List;

/**
 * Created by turu on 21/05/17.
 */
public interface TransactionSource {
    List<HashgraphTransaction> nextBatch();
}
