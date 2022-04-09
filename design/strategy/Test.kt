package design.strategy

fun main() {
    val promotionAction = PromotionAction(LijianPromotionStrategy())
    promotionAction.executePromotion()

    PromotionStrategyFactory.getPromotionStrategy("lijian").doPromotion()
}