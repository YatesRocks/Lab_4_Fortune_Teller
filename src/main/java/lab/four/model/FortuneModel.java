package lab.four.model;

import java.util.AbstractList;

public class FortuneModel extends AbstractList<String> {
    private final String[] fortunes = new String[12];
    private int cursor = 0;

    public FortuneModel() {
        fortunes[0] = ("Beware of low-flying ducks and high-flying expectations today.");
        fortunes[1] = ("You will soon embark on a journey to find the perfect snack, only to realize it was in your pantry all along...");
        fortunes[2] = ("Your lucky numbers are 3, 14, 15, 92... oh wait, that's just pi. But hey, embrace the irrationality!");
        fortunes[3] = ("A smile will bring you good luck, but a mustache drawn on your finger will bring you even better luck.");
        fortunes[4] = ("A suspicious-looking squirrel may cross your path today. Approach with caution or offer it some nuts as a peace offering.");
        fortunes[5] = ("You'll discover that the secret ingredient to happiness is not actually listed on any recipe. It's probably Nutella.");
        fortunes[6] = ("Remember to always look on the bright side of life, unless you're in a dark room, then you might trip over something.");
        fortunes[7] = ("An unexpected windfall is coming your way! It might just be a gentle breeze, but hey, take what you can get.");
        fortunes[8] = ("Today, you'll realize that the fortune you seek is actually hiding at the bottom of a bag of potato chips.");
        fortunes[9] = ("Beware of falling pianos and rising expectations. Keep your umbrella handy, just in case.");
        fortunes[10] = ("You will soon encounter a fork in the road. Take it, because who knows, maybe there's a really good picnic spot around the corner.");
        fortunes[11] = ("Your lucky color for today is polka-dot. Wear it proudly and confuse everyone around you, it's the best way to keep life interesting.");
    }

    @Override
    public int size() {
        return fortunes.length;
    }

    @Override
    public String get(int index) {
        if (index < 12)
            return fortunes[index];
        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length 12");
    }

    public String next() {
        if (cursor == 11)
            cursor = 0;
        return fortunes[cursor++];
    }
}
