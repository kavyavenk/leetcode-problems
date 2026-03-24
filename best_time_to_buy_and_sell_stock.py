# two pointer: L to buy + R to sell
# if R < L update L
# if profit > maxprofit update profit

from typing import List

class best_time_to_buy_and_sell_stock:
    def buySellStock (self, prices: List[int]) -> int:
        l, r = 0, 1 # left=buy, right=sell
        maxP = 0

        while (r < len(prices)):
            # check if profitable?
            if prices[l] < prices[r]:
                profit = prices[r] - prices[l]
                maxP = max(maxP, profit)
            else:
                l = r
            r+=1
        return maxP