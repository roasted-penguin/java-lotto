package lotto.function;

import java.util.Collections;
import java.util.List;


public class Validation {

    public static void validatePurchase(int price){
        if(price%1000!=0) throw new IllegalArgumentException("[ERROR] 입력한 값이 1000원 단위가 아닙니다.");
    }

    public static void validateNumbers(List<Integer> numbers) {
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        if(numbers.size()!=6) throw new IllegalArgumentException("[ERROR] 6개의 숫자를 입력 해주세요.");
        if(numbers.size() != numbers.stream().distinct().count()) throw new IllegalArgumentException("[ERROR] 중복된 숫자가 있습니다!");
        if(min<1||min>45) throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        if(max<1||max>45) throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
    }
}
