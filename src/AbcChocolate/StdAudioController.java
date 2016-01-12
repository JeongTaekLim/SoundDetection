package AbcChocolate;

public class StdAudioController {
	
	private static int LEFT=0;
	private static int RIGHT=1;

	public double[][] getStereoArray(double[] mixedData) {
		
		double[][] stereoData;
		
		stereoData=new double[2][mixedData.length/2];
		int posLeft=0, posRight=0;
		for (int i = 0; i < mixedData.length; i++) {
			if(i%2 == 0)
				stereoData[LEFT][posLeft++]=mixedData[i];
			else
				stereoData[RIGHT][posRight++]=mixedData[i];
		}
		return stereoData;
	}
	
	public double[] getLeftArray(double[] mixedData){
		double[] result= new double[mixedData.length/2];
		int pos=0;
		for(int i=0;i<mixedData.length;i=i+2){
			result[pos++]=mixedData[i];
		}
		return result;
	}
	public double[] getRightArray(double[] mixedData){
		
		double[] result= new double[mixedData.length/2];
		int pos=0;
		for(int i=1;i<mixedData.length;i=i+2){
			result[pos++]=mixedData[i];
		}
		return result;
	}
}
