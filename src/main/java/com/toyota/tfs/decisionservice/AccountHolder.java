package com.toyota.tfs.decisionservice;

//import com.opencsv.bean.CsvBindByName;

public class AccountHolder {

	// added following for Machine Learning options
	private String treatmentOutcome;

	// added the following values for the fuse process
	private String corrrelationID;
	private int splitCount;
	private int splitIndex;
	private String errorMessage;

	// These getters and members added by me to cover the rules -- goes down to
	// next comment
	public String getCallList() {
		return callList;
	}

	public void setCallList(String callList) {
		this.callList = callList;
	}

	public String getMismatch() {
		return mismatch;
	}

	public void setMismatch(String mismatch) {
		this.mismatch = mismatch;
	}

	public String getCurrentStage() {
		return currentStage;
	}

	public void setCurrentStage(String currentStage) {
		this.currentStage = currentStage;
	}

	public String getProb() {
		return prob;
	}

	public void setProb(String prob) {
		this.prob = prob;
	}

	// added for rules processing
	private String callList;
	private String mismatch;
	private String currentStage;
	private String prob;
	private Double BAR;
	private Double risk_score;
	private String risk_level;
	private Integer skip_ID;
	// End of custom process getters and setters and class data members not part
	// of original csv file

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getAct_DT_1() {
		return Act_DT_1;
	}

	public void setAct_DT_1(String act_DT_1) {
		Act_DT_1 = act_DT_1;
	}

	public String getAct_DT_2() {
		return Act_DT_2;
	}

	public void setAct_DT_2(String act_DT_2) {
		Act_DT_2 = act_DT_2;
	}

	public String getAct_DT_3() {
		return Act_DT_3;
	}

	public void setAct_DT_3(String act_DT_3) {
		Act_DT_3 = act_DT_3;
	}

	public String getIs_Active() {
		return Is_Active;
	}

	public void setIs_Active(String is_Active) {
		Is_Active = is_Active;
	}

	public String getGross_Due_Amount() {
		return Gross_Due_Amount;
	}

	public void setGross_Due_Amount(String gross_Due_Amount) {
		Gross_Due_Amount = gross_Due_Amount;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getBflag() {
		return Bflag;
	}

	public void setBflag(String bflag) {
		Bflag = bflag;
	}

	public String getBflag_Processed() {
		return Bflag_Processed;
	}

	public void setBflag_Processed(String bflag_Processed) {
		Bflag_Processed = bflag_Processed;
	}

	public String getBat_DT() {
		return Bat_DT;
	}

	public void setBat_DT(String bat_DT) {
		Bat_DT = bat_DT;
	}

	public String getPosting_Status() {
		return Posting_Status;
	}

	public void setPosting_Status(String posting_Status) {
		Posting_Status = posting_Status;
	}

	public String getClosed_Date() {
		return Closed_Date;
	}

	public void setClosed_Date(String closed_Date) {
		Closed_Date = closed_Date;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getRegion_Code() {
		return Region_Code;
	}

	public void setRegion_Code(String region_Code) {
		Region_Code = region_Code;
	}

	public String getRate() {
		return Rate;
	}

	public void setRate(String rate) {
		Rate = rate;
	}

	public String getDcode() {
		return Dcode;
	}

	public void setDcode(String dcode) {
		Dcode = dcode;
	}

	public String getDisc_Rate() {
		return Disc_Rate;
	}

	public void setDisc_Rate(String disc_Rate) {
		Disc_Rate = disc_Rate;
	}

	public String getTerm_Count() {
		return Term_Count;
	}

	public void setTerm_Count(String term_Count) {
		Term_Count = term_Count;
	}

	public String getScore() {
		return Score;
	}

	public void setScore(String score) {
		Score = score;
	}

	public String getEphone() {
		return Ephone;
	}

	public void setEphone(String ephone) {
		Ephone = ephone;
	}

	public String getInsert_DT() {
		return Insert_DT;
	}

	public void setInsert_DT(String insert_DT) {
		Insert_DT = insert_DT;
	}

	public String getCount30() {
		return Count30;
	}

	public void setCount30(String count30) {
		Count30 = count30;
	}

	public String getCount60() {
		return Count60;
	}

	public void setCount60(String count60) {
		Count60 = count60;
	}

	public String getCount90() {
		return Count90;
	}

	public void setCount90(String count90) {
		Count90 = count90;
	}

	public String getHOME_IS_MOBILE() {
		return HOME_IS_MOBILE;
	}

	public void setHOME_IS_MOBILE(String hOME_IS_MOBILE) {
		HOME_IS_MOBILE = hOME_IS_MOBILE;
	}

	public String getHNFlag() {
		return HNFlag;
	}

	public void setHNFlag(String hNFlag) {
		HNFlag = hNFlag;
	}

	public String getHphone() {
		return Hphone;
	}

	public void setHphone(String hphone) {
		Hphone = hphone;
	}

	public String getHOME_PHONE_OWNERSHIP() {
		return HOME_PHONE_OWNERSHIP;
	}

	public void setHOME_PHONE_OWNERSHIP(String hOME_PHONE_OWNERSHIP) {
		HOME_PHONE_OWNERSHIP = hOME_PHONE_OWNERSHIP;
	}

	public String getLANGUAGE_PREFERENCE() {
		return LANGUAGE_PREFERENCE;
	}

	public void setLANGUAGE_PREFERENCE(String lANGUAGE_PREFERENCE) {
		LANGUAGE_PREFERENCE = lANGUAGE_PREFERENCE;
	}

	public String getEntry_DT() {
		return Entry_DT;
	}

	public void setEntry_DT(String entry_DT) {
		Entry_DT = entry_DT;
	}

	public String getExt_DT() {
		return Ext_DT;
	}

	public void setExt_DT(String ext_DT) {
		Ext_DT = ext_DT;
	}

	public String getLC_DT() {
		return LC_DT;
	}

	public void setLC_DT(String lC_DT) {
		LC_DT = lC_DT;
	}

	public String getLC1() {
		return LC1;
	}

	public void setLC1(String lC1) {
		LC1 = lC1;
	}

	public String getLIST_1() {
		return LIST_1;
	}

	public void setLIST_1(String lIST_1) {
		LIST_1 = lIST_1;
	}

	public String getList_Region_1() {
		return List_Region_1;
	}

	public void setList_Region_1(String list_Region_1) {
		List_Region_1 = list_Region_1;
	}

	public String getLIST_STATUS_1() {
		return LIST_STATUS_1;
	}

	public void setLIST_STATUS_1(String lIST_STATUS_1) {
		LIST_STATUS_1 = lIST_STATUS_1;
	}

	public String getMATURITY_DATE() {
		return MATURITY_DATE;
	}

	public void setMATURITY_DATE(String mATURITY_DATE) {
		MATURITY_DATE = mATURITY_DATE;
	}

	public String getMflag() {
		return Mflag;
	}

	public void setMflag(String mflag) {
		Mflag = mflag;
	}

	public String getMNFlag() {
		return MNFlag;
	}

	public void setMNFlag(String mNFlag) {
		MNFlag = mNFlag;
	}

	public String getMOBILE_PHONE() {
		return MOBILE_PHONE;
	}

	public void setMOBILE_PHONE(String mOBILE_PHONE) {
		MOBILE_PHONE = mOBILE_PHONE;
	}

	public String getMOBILE_PHONE_OWNERSHIP() {
		return MOBILE_PHONE_OWNERSHIP;
	}

	public void setMOBILE_PHONE_OWNERSHIP(String mOBILE_PHONE_OWNERSHIP) {
		MOBILE_PHONE_OWNERSHIP = mOBILE_PHONE_OWNERSHIP;
	}

	public String getPayment_Count() {
		return Payment_Count;
	}

	public void setPayment_Count(String payment_Count) {
		Payment_Count = payment_Count;
	}

	public String getPayment_Due_Count() {
		return Payment_Due_Count;
	}

	public void setPayment_Due_Count(String payment_Due_Count) {
		Payment_Due_Count = payment_Due_Count;
	}

	public String getNext_DT() {
		return Next_DT;
	}

	public void setNext_DT(String next_DT) {
		Next_DT = next_DT;
	}

	public String getPayment_Paid_Count() {
		return Payment_Paid_Count;
	}

	public void setPayment_Paid_Count(String payment_Paid_Count) {
		Payment_Paid_Count = payment_Paid_Count;
	}

	public String getPayment_Left_Count() {
		return Payment_Left_Count;
	}

	public void setPayment_Left_Count(String payment_Left_Count) {
		Payment_Left_Count = payment_Left_Count;
	}

	public String getUA4() {
		return UA4;
	}

	public void setUA4(String uA4) {
		UA4 = uA4;
	}

	public String getUA7() {
		return UA7;
	}

	public void setUA7(String uA7) {
		UA7 = uA7;
	}

	public String getOind() {
		return Oind;
	}

	public void setOind(String oind) {
		Oind = oind;
	}

	public String getU_Amount_Due() {
		return U_Amount_Due;
	}

	public void setU_Amount_Due(String u_Amount_Due) {
		U_Amount_Due = u_Amount_Due;
	}

	public String getOFlag() {
		return OFlag;
	}

	public void setOFlag(String oFlag) {
		OFlag = oFlag;
	}

	public String getPAYOFF_AMOUNT() {
		return PAYOFF_AMOUNT;
	}

	public void setPAYOFF_AMOUNT(String pAYOFF_AMOUNT) {
		PAYOFF_AMOUNT = pAYOFF_AMOUNT;
	}

	public String getP_D_Date() {
		return P_D_Date;
	}

	public void setP_D_Date(String p_D_Date) {
		P_D_Date = p_D_Date;
	}

	public String getProcessing_Date() {
		return Processing_Date;
	}

	public void setProcessing_Date(String processing_Date) {
		Processing_Date = processing_Date;
	}

	public String getP_D_Date_1() {
		return P_D_Date_1;
	}

	public void setP_D_Date_1(String p_D_Date_1) {
		P_D_Date_1 = p_D_Date_1;
	}

	public String getPD30_Count() {
		return PD30_Count;
	}

	public void setPD30_Count(String pD30_Count) {
		PD30_Count = pD30_Count;
	}

	public String getPD60_Count() {
		return PD60_Count;
	}

	public void setPD60_Count(String pD60_Count) {
		PD60_Count = pD60_Count;
	}

	public String getPD90_Count() {
		return PD90_Count;
	}

	public void setPD90_Count(String pD90_Count) {
		PD90_Count = pD90_Count;
	}

	public String getRCflag() {
		return RCflag;
	}

	public void setRCflag(String rCflag) {
		RCflag = rCflag;
	}

	public String getRcode() {
		return Rcode;
	}

	public void setRcode(String rcode) {
		Rcode = rcode;
	}

	public String getRflag() {
		return Rflag;
	}

	public void setRflag(String rflag) {
		Rflag = rflag;
	}

	public String getSPECIAL_HANDLING_FLAG() {
		return SPECIAL_HANDLING_FLAG;
	}

	public void setSPECIAL_HANDLING_FLAG(String sPECIAL_HANDLING_FLAG) {
		SPECIAL_HANDLING_FLAG = sPECIAL_HANDLING_FLAG;
	}

	public String getSC1() {
		return SC1;
	}

	public void setSC1(String sC1) {
		SC1 = sC1;
	}

	public String getSS1() {
		return SS1;
	}

	public void setSS1(String sS1) {
		SS1 = sS1;
	}

	public String getSAS2() {
		return SAS2;
	}

	public void setSAS2(String sAS2) {
		SAS2 = sAS2;
	}

	public String getSTATE() {
		return STATE;
	}

	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}

	public String getRT5() {
		return RT5;
	}

	public void setRT5(String rT5) {
		RT5 = rT5;
	}

	public String getTIME_ZONE_IND() {
		return TIME_ZONE_IND;
	}

	public void setTIME_ZONE_IND(String tIME_ZONE_IND) {
		TIME_ZONE_IND = tIME_ZONE_IND;
	}

	public String getTOT_MNTHS_EXT_12MNTH() {
		return TOT_MNTHS_EXT_12MNTH;
	}

	public void setTOT_MNTHS_EXT_12MNTH(String tOT_MNTHS_EXT_12MNTH) {
		TOT_MNTHS_EXT_12MNTH = tOT_MNTHS_EXT_12MNTH;
	}

	public String getTOT_MNTHS_EXT_6MNTH() {
		return TOT_MNTHS_EXT_6MNTH;
	}

	public void setTOT_MNTHS_EXT_6MNTH(String tOT_MNTHS_EXT_6MNTH) {
		TOT_MNTHS_EXT_6MNTH = tOT_MNTHS_EXT_6MNTH;
	}

	public String getTOT_TIMES_EXT_12MNTH() {
		return TOT_TIMES_EXT_12MNTH;
	}

	public void setTOT_TIMES_EXT_12MNTH(String tOT_TIMES_EXT_12MNTH) {
		TOT_TIMES_EXT_12MNTH = tOT_TIMES_EXT_12MNTH;
	}

	public String getTOT_TIMES_EXT_6MNTH() {
		return TOT_TIMES_EXT_6MNTH;
	}

	public void setTOT_TIMES_EXT_6MNTH(String tOT_TIMES_EXT_6MNTH) {
		TOT_TIMES_EXT_6MNTH = tOT_TIMES_EXT_6MNTH;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	public String getUA10() {
		return UA10;
	}

	public void setUA10(String uA10) {
		UA10 = uA10;
	}

	public String getUM2() {
		return UM2;
	}

	public void setUM2(String uM2) {
		UM2 = uM2;
	}

	public String getWORK_IS_MOBILE() {
		return WORK_IS_MOBILE;
	}

	public void setWORK_IS_MOBILE(String wORK_IS_MOBILE) {
		WORK_IS_MOBILE = wORK_IS_MOBILE;
	}

	public String getWNFlag() {
		return WNFlag;
	}

	public void setWNFlag(String wNFlag) {
		WNFlag = wNFlag;
	}

	public String getWORK_PHONE_OWNERSHIP() {
		return WORK_PHONE_OWNERSHIP;
	}

	public void setWORK_PHONE_OWNERSHIP(String wORK_PHONE_OWNERSHIP) {
		WORK_PHONE_OWNERSHIP = wORK_PHONE_OWNERSHIP;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setZIP(String zIP) {
		ZIP = zIP;
	}

	public String getCMA3000() {
		return CMA3000;
	}

	public void setCMA3000(String cMA3000) {
		CMA3000 = cMA3000;
	}

	public String getCMA3224() {
		return CMA3224;
	}

	public void setCMA3224(String cMA3224) {
		CMA3224 = cMA3224;
	}

	public String getCMA3579() {
		return CMA3579;
	}

	public void setCMA3579(String cMA3579) {
		CMA3579 = cMA3579;
	}

	public String getCMA3863() {
		return CMA3863;
	}

	public void setCMA3863(String cMA3863) {
		CMA3863 = cMA3863;
	}

	public String getCMA3329() {
		return CMA3329;
	}

	public void setCMA3329(String cMA3329) {
		CMA3329 = cMA3329;
	}

	public String getCMA3237() {
		return CMA3237;
	}

	public void setCMA3237(String cMA3237) {
		CMA3237 = cMA3237;
	}

	public String getCMA3580() {
		return CMA3580;
	}

	public void setCMA3580(String cMA3580) {
		CMA3580 = cMA3580;
	}

	public String getCMA3865() {
		return CMA3865;
	}

	public void setCMA3865(String cMA3865) {
		CMA3865 = cMA3865;
	}

	public String getCMA3116() {
		return CMA3116;
	}

	public void setCMA3116(String cMA3116) {
		CMA3116 = cMA3116;
	}

	public String getCMA3986() {
		return CMA3986;
	}

	public void setCMA3986(String cMA3986) {
		CMA3986 = cMA3986;
	}

	public String getAM201TOT() {
		return AM201TOT;
	}

	public void setAM201TOT(String aM201TOT) {
		AM201TOT = aM201TOT;
	}

	public String getCMA_3001() {
		return CMA_3001;
	}

	public void setCMA_3001(String cMA_3001) {
		CMA_3001 = cMA_3001;
	}

	public String getCMA_3100() {
		return CMA_3100;
	}

	public void setCMA_3100(String cMA_3100) {
		CMA_3100 = cMA_3100;
	}

	public String getCMA_3109() {
		return CMA_3109;
	}

	public void setCMA_3109(String cMA_3109) {
		CMA_3109 = cMA_3109;
	}

	public String getCMA_3123() {
		return CMA_3123;
	}

	public void setCMA_3123(String cMA_3123) {
		CMA_3123 = cMA_3123;
	}

	public String getCMA_3148() {
		return CMA_3148;
	}

	public void setCMA_3148(String cMA_3148) {
		CMA_3148 = cMA_3148;
	}

	public String getCMA_3207() {
		return CMA_3207;
	}

	public void setCMA_3207(String cMA_3207) {
		CMA_3207 = cMA_3207;
	}

	public String getCMA_3273() {
		return CMA_3273;
	}

	public void setCMA_3273(String cMA_3273) {
		CMA_3273 = cMA_3273;
	}

	public String getCMA_3536() {
		return CMA_3536;
	}

	public void setCMA_3536(String cMA_3536) {
		CMA_3536 = cMA_3536;
	}

	public String getCMA_3913() {
		return CMA_3913;
	}

	public void setCMA_3913(String cMA_3913) {
		CMA_3913 = cMA_3913;
	}

	public String getCMA_3857() {
		return CMA_3857;
	}

	public void setCMA_3857(String cMA_3857) {
		CMA_3857 = cMA_3857;
	}

	public String getCMA_3938() {
		return CMA_3938;
	}

	public void setCMA_3938(String cMA_3938) {
		CMA_3938 = cMA_3938;
	}

	public String getCMA3002() {
		return CMA3002;
	}

	public void setCMA3002(String cMA3002) {
		CMA3002 = cMA3002;
	}

	public String getCMA3203() {
		return CMA3203;
	}

	public void setCMA3203(String cMA3203) {
		CMA3203 = cMA3203;
	}

	public String getCMA3215() {
		return CMA3215;
	}

	public void setCMA3215(String cMA3215) {
		CMA3215 = cMA3215;
	}

	public String getCMA3217() {
		return CMA3217;
	}

	public void setCMA3217(String cMA3217) {
		CMA3217 = cMA3217;
	}

	public String getCMA3235() {
		return CMA3235;
	}

	public void setCMA3235(String cMA3235) {
		CMA3235 = cMA3235;
	}

	public String getCMA3268() {
		return CMA3268;
	}

	public void setCMA3268(String cMA3268) {
		CMA3268 = cMA3268;
	}

	public String getCMA3333() {
		return CMA3333;
	}

	public void setCMA3333(String cMA3333) {
		CMA3333 = cMA3333;
	}

	public String getCMA3535() {
		return CMA3535;
	}

	public void setCMA3535(String cMA3535) {
		CMA3535 = cMA3535;
	}

	public String getCMA3747() {
		return CMA3747;
	}

	public void setCMA3747(String cMA3747) {
		CMA3747 = cMA3747;
	}

	public String getCMA3835() {
		return CMA3835;
	}

	public void setCMA3835(String cMA3835) {
		CMA3835 = cMA3835;
	}

	public String getCMA3854() {
		return CMA3854;
	}

	public void setCMA3854(String cMA3854) {
		CMA3854 = cMA3854;
	}

	public String getCMA3871() {
		return CMA3871;
	}

	public void setCMA3871(String cMA3871) {
		CMA3871 = cMA3871;
	}

	public String getCMA3872() {
		return CMA3872;
	}

	public void setCMA3872(String cMA3872) {
		CMA3872 = cMA3872;
	}

	public String getCMA3969() {
		return CMA3969;
	}

	public void setCMA3969(String cMA3969) {
		CMA3969 = cMA3969;
	}

	public String getCMA3546() {
		return CMA3546;
	}

	public void setCMA3546(String cMA3546) {
		CMA3546 = cMA3546;
	}

	public String getCMA3843() {
		return CMA3843;
	}

	public void setCMA3843(String cMA3843) {
		CMA3843 = cMA3843;
	}

	public String getCMA3844() {
		return CMA3844;
	}

	public void setCMA3844(String cMA3844) {
		CMA3844 = cMA3844;
	}

	public String getCMA3873() {
		return CMA3873;
	}

	public void setCMA3873(String cMA3873) {
		CMA3873 = cMA3873;
	}

	public String getCMA3895() {
		return CMA3895;
	}

	public void setCMA3895(String cMA3895) {
		CMA3895 = cMA3895;
	}

	public String getCMA3994() {
		return CMA3994;
	}

	public void setCMA3994(String cMA3994) {
		CMA3994 = cMA3994;
	}

	public String getCMA3120() {
		return CMA3120;
	}

	public void setCMA3120(String cMA3120) {
		CMA3120 = cMA3120;
	}

	public String getCMA_3135() {
		return CMA_3135;
	}

	public void setCMA_3135(String cMA_3135) {
		CMA_3135 = cMA_3135;
	}

	public String getCMA_3376() {
		return CMA_3376;
	}

	public void setCMA_3376(String cMA_3376) {
		CMA_3376 = cMA_3376;
	}

	public String getCMA_3862() {
		return CMA_3862;
	}

	public void setCMA_3862(String cMA_3862) {
		CMA_3862 = cMA_3862;
	}

	public String getCMA_3124() {
		return CMA_3124;
	}

	public void setCMA_3124(String cMA_3124) {
		CMA_3124 = cMA_3124;
	}

	public String getCMA_3164() {
		return CMA_3164;
	}

	public void setCMA_3164(String cMA_3164) {
		CMA_3164 = cMA_3164;
	}

	public String getCMA_3159() {
		return CMA_3159;
	}

	public void setCMA_3159(String cMA_3159) {
		CMA_3159 = cMA_3159;
	}

	public String getAT01() {
		return AT01;
	}

	public void setAT01(String aT01) {
		AT01 = aT01;
	}

	public String getPscore() {
		return Pscore;
	}

	public void setPscore(String pscore) {
		Pscore = pscore;
	}

	public String getPRAT() {
		return PRAT;
	}

	public void setPRAT(String pRAT) {
		PRAT = pRAT;
	}

	public String getAratio() {
		return Aratio;
	}

	public void setAratio(String aratio) {
		Aratio = aratio;
	}

	public String getLT_CHRG_BAL_AMT() {
		return LT_CHRG_BAL_AMT;
	}

	public void setLT_CHRG_BAL_AMT(String lT_CHRG_BAL_AMT) {
		LT_CHRG_BAL_AMT = lT_CHRG_BAL_AMT;
	}

	public String getExtns() {
		return Extns;
	}

	public void setExtns(String extns) {
		Extns = extns;
	}

	public String getNdate() {
		return Ndate;
	}

	public void setNdate(String ndate) {
		Ndate = ndate;
	}

	public String getOterm_Count() {
		return Oterm_Count;
	}

	public void setOterm_Count(String oterm_Count) {
		Oterm_Count = oterm_Count;
	}

	public String getPERIODS_EXTENDED() {
		return PERIODS_EXTENDED;
	}

	public void setPERIODS_EXTENDED(String pERIODS_EXTENDED) {
		PERIODS_EXTENDED = pERIODS_EXTENDED;
	}

	public String getDELQ_MAX() {
		return DELQ_MAX;
	}

	public void setDELQ_MAX(String dELQ_MAX) {
		DELQ_MAX = dELQ_MAX;
	}

	public String getBad_Number() {
		return Bad_Number;
	}

	public void setBad_Number(String bad_Number) {
		Bad_Number = bad_Number;
	}

	public String getBL_FLAG() {
		return BL_FLAG;
	}

	public void setBL_FLAG(String bL_FLAG) {
		BL_FLAG = bL_FLAG;
	}

	public String getDAFlag() {
		return DAFlag;
	}

	public void setDAFlag(String dAFlag) {
		DAFlag = dAFlag;
	}

	public String getEflag() {
		return Eflag;
	}

	public void setEflag(String eflag) {
		Eflag = eflag;
	}

	public String getLS_FLAG() {
		return LS_FLAG;
	}

	public void setLS_FLAG(String lS_FLAG) {
		LS_FLAG = lS_FLAG;
	}

	public String getNflag() {
		return Nflag;
	}

	public void setNflag(String nflag) {
		Nflag = nflag;
	}

	public String getNO_CONTACT() {
		return NO_CONTACT;
	}

	public void setNO_CONTACT(String nO_CONTACT) {
		NO_CONTACT = nO_CONTACT;
	}

	public String getPST_Home_Area_Flag() {
		return PST_Home_Area_Flag;
	}

	public void setPST_Home_Area_Flag(String pST_Home_Area_Flag) {
		PST_Home_Area_Flag = pST_Home_Area_Flag;
	}

	public String getSB() {
		return SB;
	}

	public void setSB(String sB) {
		SB = sB;
	}

	public String getSflag() {
		return Sflag;
	}

	public void setSflag(String sflag) {
		Sflag = sflag;
	}

	public String getAflag() {
		return Aflag;
	}

	public void setAflag(String aflag) {
		Aflag = aflag;
	}

	// @CsvBindByName
	private String ID;

	// @CsvBindByName
	private String Act_DT_1;

	// @CsvBindByName
	private String Act_DT_2;

	// @CsvBindByName
	private String Act_DT_3;

	// @CsvBindByName
	private String Is_Active;

	// @CsvBindByName
	private String Gross_Due_Amount;

	// @CsvBindByName
	private Double BALANCE;

	// @CsvBindByName
	private String Region;

	// @CsvBindByName
	private String Bflag;

	// @CsvBindByName
	private String Bflag_Processed;

	// @CsvBindByName
	private String Bat_DT;

	// @CsvBindByName
	private String Posting_Status;

	// @CsvBindByName
	private String Closed_Date;

	// @CsvBindByName
	private String Grade;

	// @CsvBindByName
	private String Region_Code;

	// @CsvBindByName
	private String Rate;

	// @CsvBindByName
	private String Dcode;

	// @CsvBindByName
	private String Disc_Rate;

	// @CsvBindByName
	private String Term_Count;

	// @CsvBindByName
	private String Score;

	// @CsvBindByName
	private String Ephone;

	// @CsvBindByName
	private String Insert_DT;

	// @CsvBindByName
	private String Count30;

	// @CsvBindByName
	private String Count60;

	// @CsvBindByName
	private String Count90;

	// @CsvBindByName
	private String HOME_IS_MOBILE;

	// @CsvBindByName
	private String HNFlag;

	// @CsvBindByName
	private String Hphone;

	// @CsvBindByName
	private String HOME_PHONE_OWNERSHIP;

	// @CsvBindByName
	private String LANGUAGE_PREFERENCE;

	// @CsvBindByName
	private String Entry_DT;

	// @CsvBindByName
	private String Ext_DT;

	// @CsvBindByName
	private String LC_DT;

	// @CsvBindByName
	private String LC1;

	// @CsvBindByName
	private String LIST_1;

	// @CsvBindByName
	private String List_Region_1;

	// @CsvBindByName
	private String LIST_STATUS_1;

	// @CsvBindByName
	private String MATURITY_DATE;

	// @CsvBindByName
	private String Mflag;

	// @CsvBindByName
	private String MNFlag;

	// @CsvBindByName
	private String MOBILE_PHONE;

	// @CsvBindByName
	private String MOBILE_PHONE_OWNERSHIP;

	// @CsvBindByName
	private String Payment_Count;

	// @CsvBindByName
	private String Payment_Due_Count;

	// @CsvBindByName
	private String Next_DT;

	// @CsvBindByName
	private String Payment_Paid_Count;

	// @CsvBindByName
	private String Payment_Left_Count;

	// @CsvBindByName
	private String UA4;

	// @CsvBindByName
	private String UA7;

	// @CsvBindByName
	private String Oind;

	// @CsvBindByName
	private String U_Amount_Due;

	// @CsvBindByName
	private String OFlag;

	// @CsvBindByName
	private String PAYOFF_AMOUNT;

	// @CsvBindByName
	private String P_D_Date;

	// @CsvBindByName
	private String Processing_Date;

	// @CsvBindByName
	private String P_D_Date_1;

	// @CsvBindByName
	private String PD30_Count;

	// @CsvBindByName
	private String PD60_Count;

	// @CsvBindByName
	private String PD90_Count;

	// @CsvBindByName
	private String RCflag;

	// @CsvBindByName
	private String Rcode;

	// @CsvBindByName
	private String Rflag;

	// @CsvBindByName
	private String SPECIAL_HANDLING_FLAG;

	// @CsvBindByName
	private String SC1;

	// @CsvBindByName
	private String SS1;

	// @CsvBindByName
	private String SAS2;

	// @CsvBindByName
	private String STATE;

	// @CsvBindByName
	private String RT5;

	// @CsvBindByName
	private String TIME_ZONE_IND;

	// @CsvBindByName
	private String TOT_MNTHS_EXT_12MNTH;

	// @CsvBindByName
	private String TOT_MNTHS_EXT_6MNTH;

	// @CsvBindByName
	private String TOT_TIMES_EXT_12MNTH;

	// @CsvBindByName
	private String TOT_TIMES_EXT_6MNTH;

	// @CsvBindByName
	private String TYPE;

	// @CsvBindByName
	private String UA10;

	// @CsvBindByName
	private String UM2;

	// @CsvBindByName
	private String WORK_IS_MOBILE;

	// @CsvBindByName
	private String WNFlag;

	// @CsvBindByName
	private String WORK_PHONE_OWNERSHIP;

	// @CsvBindByName
	private String ZIP;

	// @CsvBindByName
	private String CMA3000;

	// @CsvBindByName
	private String CMA3224;

	// @CsvBindByName
	private String CMA3579;

	// @CsvBindByName
	private String CMA3863;

	// @CsvBindByName
	private String CMA3329;

	// @CsvBindByName
	private String CMA3237;

	// @CsvBindByName
	private String CMA3580;

	// @CsvBindByName
	private String CMA3865;

	// @CsvBindByName
	private String CMA3116;

	// @CsvBindByName
	private String CMA3986;

	// @CsvBindByName
	private String AM201TOT;

	// @CsvBindByName
	private String CMA_3001;

	// @CsvBindByName
	private String CMA_3100;

	// @CsvBindByName
	private String CMA_3109;

	// @CsvBindByName
	private String CMA_3123;

	// @CsvBindByName
	private String CMA_3148;

	// @CsvBindByName
	private String CMA_3207;

	// @CsvBindByName
	private String CMA_3273;

	// @CsvBindByName
	private String CMA_3536;

	// @CsvBindByName
	private String CMA_3913;

	// @CsvBindByName
	private String CMA_3857;

	// @CsvBindByName
	private String CMA_3938;

	// @CsvBindByName
	private String CMA3002;

	// @CsvBindByName
	private String CMA3203;

	// @CsvBindByName
	private String CMA3215;

	// @CsvBindByName
	private String CMA3217;

	// @CsvBindByName
	private String CMA3235;

	// @CsvBindByName
	private String CMA3268;

	// @CsvBindByName
	private String CMA3333;

	// @CsvBindByName
	private String CMA3535;

	// @CsvBindByName
	private String CMA3747;

	// @CsvBindByName
	private String CMA3835;

	// @CsvBindByName
	private String CMA3854;

	// @CsvBindByName
	private String CMA3871;

	// @CsvBindByName
	private String CMA3872;

	// @CsvBindByName
	private String CMA3969;

	// @CsvBindByName
	private String CMA3546;

	// @CsvBindByName
	private String CMA3843;

	// @CsvBindByName
	private String CMA3844;

	// @CsvBindByName
	private String CMA3873;

	// @CsvBindByName
	private String CMA3895;

	// @CsvBindByName
	private String CMA3994;

	// @CsvBindByName
	private String CMA3120;

	// @CsvBindByName
	private String CMA_3135;

	// @CsvBindByName
	private String CMA_3376;

	// @CsvBindByName
	private String CMA_3862;

	// @CsvBindByName
	private String CMA_3124;

	// @CsvBindByName
	private String CMA_3164;

	// @CsvBindByName
	private String CMA_3159;

	// @CsvBindByName
	private String AT01;

	// @CsvBindByName
	private String Pscore;

	// @CsvBindByName
	private String PRAT;

	// @CsvBindByName
	private String Aratio;

	// @CsvBindByName
	private String LT_CHRG_BAL_AMT;

	// @CsvBindByName
	private String Extns;

	// @CsvBindByName
	private String Ndate;

	// @CsvBindByName
	private String Oterm_Count;

	// @CsvBindByName
	private String PERIODS_EXTENDED;

	// @CsvBindByName
	private String DELQ_MAX;

	// @CsvBindByName
	private Integer DaysDelinquent;

	// @CsvBindByName
	private String Bad_Number;

	// @CsvBindByName
	private String BL_FLAG;

	// @CsvBindByName
	private String DAFlag;

	// @CsvBindByName
	private String Eflag;

	// @CsvBindByName
	private String LS_FLAG;

	// @CsvBindByName
	private String Nflag;

	// @CsvBindByName
	private String NO_CONTACT;

	// @CsvBindByName
	private String PST_Home_Area_Flag;

	// @CsvBindByName
	private String SB;

	// @CsvBindByName
	private String Sflag;

	// @CsvBindByName
	private String Aflag;

	public String getTreatmentOutcome() {
		return treatmentOutcome;
	}

	public void setTreatmentOutcome(String treatmentOutcome) {
		this.treatmentOutcome = treatmentOutcome;
	}

	public String getCorrrelationID() {
		return corrrelationID;
	}

	public void setCorrrelationID(String corrrelationID) {
		this.corrrelationID = corrrelationID;
	}

	public int getSplitCount() {
		return splitCount;
	}

	public void setSplitCount(int splitCount) {
		this.splitCount = splitCount;
	}

	public int getSplitIndex() {
		return splitIndex;
	}

	public void setSplitIndex(int splitIndex) {
		this.splitIndex = splitIndex;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Double getBALANCE() {
		return this.BALANCE;
	}

	public void setBALANCE(Double BALANCE) {
		this.BALANCE = BALANCE;
	}

	public AccountHolder() {
	}

	public Integer getDaysDelinquent() {
		return this.DaysDelinquent;
	}

	public void setDaysDelinquent(Integer DaysDelinquent) {
		this.DaysDelinquent = DaysDelinquent;
	}

	public Double getBAR() {
		return this.BAR;
	}

	public void setBAR(Double BAR) {
		this.BAR = BAR;
	}

	public String getRisk_level() {
		return this.risk_level;
	}

	public void setRisk_level(String risk_level) {
		this.risk_level = risk_level;
	}

	public Double getRisk_score() {
		return this.risk_score;
	}

	public void setRisk_score(Double risk_score) {
		this.risk_score = risk_score;
	}

	public java.lang.Integer getSkip_ID() {
		return this.skip_ID;
	}

	public void setSkip_ID(java.lang.Integer skip_ID) {
		this.skip_ID = skip_ID;
	}

}
