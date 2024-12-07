package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String inputCarNames(){
        System.out.println("경주할 자동차 이름 (이름은 쉼표(,)기준으로 구분)");
        return Console.readLine();
    }

    public int inputTrialCount(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        try{
            int trialCount = Integer.parseInt(Console.readLine());
            checkIsPositiveNumber(trialCount);
            return trialCount;
        }
        catch(NumberFormatException e){
            throw new IllegalArgumentException("[Error] 숫자를 입력해주세요.");
        }
    }

    private void checkIsPositiveNumber(int trialCount){
        if(trialCount>0){
            throw new IllegalArgumentException("[Error] 양수를 입력해주세요.");
        }
    }
}
