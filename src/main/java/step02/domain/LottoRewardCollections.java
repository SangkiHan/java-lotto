package step02.domain;

import java.util.List;
import java.util.Objects;

public class LottoRewardCollections {
    private List<LottoReward> lottoRewards;

    private LottoRewardCollections(List<LottoReward> lottoRewards) {
        this.lottoRewards = lottoRewards;
    }

    public static LottoRewardCollections of(List<LottoReward> lottoRewards) {
        return new LottoRewardCollections(lottoRewards);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoRewardCollections that = (LottoRewardCollections) o;
        return Objects.equals(lottoRewards, that.lottoRewards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoRewards);
    }
}
