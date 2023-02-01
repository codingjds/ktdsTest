package drug_store;
/**
 * 약국
 * @author User
 *
 */
public class DrugStore {
	
	/**
	 * 감기환자
	 */
	Customer cold= new Customer();
	/**
	 * 콧물환자
	 */
	Customer runnyNose= new Customer();
	/**
	 * 근육통환자
	 */
	Customer musclePain= new Customer();
	
	/**
	 * 방문하다
	 */
	public void visit() {
		cold.name="장보고";
		cold.symptom="감기";
		
		runnyNose.name="홍길동";
		runnyNose.symptom="콧물";
		
		musclePain.name="이순신";
		musclePain.symptom="근육통";
	}
	
	/**
	 * 처방하다
	 */
	public void prescribe() {
		/*
		 * 감기환자에게는 "이름"님, 감기증상 있으셔서 종합감기약 처방해드립니다.
		 * 콧물환자에게는 "이름"님, 콧물증상 있으셔서 코막힘약 처방해드립니다.
		 * 근육통환자에게는 "이름"님, 근육통증상 있으셔서 근육이완제 처방해드립니다.
		 */
		//name=="" -> name.equals("")
		/**
		 * 감기환자
		 */
		String customerName=cold.name;
		String customerSymptom=cold.symptom;
		if(customerSymptom.equals("감기")) {
			System.out.printf("%s 님, %s 증상 있으셔서 종합감기약 처방해드립니다.\n",customerName,customerSymptom);
		}
		else if(customerSymptom.equals("콧물")) {
			System.out.printf("%s 님, %s 증상 있으셔서 코막힘약 처방해드립니다.\n",customerName,customerSymptom);
		}
		else if(customerSymptom.equals("근육통")) {
			System.out.printf("%s 님, %s 증상 있으셔서 근육이완제 처방해드립니다.\n",customerName,customerSymptom);
		}
		else {
			System.out.printf("%s 님, %s 증상에 해당하는 약이 없습니다.\n",customerName,customerSymptom);
		}
		
		/**
		 * 콧물환자
		 */
		customerName=runnyNose.name;
		customerSymptom=runnyNose.symptom;
		if(customerSymptom.equals("감기")) {
			System.out.printf("%s 님, %s 증상 있으셔서 종합감기약 처방해드립니다.\n",customerName,customerSymptom);
		}
		else if(customerSymptom.equals("콧물")) {
			System.out.printf("%s 님, %s 증상 있으셔서 코막힘약 처방해드립니다.\n",customerName,customerSymptom);
		}
		else if(customerSymptom.equals("근육통")) {
			System.out.printf("%s 님, %s 증상 있으셔서 근육이완제 처방해드립니다.\n",customerName,customerSymptom);
		}
		else {
			System.out.printf("%s 님, %s 증상에 해당하는 약이 없습니다.\n",customerName,customerSymptom);
		}
		
		/**
		 * 근육통환자
		 */
		customerName=musclePain.name;
		customerSymptom=musclePain.symptom;
		if(customerSymptom.equals("감기")) {
			System.out.printf("%s 님, %s 증상 있으셔서 종합감기약 처방해드립니다.\n",customerName,customerSymptom);
		}
		else if(customerSymptom.equals("콧물")) {
			System.out.printf("%s 님, %s 증상 있으셔서 코막힘약 처방해드립니다.\n",customerName,customerSymptom);
		}
		else if(customerSymptom.equals("근육통")) {
			System.out.printf("%s 님, %s 증상 있으셔서 근육이완제 처방해드립니다.\n",customerName,customerSymptom);
		}
		else {
			System.out.printf("%s 님, %s 증상에 해당하는 약이 없습니다.\n",customerName,customerSymptom);
		}
	}
}
