package lotto.domain;

import java.util.Objects;

public class LottoCount {
    private static final int LOTTO_PRICE = 1000;

    private final int count;

    public LottoCount(Money money) {
        this(money.getMoney() / LOTTO_PRICE);
    }

    public LottoCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("로또 구매 횟수는 0보다 작을 수 없습니다.");
        }
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public LottoCount subtractCount(LottoCount count) {
        return new LottoCount(this.count - count.getCount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoCount that = (LottoCount) o;
        return count == that.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
