/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2010question3;

/**
 *
 * @author kms080
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trail trail = new Trail();
        System.out.print(trail.isLevelTrailSegment(7, 8));
        System.out.print(trail.isDifficult());
    }
}

class Trail
{
	private int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        public Trail() {
            
        }
	public boolean isLevelTrailSegment(int start, int end)
	{
		int max = 0;
		int min = 0;
		int length = start - end;
		for(int i = start; i < length; i++) {
			if(markers[i] > max) {
				max = markers[i];	
			}
			else if(markers[i] < min) {
				min = markers[i];
			}	
		}
		return (max - min <= 10);
	}
	public boolean isDifficult()
	{
		int changes = 0;
		int current = 0;
		int length = markers.length - 1;
		for(int i = 1; i < length; i++) {
			current = markers[i] - markers[i - 1];
			if(Math.abs(current) >= 30) {
				changes++;
			}
            }
		return (changes >= 3);
	}
}
