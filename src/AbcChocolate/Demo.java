package AbcChocolate;

import AbcChocolate.StdAudio;
import AbcChocolate.FFT;

public class Demo {

	public static void main(String[] args) {
		
		StdAudio mStdAudio = new StdAudio();
    	double[] d=mStdAudio.read("C:\\Users\\JeongTaek\\Desktop\\2015 하반기 창의과제\\100samples_16kHz_to_22kHz_stereo\\100samples_16kHz_stereo.wav");
    	
    	StdAudioController mStdAudioController = new StdAudioController();
    	double[][] dd= mStdAudioController.getStereoArray(d);
    	double[] d1=mStdAudioController.getLeftArray(d);
    	
    	double[] real=new double[1024];
    	double[] imag=new double[1024];
    	
    	for(int i=0;i<d1.length;i++){
    		real[i]=d1[i];
    	}
    	
    	FFT mFFT= new FFT(1024);
    	mFFT.fft(real, imag);
    	System.out.println("complete");
	}

}
