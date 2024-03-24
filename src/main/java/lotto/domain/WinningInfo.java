package lotto.domain;

import java.util.HashMap;
import java.util.Map;

public class WinningInfo {

    private final Map<Rank, Integer> winningInfo;

    private WinningInfo(Map<Rank, Integer> winningInfo) {
        this.winningInfo = winningInfo;
    }

    public static WinningInfo of(PickedLottoNumbers pickedLottoNumbers, LottoNumbers winningNumbers) {
        HashMap<Rank, Integer> winningInfo = new HashMap<>();
        for (LottoNumbers pickedNumber : pickedLottoNumbers) {
            Rank rank = Rank.findRank(compareLottoNumbers(pickedNumber, winningNumbers));
            winningInfo.put(rank, winningInfo.getOrDefault(rank, 0) + 1);
        }
        return new WinningInfo(winningInfo);
    }

    private static int compareLottoNumbers(LottoNumbers pickedNumber, LottoNumbers winningNumbers) {
        return pickedNumber.compare(winningNumbers);
    }

    public int totalWinningMoney() {
        int totalWinningMoney = 0;
        for (Rank rank : winningInfo.keySet()) {
            totalWinningMoney += (rank.getWinningMoney() * this.count(rank));
        }
        return totalWinningMoney;
    }

    public int count(Rank rank) {
        return winningInfo.getOrDefault(rank, 0);
    }
}
