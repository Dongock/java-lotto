package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoStoreTest {

    @Test
    @DisplayName("Money를 통해 로또들을 구매할 수 있다.")
    void buy() {
        Lotto lotto = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6));
        LottoStore lottoStore = new LottoStore();
        Money money = new Money(1000);

        Lottos lottos = lottoStore.buy(money, new TestLottoStrategy(lotto));

        assertThat(lottos).containsExactly(lotto);
    }

    static class TestLottoStrategy implements LottoGenerateStrategy {
        private final Lotto lotto;

        TestLottoStrategy(Lotto lotto) {
            this.lotto = lotto;
        }


        @Override
        public Lotto generateLottoNumbers(List<Integer> lottoNumberPool) {
            return this.lotto;
        }
    }
}