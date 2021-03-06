package areafilters;

/**
 * 
 * Ein Filter, der das Bild vertikal spiegelt
 * @author Lukas Richter, Benedikt Ringlein
 *
 */
public class FlipYFilter extends AreaFilter {

	@Override
	protected int calculate(int[] pixels, int[] maskPixels, int index,
			int width, int height) {
		return pixels[XYtoI(ItoX(index, width), height-1-ItoY(index, width), width)];
	}
	
}
