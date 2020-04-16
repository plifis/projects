package nalog;

public class calculateTax {
	public float pl;
	public float sq;
	public float rnt;
	public float oCos;
	public float baseD;
	public float k1;
	public float k2;
	public float sizeTax;
	public float insurance;
	public String total;
	
	
	public calculateTax (float s, float bD, float kf1, float kf2,float sT, float ins){ 
	sq = s;
	baseD = bD;
	k1 = kf1;
	k2 = kf2;
	sizeTax = sT;
	insurance = ins;
	}
	
	public calculateTax (float p, float r, float oC, float sT, float ins){
	pl = p;
	rnt = r;
	oCos = oC;
	sizeTax = sT;
	insurance = ins;	
	}
	
	public calculateTax (float p, float sT, float ins) {
	pl =p;
	sizeTax = sT;
	insurance = ins;
	}
	
	
	public String getENVD (float s, float bD, float kf1, float kf2, float sT, float ins) {
		total = Float.toString(sq*baseD*k1*k2*(sizeTax/100)-ins);
		return total;
	}
	
	public String getUSN_D_R (float p, float r, float oC, float sT, float ins) {
		total = Float.toString((pl-r-oC)*(sT/100)-ins);
		return total;
	}

	public String getUSN_D (float p, float sT, float ins) {
		total = Float.toString((p*(sT/100))-ins);
		return total;
	}
	}


