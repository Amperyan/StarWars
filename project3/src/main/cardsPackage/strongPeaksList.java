package cardsPackage;

import java.util.Vector;

// получение из экспериментальной дифрактограммы списка "главных" максимумов, 
// вычисление параметра fom (figure of merit), сортировка списка по этому параметру
public class strongPeaksList {
	final double thetaError = 0.5;
	final double intensityError = 10;
	public final int NUMBEROFPEAKS = 8;
	protected Peaks[] list;
	protected double fom3;
	protected double fom8;

	public strongPeaksList() {
	}

	public strongPeaksList(Vector<Peaks> array) {
		for (int i = 0; i < NUMBEROFPEAKS; i++) {
			list[i] = array.get(i);
		}
	}

	public void print() {
		for (int i = 0; i < NUMBEROFPEAKS; i++) {
			System.out.println(this.list[i].theta + " "
					+ this.list[i].intensity);
		}
	}

	public strongPeaksList fom3Calc(strongPeaksList array) {
		double thetaDiffSum = 0, intensityDiffSum = 0;
		for (int i = 0; i < 3; i++) {
			thetaDiffSum = thetaDiffSum
					+ Math.abs(this.list[i].theta - array.list[i].theta);
			intensityDiffSum = intensityDiffSum
					+ Math.abs(this.list[i].intensity - array.list[i].intensity);
		}
		this.fom3 = 3 / 8 * (1 - thetaDiffSum / (8 * thetaError))
				* (1 - intensityDiffSum / (8 * intensityError));
		return this;
	}

	public strongPeaksList fom8Calc(strongPeaksList array) {
		double thetaDiffSum = 0, intensityDiffSum = 0;
		for (int i = 0; i < 8; i++) {
			thetaDiffSum = thetaDiffSum
					+ Math.abs(this.list[i].theta - array.list[i].theta);
			intensityDiffSum = intensityDiffSum
					+ Math.abs(this.list[i].intensity - array.list[i].intensity);
		}
		this.fom3 = 8 / 8 * (1 - thetaDiffSum / (8 * thetaError))
				* (1 - intensityDiffSum / (8 * intensityError));
		return this;
	}
}
